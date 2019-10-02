/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */


        System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();

        System.out.print("Enter your grade: ");
        String grade = in.nextLine();

        System.out.print("Enter your age: ");
        String age = in.nextLine();

        System.out.print("Enter your hometown: ");
        String town = in.nextLine();



        System.out.printf("\nNAME     : %s %s\n", firstName, lastName);
        System.out.printf("GRADE    : %s\n", grade);
        System.out.printf("AGE      : %s\n", age);
        System.out.printf("HOMETOWN : %s\n", town);


        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */


        final double DOLLAR = 1.00;
        final double QUARTER = 0.25;
        final double DIME = 0.10;
        final double NICKEL = 0.05;



        System.out.print("\nEnter a dollar amount: ");
        double value = in.nextDouble();



        double dollarsAmount = Math.floor(value/Dollar);
        value -= dollarsAmount*Dollar;

        double quartersAmount = Math.floor(value/Quarter);
        value -= quartersAmount*Quarter;

        double dimesAmount = Math.floor(value/Dime);
        value -= dimesAmount*Dime;

        double nickelAmount = Math.floor(value/Nickel);
        value -= nickelAmount*Nickel;

        double pennyAmount = Math.floor(value/0.01);



        System.out.printf("\nDOLLARS  : %.0f\n", dollarsAmount);
        System.out.printf("QUARTERS : %.0f\n", quartersAmount);
        System.out.printf("DIMES    : %.0f\n", dimesAmount);
        System.out.printf("NICKELS  : %.0f\n", nickelAmount);
        System.out.printf("PENNIES  : %.0f\n\n", pennyAmount);


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */


        final double TWENTY_DOLLAR = 20.00;
        final double TEN_DOLLAR = 10.00;
        final double FIVE_DOLLAR = 5.00;



        System.out.print("Enter a dollar amount: ");
        value = in.nextDouble();



        double twentiesNeeded = Math.floor(value/TWENTY_DOLLAR);
        value -= twentiesNeeded*TWENTY_DOLLAR;

        double tensNeeded = Math.floor(value/TEN_DOLLAR);
        value -= tensNeeded*TEN_DOLLAR;

        double fivesNeeded = Math.floor(value/FIVE_DOLLAR);
        value -= fivesNeeded*FIVE_DOLLAR;

        dollarsAmount = Math.floor(value/Dollar);
        value -= dollarsAmount*Dollar;

        quartersAmount = Math.floor(value/Quarter);
        value -= quartersAmount*Quarter;

        dimesAmount = Math.floor(value/Dime);
        value -= dimesAmount*Dime;

        nickelAmount = Math.floor(value/Nickel);
        value -= nickelAmount*Nickel;

        pennyAmount = Math.floor(value/0.01);



        double billsTotal = twentiesNeeded+tensNeeded+fivesNeeded+dollarsAmount;
        double coinsTotal = quartersAmount+dimesAmount+nickelAmount+pennyAmount;



        System.out.printf("\nBILLS : %.0f\n", billsTotal);
        System.out.printf("COINS : %.0f\n\n", coinsTotal);


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */


        final double MILES_TO_IN = 63360;
        final double YARDS_TO_IN = 36;
        final double FEET_TO_IN = 12;



        System.out.print("Enter a number of inches: ");
        double inches = in.nextDouble();



        double miles = Math.floor(inches/MILES_TO_IN);
        inches -= miles*MILES_TO_IN;

        double yards = Math.floor(inches/YARDS_TO_IN);
        inches -= yards*YARDS_TO_IN;

        double feet = Math.floor(inches/FEET_TO_IN);
        inches -= feet*FEET_TO_IN;

        System.out.printf("\nMILES  : %.0f\n", miles);
        System.out.printf("YARDS  : %.0f\n", yards);
        System.out.printf("FEET   : %.0f\n", feet);
        System.out.printf("INCHES : %.0f\n\n", inches);


        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */


        final double KILO_TO_CENTI = 100000;
        final double METERS_TO_CENTI = 100;



        System.out.print("Enter a number of centimeters: ");
        double centis = in.nextDouble();



        double kilos = Math.floor(centis/KILO_TO_CENTI);
        centis -= kilos*KILO_TO_CENTI;

        double meters = Math.floor(centis/METERS_TO_CENTI);
        centis -= meters*METERS_TO_CENTI;



        System.out.printf("\nKILOMETERS  : %.0f\n", kilos);
        System.out.printf("METERS      : %.0f\n", meters);
        System.out.printf("CENTIMETERS : %.0f\n\n", centis);


        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("Enter a diameter: ");
         double diameter = in.nextDouble();
         double radius = diameter/2;



         double circArea = Math.PI*Math.pow(radius, 2);
         double circCircumference = 2*Math.PI*radius;



         System.out.printf("\nAREA          : %.2f\n", circArea);
         System.out.printf("CIRCUMFERENCE : %.2f\n\n", circCircumference);


        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
         System.out.print("Enter a length: ");
         double rectLength = in.nextDouble();

         System.out.print("Enter a width: ");
         double rectWidth = in.nextDouble();



         double rectArea = rectLength*rectWidth;
         double rectPerim = 2*rectLength+2*rectWidth;
         double rectDiag = Math.hypot(rectLength, rectWidth);



         System.out.printf("\nAREA      : %.2f\n", rectArea);
         System.out.printf("PERIMETER : %.2f\n", rectPerim);
         System.out.printf("DIAGONAL  : %.2f\n\n", rectDiag);



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */




        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */




        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



    }
}
