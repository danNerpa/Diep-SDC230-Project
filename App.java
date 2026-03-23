/*
 * Name: Dan D
 * Date: 3/21/2026
 * Assignment SDC230L Week 3 Project - Arrays and Lists
 */

import java.util.Scanner;


public class App {
    //Declaring and intializing variables.
    static int programLoop = 1;
    static int choice = 0;
    static int mainLoop = 0;
    static int subLoopOne = 0;
    static int subLoopTwo = 0;
    static int subLoopThree = 0;
    static int userNum;

    //Create a numeral objects
    static Numeral num1 = new Numeral(100);
    static NumeralArray numArray = new NumeralArray(10);

    //Create a scanner object for user input
    static Scanner input = new Scanner(System.in);
    static Scanner text = new Scanner(System.in);

    //Display menu method
    public static void displayMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1) One Value");
        System.out.println("2) Ten Values");
        System.out.println("3) Exit");
        System.out.print("Enter a number: ");
    }

    //Display "One Value" menu method
    public static void displaySubMenuOne() {
        System.out.println("\nOne Value:");
        System.out.println("1) Retrieve Value");
        System.out.println("2) Clear Value");
        System.out.println("3) Replace Value");
        System.out.println("4) Back");
        System.out.print("Enter a number: ");
    }

    //Display "Ten Values" menu method
    public static void displaySubMenuTwo() {
        System.out.println("\nTen Values:");
        System.out.println("1) Display all Values");
        System.out.println("2) Display Value Count");
        System.out.println("3) Remove a Value");
        System.out.println("4) Add a Value");
        System.out.println("5) Math");
        System.out.println("6) Back");
        System.out.print("Enter a number: ");
    }

    //Display "Math" menu method
    public static void displaySubMenuThree() {
        System.out.println("\nMath:");
        System.out.println("1) Sum of all Values");
        System.out.println("2) Average of all Values");
        System.out.println("3) Difference Between the 1st and 10th Value");
        System.out.println("4) Back");
        System.out.print("Enter a number: ");
    }

    //Displays a goodbye message upon call.
    public static void goodbyeMessage() {
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) throws Exception {
        //Print a header line and a welcome message in the context of the program.
        System.out.println("");
        System.out.println("Dan D - Week 3 Project Arrays and Lists");
        System.out.println("Welcome to my numeric value storage system. Please enter a number below to navigate the menu.");

        //Begin mainMenu loop. This keeps the user inside the program as long as the user does not exit.
        mainLoop = 1;

            while (programLoop != 0) {
                while (mainLoop != 0) {
                displayMenu();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        //One Value option. Ends the main menu loop and begins looping the one value menu until the user decides to return
                        //to the main menu
                        mainLoop = 0;
                        subLoopOne = 1;
                        break;
                    case 2:
                        //Ten Values option. Ends the main menu loop and begins looping the ten values menu until the user decides to either
                        //return to the main menu or continue to the math menu
                        mainLoop = 0;
                        subLoopTwo = 1;
                        break;
                    case 3:
                        //Ends the program
                        goodbyeMessage();
                        programLoop = 0;
                        mainLoop = 0;
                        break;
                    default:
                        System.out.println("Invalid Input...Please Try Again!");
                }
            }
            
            while (subLoopOne != 0) {
                displaySubMenuOne();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("\nThe current stored value is %d\n", num1.getNumber());
                        break;
                    case 2:
                        System.out.print("\nWould you like to clear the current value? (Y/N): ");
                        char userResponse = text.nextLine().charAt(0);

                        if (Character.toUpperCase(userResponse) == 'Y') {
                            num1.setNumber(0);

                            System.out.println("\nValue successfully cleared.");
                        } else {
                            System.out.println("\nAction successfully cancelled");
                        }

                        break;
                    case 3:
                        System.out.print("\nWould you like to replace the current value? (Y/N): ");
                        userResponse = text.nextLine().charAt(0);

                        if (Character.toUpperCase(userResponse) == 'Y') {
                            System.out.print("\nWhat value would you like to change it to? ");
                            num1.setNumber(input.nextInt());

                            System.out.println("\nValue successfully replaced.");
                        } else {
                            System.out.println("\nAction successfully cancelled");
                        }
                        break;
                    case 4:
                        //Returns the user back to the main menu
                        mainLoop = 1;
                        subLoopOne = 0;
                        break;
                    default:
                        System.out.println("Invalid Input...Please Try Again!");
                }
            }

            while (subLoopTwo != 0) {
                displaySubMenuTwo();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        //Displays all values in the array of values
                        numArray.displayArray();
                        break;
                    case 2:
                        //Displays the count of values stored in the array
                        numArray.valueCount();
                        break;
                    case 3:
                        //Allows the user to remove one value of their choosing from the array
                        System.out.print("\nWhich index would you like to clear?: ");
                        userNum = input.nextInt();

                        System.out.print("\nAre you sure? (Y/N): ");
                        char userResponse = text.nextLine().charAt(0);

                        if (Character.toUpperCase(userResponse) == 'Y') {
                            numArray.clearIndex(userNum);
                            System.out.println("\nIndex successfully cleared.");
                        } else {
                            System.out.println("\nAction successfully cancelled");
                        }

                        break;
                    case 4:
                        //Add additional values if the collection has fewer than 10 values in it.
                        for (int startingIndex = numArray.openIndex(); startingIndex < numArray.getSize(); startingIndex++) {
                            System.out.print("\nEnter the number you'd like to add to the array: ");
                            userNum = input.nextInt();
                            numArray.addNumbers(startingIndex, userNum);
                        }

                        if (numArray.openIndex() == numArray.getSize()) {
                            System.out.println("\nThere are no more open indexes...\n");
                        }

                        break;
                    case 5:
                        //Math menu. Ends the 10 Values menu loop and begins looping the Math menu loop until the user 
                        //returns to the 10 Values menu
                        subLoopTwo = 0;
                        subLoopThree = 1;
                        break;
                    case 6:
                        //Ends the 10 Values loop and returns the user back to the Main menu
                        subLoopTwo = 0;
                        mainLoop = 1;
                        break;
                    default:
                        System.out.println("Invalid Input...Please Try Again!");
                }
            }

            while (subLoopThree != 0) {
                displaySubMenuThree();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        // Displays the sum of all values in the array
                        System.out.printf("\nThe sum of all values in the array is %d\n", numArray.calculateSum());
                        break;
                    case 2:
                        // Displays the average of all values in the array
                        System.out.printf("\nThe average of all values in the array is %.2f\n", numArray.calculateAvg(numArray.calculateSum(), numArray.getSize()));
                        break;
                    case 3:
                        // Display the difference between the first and last values in the array
                        System.out.printf("\nThe difference between %d and %d is %d\n", numArray.getValue(1), numArray.getValue(9), numArray.calculateDiff(numArray.getValue(0), numArray.getValue(9)));
                        break;
                    case 4:
                        //Ends the Math menu loop and returns the user back to the 10 Values menu
                        subLoopThree = 0;
                        subLoopTwo = 1;
                        break;
                    default:
                        System.out.println("Invalid Input...Please Try Again!");
                }
            }
        }
    }
}
