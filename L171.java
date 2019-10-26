package LeetCode;

public class L171 {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0;i<chars.length;i++){
            result = result*26 + chars[i] - 'A' + 1;
        }
        return result;
    }
}
