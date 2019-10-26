package LeetCode;

import jdk.dynalink.NamedOperation;

import java.util.ArrayList;

public class L208 {
    public boolean isWord;
    public char word;
    public L208[] trees = new L208[26];
    public L208() {
        this.isWord =false;
        this.word = ' ';
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] chars = word.toCharArray();
        L208 node= this;
        for (int i=0;i<chars.length;i++){
            if (node.trees[chars[i] - 'a'] == null){
                node.trees[chars[i] - 'a'] = new L208();
            }
            node = node.trees[chars[i] - 'a'];
            node.word = chars[i];
            if (i == chars.length-1){
                node.isWord = true;
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        L208 node = this;
        for (int i=0;i<chars.length;i++){
            if (node.trees[chars[i] - 'a'] == null) return false;
            node = node.trees[chars[i] - 'a'];
            if (node.word != chars[i]) return false;
        }
        return node.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        L208 node = this;
        for (int i=0;i<chars.length;i++){
            if (node.trees[chars[i] - 'a'] == null) return false;
            node = node.trees[chars[i] - 'a'];
            if (node.word != chars[i]) return false;
        }
        return true;
    }
}
