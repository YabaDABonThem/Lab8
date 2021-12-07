// Name : Allen Bao
// Date : 12/6/21
// Description: CS210, BC; a simple program demonstrating the
// use of arrays

// inputs that break code are non numerical characters, decimals, and negative/zero numbers.

import java.util.Scanner;
import java.util.Random;

public class ArrayOfExamScores {

    // The main method
    public static void main(String[] args) {
        
        // Create scanner and get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many students are in the class? ");
        int numStudentsInClass = keyboard.nextInt();
        
        // Ceate array of ints with the length the user specified
        int[] arrayOfTestScores = new int[numStudentsInClass];

        // Create Random object to fill up the array we created with random ints
        Random random = new Random();
        // Create varible to hold the running total, to calculate the average score
        int runningTotal = 0;
        // Create variables to hold the max and min score, as well as the number of the students with those scores.
        int maximumScore = 0; // max score starts at zero so that no number that is compared can be less than it.
        int minimumScore = 100; // min score stars at 100 so that no number compared to it can be greater.
        int maximumScoreStudent = 0; // Both the max and min score in the class start from the first person.
        int minimumScoreStudent = 0;
        
        for (int i = 0; i < arrayOfTestScores.length; ++i) {
           // Fill up the array with a randomly generated number
           arrayOfTestScores[i] = random.nextInt(101); // 101 because nextInt only generates numbers between 0 and the upperbound - 1
           
           // Print the student number and the score that you just generated
           System.out.println("Student number " + (i+1) + " has a score of " + arrayOfTestScores[i]);
           
           // Add that score to the running total
           runningTotal += arrayOfTestScores[i];
           
           // Check if the score is a max or min, and set the max/min to the new score and student if it is one. 
           if (arrayOfTestScores[i] > maximumScore) {
               maximumScore = arrayOfTestScores[i];
               maximumScoreStudent = i+1;
           }
           
           if (arrayOfTestScores[i] < minimumScore) {
               minimumScore = arrayOfTestScores[i];
               minimumScoreStudent = i+1;
           }
        }
        
        // Print the average score, along with the high and low scoring students and their scores. 
        // Average is calculated by converting the runningTotal to a double to avoid integer division and dividing it by numStudentsInClass.
        System.out.println("The average score in the class was " + (double) runningTotal / numStudentsInClass);
        System.out.println("Student number " + maximumScoreStudent + " had the highest score with " + maximumScore + " points");
        System.out.println("Student number " + minimumScoreStudent + " had the lowest score with " + minimumScore + " points");
        
    }
}
