package OOP6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b);
            String name = "Justin";
            if (name == "Justin") {
                throw new CustomException("This name is Justin!");
            }
        }
        catch (CustomException e) {  // customException
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) { // If there is an exception in any of the try block. It will catch and prints the message.
            // you can also add more than one catch
            System.out.println(e.getMessage());
        }
        catch (Exception e) { // If there is an exception in any of the try block. It will catch and prints the message.
            // Note: Add the normal Exception catch at the last and add the specific exceptions above it.
            // Because every exception can be caught in the Normal ones.
            // so if u put this above the specific exceptions, the below exceptions will not run.
            System.out.println("This is a normal exception");
        } finally {
            System.out.println("No matter what happens this will always execute");
        }
    }
    // throws means it may throw an Exception if you run this method,
    // throw means explicitly saying there is an exception.
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}