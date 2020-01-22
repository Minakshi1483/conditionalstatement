
import java.util.Scanner;

public class Votingage{



    public static void main(String args[]) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age");
        age=scanner.nextInt();
        if (age >= 18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");

    }

}