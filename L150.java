package LeetCode;

import java.util.Stack;

public class L150{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int tmp;
        for (String token:tokens){
            switch (token){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    tmp = stack.pop();
                    stack.push(stack.pop()-tmp);
                    break;
                case  "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case  "/":
                    tmp = stack.pop();
                    stack.push(stack.pop()/tmp);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
