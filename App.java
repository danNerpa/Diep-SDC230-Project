/*
 * Name: Dan D.
 * Date: 3/3/2026
 * Assignment SDC230L Week 1 Project - User Interactions and I/O
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intVal1, intVal2, intSum;
        double fltVal1, fltVal2, fltDiff;
        int loop = 1;

        //Print a welcome message and a navigation menu for the user.
        System.out.println("\nWelcome to my program!\nPlease select an option:");
        
        //Establish a loop to keep the user inside the program until they exit using the pre-determined value.
        while (loop != 0) {
            //Menu text
            System.out.println("\n1)Addition\n2)Subtraction\n3)Exit");

            int userChoice = input.nextInt();

            if (userChoice == 1) {
                //Addition using integers
                System.out.println("Input your first value: ");
                intVal1 = input.nextInt();

                System.out.println("Input your second value: ");
                intVal2 = input.nextInt();

                intSum = intVal1 + intVal2;

                System.out.printf("%d + %d = %d", intVal1, intVal2, intSum);
            } else {
                if (userChoice == 2) {
                    //Subtraction using floats
                    System.out.println("Input your first value: ");
                    fltVal1 = input.nextDouble();

                    System.out.println("Input your second value: ");
                    fltVal2 = input.nextDouble();

                    fltDiff = fltVal1 - fltVal2;

                    System.out.printf("%.2f - %.2f = %.2f", fltVal1, fltVal2, fltDiff);
                } else {
                    if (userChoice == 3) {
                        //Exit code with goodbye message.
                        System.out.println("Goodbye!");
                        loop = 0;
                        System.exit(0);
                    } else {
                        //Invalid response check with message.
                        System.out.println("Invalid Input!");
                    }
                }
            }
        }
    }
}