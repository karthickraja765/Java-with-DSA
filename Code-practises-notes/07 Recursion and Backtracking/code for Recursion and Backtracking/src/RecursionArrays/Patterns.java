package RecursionArrays;

public class Patterns {
    public static void main(String[] args) {
        pattern(5, 0);
        pattern1(5, 0);
    }
    static void pattern(int row, int col) {
        if(row == 0) {
            return;
        }
        //If column is the more than the rows then at that time print a new line and increase the row
        if(col < row) {
            System.out.print("* ");
            pattern(row, col + 1);
        }
        else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void pattern1(int row, int col){
        if(row == 0){
            return;
        }
        //If column is the more than the rows then at that time print a new line and increase the row
        if(col < row){
            pattern1(row, col + 1);
            System.out.print("* ");
        }
        else {
            pattern1(row - 1, 0);
            System.out.println();
        }
    }
}