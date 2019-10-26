package LeetCode;

import java.util.*;

public class L227 {
    public static void main(String[] args){
        System.out.println(calculate("0/1"));
    }
    public static int calculate(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        char c = '+';
        for (int i=0;i<chars.length;i++){
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
            }else if (chars[i] != ' '){
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
