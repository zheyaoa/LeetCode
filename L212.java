package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class L212 {
    public static void main(String[] args){
        char[][] chars = new char[][]{{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = new String[]{"oath","pea","eat","rain"};
    }
    public  List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        Set<String> result = new HashSet<>();
        for (String word:words){
            root.insert(word);
        }
        int m =  board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                find(board,m,n,visited,i,j,result,root);
            }
        }
        return new LinkedList<>(result);
    }
    public  void find(char[][] board,int m,int n,boolean[][] visited,int i,int j,Set<String> result,TrieNode root){
        if (i<0||i>=m||j<0||j>=n||visited[i][j]) return;
        visited[i][j] = true;
        root = root.childs[board[i][j]-'a'];
        if (root == null){
            visited[i][j] = false;
            return;
        }
        if (root.isleaf){
            result.add(root.word);
        }
        find(board,m,n,visited,i-1,j,result,root);
        find(board,m,n,visited,i+1,j,result,root);
        find(board,m,n,visited,i,j-1,result,root);
        find(board,m,n,visited,i,j+1,result,root);
        visited[i][j] = false;
    }
    public  class TrieNode{
        TrieNode[] childs = new TrieNode[26];
        String word = null;
        boolean isleaf = false;
        public void insert(String string){
            TrieNode cur = this;
            for (char c:string.toCharArray()){
                if (cur.childs[c-'a'] == null){
                    cur.childs[c-'a'] = new TrieNode();
                }
                cur = cur.childs[c-'a'];
            }
            cur.isleaf = true;
            cur.word = string;
        }
    }
}

