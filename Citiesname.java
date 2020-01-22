import java.util.Scanner;
        public class Citiesname {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("pls enter any alphabet ");

                String alphabet = scanner.next().toUpperCase();
                char ch = alphabet.charAt(0);

                switch (ch) {
                    case 'A':
                        System.out.println("Ahemdabad");
                        break;

                    case 'B':
                        System.out.println("Banaras");
                        break;

                    case 'C':
                        System.out.println("Calcutta");
                        break;

                    case 'D':
                        System.out.println("Dubai");
                        break;

                    case 'F':
                        System.out.println("Fairway");
                        break;

                    default:
                        System.out.println("Invalid entry");
                }

            }
        }