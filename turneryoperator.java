//find out odd evan number by using turnery operators
import java.util.Scanner;
public class turneryoperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");


        int num1 = scanner.nextInt();
        System.out.println("enter the second number");

        int num2 = scanner.nextInt();
        System.out.println((num1 % 2 == 0 ? +num1 + "is evan number" : +num1 + "is odd number"));
        System.out.println((num2 % 2 == 0 ? +num2 + "is evan number" : +num2 + "is odd number"));


    }
}
