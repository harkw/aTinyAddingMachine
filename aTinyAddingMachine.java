import java.util.Scanner;

public class aTinyAddingMachine {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int firstValue;
        int secondValue;
        int sum;

        System.out.print("What's the first number? What's the second number?");
        firstValue = keyboard.nextInt();
        secondValue = keyboard.nextInt();

        sum = firstValue + secondValue;
        System.out.print("The sum is ");
        System.out.print(sum);
        System.out.println(".");

        keyboard.close();
    }
}
