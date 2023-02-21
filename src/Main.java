import java.util.Scanner;
import java.io.*;
import java.util.*;
class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }



    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userDouble = Double.parseDouble(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }

        return userDouble;
    }
    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "0";
        boolean isString = false;

        while (!isString) {
            try {
                userString = String.valueOf(Double.parseDouble(userInput));
                userString = String.valueOf(Integer.parseInt(userInput));
                System.out.println(userInput + " is not a valid string. " + message);
                userInput = scanner.nextLine();
                isString = false;
            }
            catch (NumberFormatException e) {
                userString=userInput;
                isString=true;
            }
        }

        return userString;
    }
}

public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();

        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("your integer "+aNumber);

        double bNumber = input.promptDouble("Enter an double.");
        System.out.println("your double is "+bNumber);

        String cNumber = input.promptString("Enter an string.");
        System.out.println("your string is "+cNumber);

    }
}