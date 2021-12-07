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
                

        
        
        // Because arrays indices begin at 0, you are using "(i+1)" to print to the screen
        // the array index, but incremented by 1, so that array index 0 corresponds to
        // person 1, array index 1 corresponds to person 2, array index 3 corresponds
        // to person 3, etc.
        
        
        
        
        
        System.out.println("The average score in the class was " + (double) runningTotal / numStudentsInClass);
        System.out.println("Student number " + maximumScoreStudent + " had the highest score with " + maximumScore + " points");
        System.out.println("Student number " + minimumScoreStudent + " had the lowest score with " + minimumScore + " points");
        
        
        
        
        
        
        // Print to the screen, the maximum exam score in your array, as well as
        // the person (index) who has the highest score. To do this, first define two variables
        // of type int. Name one of those variables maximumScore, and the other maximumScoreStudent.
        // Then, again iterate through the elements of your array using the for-loop
        // that has been given to you. In the body of the for loop, which will be executed
        // during each iteration of the for loop, check if the value at position i is
        // greater than the currently seen largest value stored in the variable maximumScore.
        // If yes, then update the variables maximumScore and maximumScoreStudent. The code
        // that you want to write into the body of your for loop is the following:
        // 
        // if (arrayOfTestScores[i] > maximumScore){
        //   maximumScore = arrayOfTestScores[i];
        //   maximumScoreStudent = i+1;
        // }
        // 
        // After you've determined the maximumScore and maximumScoreStudent,
        // use a System.out.println statement to print that value to the
        // screen.
    }
}
