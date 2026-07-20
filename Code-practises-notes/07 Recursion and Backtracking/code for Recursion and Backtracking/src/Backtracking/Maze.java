package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(mzeCount(3,3)); //Prints How many ways to go from point A to B

        mzePath("", 3, 3);

        System.out.println(mzePathRet("", 3, 3));

        System.out.println(mzeDiagonalPathRet("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mzeOsbtracles("", board, 0, 0);
    }

    static int mzeCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = mzeCount(row - 1, col);
        int right = mzeCount(row, col - 1);

        return left + right;
    }

    static void mzePath(String Processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(Processed);
            return;
        }
        if (row > 1) {
            mzePath(Processed + 'D', row - 1, col);
        }
        if (col > 1) {
            mzePath(Processed + 'R', row, col - 1);
        }
    }

    static ArrayList<String> mzePathRet(String Processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(mzePathRet(Processed + 'D', row - 1, col));
        }
        if (col > 1) {
            list.addAll(mzePathRet(Processed + 'R', row, col - 1));
        }
        return list;
    }

    static ArrayList<String> mzeDiagonalPathRet(String Processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(Processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && col > 1) {
            list.addAll(mzeDiagonalPathRet(Processed + 'D', row - 1, col -1));
        }
        if (row > 1) {
            list.addAll(mzeDiagonalPathRet(Processed + 'V', row - 1, col));
        }
        if (col > 1) {
            list.addAll(mzeDiagonalPathRet(Processed + 'H', row, col - 1));
        }
        return list;
    }

    static void mzeOsbtracles(String Processed, boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(Processed);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length-1) {
            mzeOsbtracles(Processed + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length-1) {
            mzeOsbtracles(Processed + 'R', maze, row, col + 1);
        }
    }
}