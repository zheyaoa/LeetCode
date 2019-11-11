package LeetCode;

import javafx.util.Pair;

import java.util.*;

public class L127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int size = beginWord.length();
        Map<String, ArrayList<String>> dict = new HashMap<>();
        wordList.forEach(word -> {
            for (int i = 0; i < size; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, size);
                ArrayList<String> tmp = dict.getOrDefault(newWord, new ArrayList<String>());
                tmp.add(word);
                dict.put(newWord, tmp);
            }
        });

        Queue<Pair<String, Integer>> queue = new LinkedList<Pair<String, Integer>>();
        queue.add(new Pair(beginWord, 1));

        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!queue.isEmpty()) {
            Pair<String, Integer> node = queue.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < size; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, size);
                for (String adjacentWord : dict.getOrDefault(newWord, new ArrayList<String>())) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        queue.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }
        return 0;
    }
}
