/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */


package ex31;
import java.util.Scanner;

public class App 
{
    public static void printResults(int age, int restingHeartRate, double intensity) {
        double targetHeartRate;
        System.out.printf("%s %s", "Intensity |", "Rate\n");
        System.out.printf("%s %s", "--------- |", "---------\n");
        while(intensity <= 95) {
            targetHeartRate = (((220 - age) - restingHeartRate) * (intensity/100)) + restingHeartRate;
            System.out.printf("%d %8s %d bpm\n", (int) intensity, "|", (int) targetHeartRate);
            intensity += 5;
        }
    }
    public static void main( String[] args )
    {
        int age = -1;
        int restingHeartRate = -1;
        double intensity = 55;
        String userInput;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        while(age == -1) {
            userInput = input.next();
            if(InputValidator.isNumeric(userInput))
                age = Integer.parseInt(userInput);
            else
                System.out.println(userInput + " is not a number. Please try again.");
        }
        System.out.print("What is your resting heart rate? ");
        while(restingHeartRate == -1) {
            userInput = input.next();
            if(InputValidator.isNumeric(userInput))
                restingHeartRate = Integer.parseInt(userInput);
            else
                System.out.println(userInput + " is not a number. Please try again.");
        }
        printResults(age, restingHeartRate, intensity);
    }
}
