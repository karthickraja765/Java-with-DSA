import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
        String days = input.next();

        //type 1
//        switch (fruit){
//            case "apple":
//                System.out.println("its a iphone?");
//                break;
//            case "orange":
//                System.out.println("is it apple's competator?LOL");
//                break;
//            case "grape":
//                System.out.println("its my favourite :>");
//                break;
//            case "mango":
//                System.out.println("Ultimate favss");
//                break;
//            default:
//                System.out.println("PLEASE ENTER THE VALID FRUIT NAME!!!");

        //type 2
        switch (days) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("WEEKDAY");
            case "saturday", "sunday" -> System.out.println("WEEKEND");
        }
        }
    }

