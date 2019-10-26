package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L929 {
    public static void main(String[] args){
        String[] strings = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(strings);
    }
    public static int numUniqueEmails(String[] emails) {
        Map<String,Integer> map = new HashMap();
        for (int i=0;i<emails.length;i++){
            String string = emails[i];
            int index = string.indexOf("@");
            String host = string.substring(index);
            String rest = string.substring(0,index);
            rest = rest.replaceAll("\\.","");
            if(rest.contains("+")){
                rest = rest.substring(0,rest.indexOf("+"));
            }
            map.put(host+rest,1);
        }
        return map.size();
    }
}
