import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers: =");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("Enter an operator(+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            //operator does not match any case constant(+,-,*,/)
            default:
                System.out.println("Error! operator is not correct");
        }
        System.out.printf("%.1f %c %.1f=%.1f", first, operator, second, operator);
    }
        }


