package LeetCode;

public class L125 {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome("Damosel, a poem? A carol? Or a cameo pale? (So mad!)"));
    }
    public static boolean isPalindrome(String s) {
        s =  s.replaceAll("[^a-zA-Z0-9]","");
        char[] chars = s.toCharArray();
        int start = 0,end = chars.length-1;
        while (start<=end){
            if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
