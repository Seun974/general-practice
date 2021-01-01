package se.lexicon.samuel;


import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {

        boolean decimalChecker = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(decimalChecker);

    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int numberOne = (int) (number1 * 1000);
        int numberTwo = (int) (number2 * 1000);
        return (numberOne == numberTwo);
    }
}


//  Tutorial for speed converter EXERCISE 1
//    long convertedToMilesPerHour;
//    convertedToMilesPerHour = toMilesPerHour(-5.6);
//        System.out.println("values is: " + convertedToMilesPerHour);
//
//    printConversion(75.114);
//
//}
//     methods returning a kind of value, return statement works fine
//    public static long toMilesPerHour(double kilometersPerHour) {
//        long valueToMilesPerHour;
//        if (kilometersPerHour < 0) {
//            return -1;
//        } else {
//            valueToMilesPerHour = Math.round(kilometersPerHour * 0.6215);
//            return valueToMilesPerHour;
//        }
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        long milesPerHour;
//        if (kilometersPerHour < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            milesPerHour = Math.round(kilometersPerHour * 0.6215);
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//        }
//    }
//======================================================================================================================
//METHOD EXERCISE 2 MEGABYTES
//printMegaBytesAndKiloBytes(2500);
//
//}
    //for methods returning void, you can use print statement to return the value
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        if (kiloBytes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            //to convert in this exercise, just divide by the value
//            int calculateMegaBytes = (kiloBytes / 1024);
//            //and use the modulus to transfer the remainder in bytes and just assign
//            int remainingMegaBytes = kiloBytes % 1024;
//            System.out.println(kiloBytes + " KB = " + calculateMegaBytes + " MB " + "and " + remainingMegaBytes + " KB");
//        }
//    }
//======================================================================================================================
//Exercise 3 Barking dog
//boolean status = shouldWakeUp(false, 6);
//        System.out.println(status);
//}
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (hourOfDay < 0 || hourOfDay > 23){
//            return false;
//        }else if(barking && hourOfDay < 8 || hourOfDay > 22){
//            return true;
//        }else {
//            return false;
//        }
//    }
//======================================================================================================================
//
// EXERCISE 4 LEAP YEAR CHECKER
// boolean yearChecker;
//    yearChecker = isLeapYear(1800);
//        System.out.println(yearChecker);
//
//}
//    public static boolean isLeapYear(int year){
//        if(year < 1 || year > 9999){
//            return false;
//            //if the year is 1. If the year is evenly divisible by 4, go to step
//            //2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
//            //3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
//            //4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
//            //5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
//        }else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            return true;
//        }
//        return false;
//    }
//======================================================================================================================
//  tutorial for methods
//    //method 1 - passing the method straight into the position
//    displayHighScorePosition("tim", calculateHighScorePosition(50));
//        displayHighScorePosition("Jeremy", calculateHighScorePosition(900));
//        displayHighScorePosition("Jael", calculateHighScorePosition(1500));
//        displayHighScorePosition("Mike", calculateHighScorePosition(400));
//
//        int position = calculateHighScorePosition(50);
//        displayHighScorePosition("Sam", position);
//        position = calculateHighScorePosition(700);
//        displayHighScorePosition("Jake", position);
//
//        position = calculateHighScorePosition(1450);
//        displayHighScorePosition("Joan", position);
//
//        }
//
//public static void displayHighScorePosition (String playerName, int position) {
//        System.out.println("Player " + playerName + " managed to get into position " + position + " on the high score table.");
//
//        }
//public static int calculateHighScorePosition(int playerScore) {
////        if (playerScore >= 1000){
////            return 1;
////        } else if (playerScore >= 500){
////            return 2;
////        } else if(playerScore >= 100){
////            return 3;
////        }
////            return 4;
////        }
//        int position = 4;
//        if (playerScore >= 1000){
//        position = 1;
//        } else if( playerScore >= 500){
//        position = 2;
//        } else if (playerScore >= 100){
//        position = 3;
//        }
//        return position;
//        }
//        }
