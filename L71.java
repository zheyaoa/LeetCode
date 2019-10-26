package LeetCode;

import java.util.Stack;

public class L71 {
    public static void main(String[] args){
        String s = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(s));
    }
    public static String simplifyPath(String path) {
        String[] part = path.split("/+");
        Stack<String> stack = new Stack<>();
        for (String s:part){
            if (s.length() == 0||s.equals(".")) continue;
            if (s.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            }else {
                stack.push(s);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir:stack){
            result.append("/").append(dir);
        }
        String r = result.toString();
        return r.length()==0?"/":r;
    }
}
