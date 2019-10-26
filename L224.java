package LeetCode;

import java.util.Stack;

public class L224 {
    public static void main(String[] args){
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
    public static int calculate(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        char c = '+';
        for (int i=0;i<chars.length;i++){
            if (chars[i] == ' ')continue;
            if (Character.isDigit(chars[i])){
                int tmp = 0;
                while (i<chars.length && Character.isDigit(chars[i])){
                    int t = chars[i] - '0';
                    tmp = tmp*10+t;
                    i++;
                }
                i--;
                if (!stack.empty()){
                    if (c == '*' || c == '/'){
                        int top = stack.pop();
                        tmp = c == '*'? tmp*top:top/tmp;
                    }else if (c == '-'){
                        tmp *= -1;
                    }
                }
                stack.push(tmp);
            } else if (chars[i] == '('||chars[i] == ')'){
                if (chars[i] == '('){
                    int left = i;
                    count++;
                    while (count != 0){
                        i++;
                        if (chars[i] == '(') count++;
                        else if (chars[i] == ')') {
                            count--;
                            if (count == 0) break;
                        }
                    }
                    int tmp = calculate(String.valueOf(chars).substring(left+1,i));
                    if (!stack.empty()){
                        if (c == '*' || c == '/'){
                            int top = stack.pop();
                            tmp = c == '*'? tmp*top:top/tmp;
                        }else if (c == '-'){
                            tmp *= -1;
                        }
                    }
                    stack.push(tmp);
                }
            }else{
                c = chars[i];
            }
        }
        while (stack.size() != 1){
            int end = stack.pop();
            int front = stack.pop();
            stack.push(front+end);
        }
        return stack.pop();
    }
}
