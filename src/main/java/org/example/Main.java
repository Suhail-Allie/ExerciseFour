package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        //Declare an array to hold values
        int[] scores = new int[100];
        int count = 0;
        int sum = 0;

        // Read scores from the user
        System.out.println("Enter scores (negative number to end):");
        //Make use of while loop
        while (true) {
            int score = input.nextInt();
            if (score < 0) break;
            if (count < 100) {
                scores[count++] = score;
                sum += score;
            }
        }
        //If statement
        if (count == 0) {
            System.out.println("No scores entered.");
            input.close();
            return;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Determine counts relative to the average
        int aboveOrEqualCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) aboveOrEqualCount++;
        }
        int belowCount = count - aboveOrEqualCount;

        // Output the results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + belowCount);

        input.close();
    }
}