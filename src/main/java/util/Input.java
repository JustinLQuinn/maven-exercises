package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public String getString(){
        String info = scanner.nextLine();
        return info;
        //return scanner.nextLine(); for short version.
    }
    public boolean yesNo(){
        String text = getString();
        if(text.equalsIgnoreCase("yes") || text.equalsIgnoreCase("y")){
            return true;
        }
            return false;
    }
    public int getInt(int min, int max) {
        //print prompt
//        System.out.println("Enter number between 1-48000.");
        //save int from scanner
        int userInt = scanner.nextInt();
        //check if int is outside min and max
        if (userInt < min || userInt > max) {
            //if outside range ask again
            System.out.println("Not correct number, please try again.");
            userInt = getInt(min, max);
        }
         // return if within range
        return userInt;
    }
    public int getInt() {

        System.out.println("Enter an Integer.");
//         boolean var = scanner.hasNextInt();
//          if(var){
//              return scanner.nextInt();
//          }
//          return 0;
        String var = getString();
        try {
            return Integer.parseInt(var);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Your entry was not of an Integer value " + e.getMessage());
        }
        return getInt();
    }
    public double getDouble(double min, double max){
        //print prompt
        System.out.println("Enter number with a decimal.");
        //save double from scanner
        double userNum = scanner.nextDouble();
        //check if int is outside min and max
        if (userNum < min || userNum > max) {
        //if outside range ask again
            System.out.println("Not correct number, please try again.");
            userNum = getDouble(min, max);
        }
        // return if within range
            return userNum;
    }
    public double getDouble(){
        System.out.println("Enter a double equivalent number.");
//        boolean var = scanner.hasNextDouble();
//        if(var){
//            return scanner.nextDouble();
////            scanner.nextLine();
//        }
//        return 0;
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Your entry was not of a double value " + e.getMessage());
        }
        return getDouble();
    }


    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt());
//        System.out.println(input.getInt(1, 48000));
//        System.out.println(input.getDouble());
//        System.out.println(input.getDouble(1, 32000000));

    }
}
