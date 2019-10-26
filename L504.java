package LeetCode;

public class L504 {
    public static void main(String[] args){
        System.out.println(convertToBase7(-100));
    }
    public static String convertToBase7(int num) {
        if(num == 0) return  "0";
        String flag = "";
        if (num<0){
            flag = "-";
            num*=-1;
        }
        StringBuilder result = new StringBuilder("");
        while (num != 0){
            result.append(num % 7);
            num /= 7;
        }
        return flag+result.reverse();
    }

}
