package LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class L295 {
    /** initialize your data structure here. */
    Queue<Integer> minQueue = null;
    Queue<Integer> maxQueue = null;
    int count = 0;
    public L295() {
        minQueue = new PriorityQueue<>();
        maxQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2-t1;
            }
        });
    }

    public void addNum(int num) {
        count++;
        if(count % 2 == 1){
            maxQueue.offer(num);
            int max =  maxQueue.poll();
            minQueue.offer(max);
        }else{
            minQueue.offer(num);
            int min = minQueue.poll();
            maxQueue.offer(min);
        }
    }

    public double findMedian() {
        if (count % 2 == 0){
            return (double) (maxQueue.peek() + minQueue.peek())    /2;
        }else {
            return minQueue.peek();
        }
    }
}
