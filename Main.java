package LeetCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        char[][] island =  {{'1','1','0','0','0'},
                            {'1','1','0','0','0'},
                            {'0','0','1','0','0'},
                            {'0','0','0','1','1'}};
        new L200().numIslands(island);
    }
}
