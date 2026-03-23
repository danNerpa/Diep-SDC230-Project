public class NumeralArray {
    //Class properties
    private int[] Numbers;

    //Constructor to create the array
    public NumeralArray(int size) {
        Numbers = new int[size];
    }

    //Get a value from an index
    public int getValue(int index) {
        return Numbers[index];
    } 

    //Get the size of the array.
    public int getSize() {
        return Numbers.length;
    }

    //Add numbers to the set array.
    public void addNumbers(int index, int number) {
        if (index >= 0 && index < Numbers.length) {
            if (Numbers[index] == 0) {
                Numbers[index] = number;
                System.out.printf("Value successfully added at Index %d\n\n", index);
            } else {
                System.out.printf("Open index not found...\n\n");
            }
        }
    }

    //Find an open index
    public int openIndex() {
        int startingIndex;
        for (startingIndex = 0; startingIndex < Numbers.length; startingIndex++) {
            if (Numbers[startingIndex] != 0) {

            } else {
                break;
            }
        }
        return startingIndex;
    }

    //Remove a value from the array.
    public void clearIndex(int index) {
        Numbers[index] = 0;
    }

    //Display every value in the array
    public void displayArray() {
        //Header
        System.out.printf("\n%s%8s%n", "Index", "Value");
        for (int i = 0; i < Numbers.length; i++) {
            System.out.printf("%5d%8d\n", i, Numbers[i]);
        }
    }

    public void valueCount() {
        int count = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] != 0) {
                count++;
            }
        }
        System.out.printf("\nValue count: %d\n", count);
    }

    public int calculateSum() {
        int totalSum = 0;

        for (int i = 0; i < Numbers.length; i++) {
            totalSum = totalSum + Numbers[i];
        }
        return totalSum;
    }

    public double calculateAvg(int sum, int total) {
        double average = (sum/total);

        return average;
    }

    public int calculateDiff(int num1, int num2) {
        int difference = (num1 - num2);

        return difference;
    }
}
