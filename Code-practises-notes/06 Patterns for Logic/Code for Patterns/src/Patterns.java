public class Patterns {
    public static void main(String[] args) {
        System.out.print("Pattern 28: ");
        pattern28(5);
        System.out.println("Pattern 30: ");
        pattern30(5);
        System.out.println("Pattern 17: ");
        pattern17(5);
        System.out.println("Pattern 31: ");
        pattern31(5);
        System.out.println("Pattern 32: ");
        pattern32(5);
    }

    static void pattern28(int N) {
        for (int row = 0; row < 2 * N; row++) {
            int TotalcolumnElements = row > N ? 2 * N - row : row;
            int noOfspaces = N - TotalcolumnElements;
            for (int s = 0; s < noOfspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < TotalcolumnElements; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int M) {
        for (int rows = 1; rows <= M; rows++) {

            int spaces = M - rows;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int cols = rows; cols >= 1 ; cols--) { //For Left side of the pyramid
                System.out.print(cols + " "); //Printing the column number itself
            }
            for (int cols = 2; cols <= rows; cols++) { //For Right side of the pyramid
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int P) {
        for (int rows = 1; rows <= 2 * P; rows++) {
            int TotalC = rows > P ? 2 * P - rows : rows;
            for (int spaces = 0; spaces < P-TotalC; spaces++) {
                System.out.print("  ");
            }
            for (int cols = TotalC; cols >= 1 ; cols--) {
                System.out.print(cols + " ");
            }
            for (int cols = 2; cols <= TotalC; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int G) {
        int OrginalG = G;
        G = 2 * G;
        for (int rows = 0; rows <= G; rows++) {
            for (int cols = 0; cols <= G; cols++) {
                int atEveryIndex = OrginalG - Math.min(Math.min(rows, cols), Math.min(G - rows, G - cols)) ;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int G) {
        G = 2 * G;
        for (int rows = 0; rows <= G; rows++) {
            for (int cols = 0; cols <= G; cols++) {
                int atEveryIndex = Math.min(Math.min(rows, cols), Math.min(G - rows, G - cols)) ;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}