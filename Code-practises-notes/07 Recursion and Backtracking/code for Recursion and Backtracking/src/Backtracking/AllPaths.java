package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0, 0);
        System.out.println();
        int[][] path = new int[board.length][board[0].length];
        AllpathPrint("", board, 0, 0, path, 1);
    }
    static void allPath(String Processed, boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(Processed);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false; //Consider this is as the forward path

        if (row < maze.length-1) {
            allPath(Processed + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length-1) {
            allPath(Processed + 'R', maze, row, col + 1);
        }
        if (row > 0) {
            allPath(Processed + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            allPath(Processed + 'L', maze, row, col - 1);
        }

        // This line is where the functions gets over
        // So before the function gets removed, also remove the changes that were made by the function
        maze[row][col] = true;
    }

    static void AllpathPrint(String Processed, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(Processed);
            System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false; //Consider this is as the forward path
        path[row][col] = step;

        if (row < maze.length-1) {
            AllpathPrint(Processed + 'D', maze, row + 1, col, path, step+1);
        }
        if (col < maze[0].length-1) {
            AllpathPrint(Processed + 'R', maze, row, col + 1, path, step+1);
        }
        if (row > 0) {
            AllpathPrint(Processed + 'U', maze, row - 1, col, path, step+1);
        }
        if (col > 0) {
            AllpathPrint(Processed + 'L', maze, row, col - 1, path, step+1);
        }

        // This line is where the functions gets over
        // So before the function gets removed, also remove the changes that were made by the function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
