package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class L207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        for (int[] cp:prerequisites){
            indegrees[cp[0]]++;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegrees[i] == 0) queue.addLast(i);
        }
        while (!queue.isEmpty()){
            Integer pre = queue.removeFirst();
            numCourses--;
            for (int[] cp:prerequisites){
                if (cp[1] != pre) continue;
                if (--indegrees[cp[0]] == 0){
                    queue.add(cp[0]);
                }
            }
        }
        return numCourses==0;
    }
}
