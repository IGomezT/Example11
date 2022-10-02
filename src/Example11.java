import java.util.Scanner;

public class Example11 {
    public static void main(String [] argv) {
        int number1;
        int number2;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write first number");
        number1 = inputValue.nextInt();

        System.out.println("Write the second number");
        number2 = inputValue.nextInt();

        if(number1 > number2) {
            System.out.println("Ascending " + number1 + "," + number2 + "");

        }

    }
}
