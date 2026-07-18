public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern 1: ");
        pattern1(4);
        System.out.println("Pattern 2: ");
        pattern2(4);
        System.out.println("Pattern 3: ");
        pattern3(4);
        System.out.println("Pattern 4: ");
        pattern4(5);
        System.out.println("Pattern 5: ");
        pattern5(5);
    }
    static void pattern1(int m) {
        for (int rows = 0; rows <= m; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println(); //After each Printed row, We need to add a new line for new Row.
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row <= n; row++) { //for every row, Run the column.
            for (int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println(); //After each Printed row, We need to add a new line for new Row.
        }
    }

    static void pattern3(int p) {
        for (int row = 0; row <= p; row++) {
            for (int col = 0; col <= 2*row; col++) {
                System.out.print("* ");
            }
            //After each Printed row, We need to add a new line for new Row.
            System.out.println();
        }
    }

    static void pattern4(int Q) {
        for (int row = 1; row <= Q; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " "); //Printing the col number
            }
            System.out.println();
        }
    }

    static void pattern5(int R) {
        for (int row = 0; row < 2 * R; row++) {
            int TotalcolumnElements = row > R ? 2 * R - row : row;
            //This above line tells: Total Number of Elements in the column of each row. if (Row > R) then TotalcolumnElements is 2*R - row, else TotalcolumnElements is equals row.
            for (int col = 0; col < TotalcolumnElements; col++) {
                System.out.print("* ");
            }
            //After each Printed row, We need to add a new line for new Row.
            System.out.println();
        }
    }
}