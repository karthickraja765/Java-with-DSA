import java.util.Scanner;

public class Basicprograms {
    public static void main(String[] args) {

        // Switch statements
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // Prime number program
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        System.out.println(isPrime(n));

        // Celsius to Fahrenheit program
        Scanner input2 = new Scanner(System.in);
        int cel = input2.nextInt();
        float ans = convertC2F(cel);
        System.out.println(ans);

        // Largest number among 3 numbers
        Scanner input3 = new Scanner(System.in);
        int num1 = input3.nextInt();
        int num2 = input3.nextInt();
        int num3 = input3.nextInt();
        int answer = largestAmong3(num1, num2, num3);
        System.out.println(ans);

        // Alpha-case check for a sentence.
        String string = "I think this is upper case";
        caseCheck(string);

        // Fibbonacci series check
        int fibocount = fibbonacci(8);
        System.out.println("Fibbo count(normal): " + fibocount);

        // Fibbonacci series check using Recursion
        System.out.println(fibbo(8));

        // Reverse a number
        System.out.println(reverseNum(14324));

        // Counting occurances
        System.out.println(countingOcc(121212922, 2));

        // Armstrong number
        System.out.println(isArmstrong(371));
    }

    // Functions...
    
    public static Boolean isPrime(int n) {
        Boolean flag = false;

        if (n <= 1) {
            System.out.println("Number is either prime nor composite");
            return false;
        }

        int c = 2;
        while(c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static float convertC2F(int celsius) {
        float cel = (float) celsius;
        float fah = (cel * 9 / 5) + 32;
        return fah;
    }

    public static int largestAmong3(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void caseCheck(String string) {
        char ch = string.trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } 
    }

    public static int fibbonacci(int number) {
        int first = 0;
        int second = 1;
        int count = 2;
        while (count <= number) {
            int temp = second;
            second = second + first;
            first = temp;
            count++;
        }
        return second;
    }

    public static int fibbo(int number) {
        if (number < 2) {
            return number;
        }
        return fibbo(number - 1) + fibbo(number - 2);
    }

    public static int reverseNum(int num) {
        int org = num;
        int revNum = 0;

        while (org != 0) {
            int rem = org % 10;
            revNum = revNum * 10 + rem;
            org /= 10;
        }
        return revNum;
    }
     
    public static int countingOcc(int num, int occ) {
        int org = num;
        int occCount = 0;

        while (org != 0) {
            int rem = org % 10;
            if (rem == occ) occCount++;
            org /= 10;
        }
        return occCount;
    }

    private static boolean isArmstrong(int num) {
        int org = num; // this will be zero once the armstrong logic is applied.
        int orgC = num; // this will be changed once the count is found.
        int count = 0;
        int armno = 0;

        while (orgC != 0) {
            count++;
            orgC /= 10;
        }
        while (org != 0) {
            int rem = org % 10;
            armno = (int) (armno + (Math.pow(rem, count)));
            org /= 10;
        }
        return num == armno;
    }
}