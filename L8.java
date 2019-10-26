package LeetCode;

public class L8 {
    public static void main(String[] args){
        System.out.println(myAtoi("-91283472332"));
    }
    public static int myAtoi(String str) {
        char[] chars = str.toCharArray();
        long result = 0;
        int flag = 1;
        int i = 0;
        while(chars[i] == ' '){
            i++;
        }
        if (i<chars.length && (chars[i] == '+' || chars[i] == '-')) {
            flag = chars[i] == '+' ? 1 : -1;
            i++;
        }
        while (i<chars.length && chars[i] >='0' && chars[i] <='9') {
            result = result*10 + chars[i]-'0';
            i++;
            if (flag == 1 && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (flag == -1 && result > Integer.MAX_VALUE)
                return Integer.MIN_VALUE;

        }
        return  flag*(int)result;
    }
}
