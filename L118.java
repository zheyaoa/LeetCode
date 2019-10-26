package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L118 {
    public static void main(String[] args){
        generate(3);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int row = 1;
        while(row<=numRows){
            List<Integer> tmp = new ArrayList<Integer>();
            if(row<=2){
                for(int i=0;i<row;i++){
                    tmp.add(1);
                }
            }else{
                for(int i=0;i<row;i++){
                    tmp.add(1);
                }
                List<Integer> t = list.get(row-2);
                for (int i=1;i<numRows-1;i++){
                    tmp.set(i,t.get(i)+t.get(i-1));
                }
            }
            list.add(tmp);
            row++;
        }
        return list;
    }
}
