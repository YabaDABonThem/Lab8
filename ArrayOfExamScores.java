// Name : Allen Bao
// Date : 12/6/21
// Description: CS210, BC; a simple program demonstrating the
// use of arrays

// inputs that break code are non numerical characters, decimals, and negative numbers.

import java.util.Scanner;
import java.util.Random;

public class ArrayOfExamScores {

    // The main method
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many students are in the class? ");
        int numStudentsInClass = keyboard.nextInt();
        
        int[] arrayOfTestScores = new int[numStudentsInClass];

        Random random = new Random();
        int runningTotal = 0;
        int maximumScore = 0;
        int minimumScore = 100;
        int maximumScoreStudent = 0;
        int minimumScoreStudent = 0;
        
        for (int i = 0; i < arrayOfTestScores.length; ++i) {
           arrayOfTestScores[i] = random.nextInt(101); // 101 because nextInt only generates numbers between 0 and the upperbound - 1
           System.out.println("Student number " + (i+1) + " has a score of " + arrayOfTestScores[i]);
           runningTotal += arrayOfTestScores[i];
           
           if (arrayOfTestScores[i] > maximumScore) {
               maximumScore = arrayOfTestScores[i];
               maximumScoreStudent = i+1;
           }
           if (arrayOfTestScores[i] < minimumScore) {
               minimumScore = arrayOfTestScores[i];
               minimumScoreStudent = i+1;

           }
        }
        
        System.out.println("The average score in the class was " + (double) runningTotal / numStudentsInClass);
        System.out.println("Student number " + maximumScoreStudent + " had the highest score with " + maximumScore + " points");
        System.out.println("Student number " + minimumScoreStudent + " had the lowest score with " + minimumScore + " points");
        
    }
}
