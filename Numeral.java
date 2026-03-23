public class Numeral {
    //Class properties
    private int Number;

    //Constructor takes 1 parameter.
    public Numeral(int number) {
        Number = number;
    }

    //Getter and Setter for a singular numeric value.
    public int getNumber() {
        return Number;
    }

    public void setNumber(int userNum) {
        Number = userNum;
    }
}