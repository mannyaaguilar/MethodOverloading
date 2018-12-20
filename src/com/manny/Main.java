package com.manny;

public class Main {

    public static void main(String[] args) {
        // Method Overloading is very commonly used in Java.
        //It's when you use the same method name, but with different parameters.
        int newScore = calculateScore("Manny", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters <0.0 ){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
            System.out.println("No Player name, no player score.");
            return 0;
    }

    //When we're overloading a method we need to create a unique method signature
    //The unique part is the method name, but especially in the parameters
    //You can create methods with the same name, and overload them
    // by specifying different parameters inside the method (aka *Method Signature*)

    // Challenge!
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters
    // Feet is the first parameter, inches is the second parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the second parameter inches is >= 0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimeters
    // comprise the feet and inches passed to the method and return that value
    //
    // Create a second method of the same name, but with only one parameter
    // inches is the parameter
    // validate that it's >= 0
    //return -1 if it's not true
    //
    // But, if it is valid, then calculate how many feet are in the inches
    // Here is the tricky part...
    // Call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly
    //
    // hints:
    // Using double for your number data types is probably a good idea
    // 1 inch = 2.54 centimeters and one foot = 12 inches


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || ((inches < 0 ) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            //returning -1 is a good way of validating your calculations are correct
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches <0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
