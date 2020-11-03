package Exercise_7_1;

import java.util.Scanner;

public class Calculations {

    public static void scores(){



        System.out.println("Please enter number of students: ");
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];

        int bestScore = 0;

        System.out.println("Please enter" + numberOfStudents + "scores");

        for (int i = 0; i <scores.length ; i++) {
            scores[i] = input.nextInt();
            if (bestScore < scores[i])
            { bestScore = scores[i]; }

        }

        char grade;
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] >= bestScore - 5)
                grade = 'A';
            else if (scores[i] >= bestScore - 10)
                grade = 'B';
            else if (scores[i] >= bestScore - 15)
                grade = 'C';
            else if (scores[i] >= bestScore - 20)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i +" score is " + scores[i] +" and grade is " + grade);
            
        }


    }
}
