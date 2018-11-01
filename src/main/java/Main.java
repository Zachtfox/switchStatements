package main.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 ");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("1 in spanish is: Uno");
                break;

            case 2:
                System.out.println("2 in spanish is: Dos");
                break;

            case 3:
                System.out.println("3 in spanish is: tres");
                break;

            case 4:
                System.out.println("4 in spanish is: Cautro");
                break;

            case 5:
                System.out.println("5 in spanish is: Cinco");

            case 6:
                System.out.println("5 in spanish is: Seis");
                break;

            case 7:
                System.out.println("7 in spanish is: Siete");
                break;

            case 8:
                System.out.println("8 in spanish is: Ocho");
                break;

            case 9:
                System.out.println("9 in spanish is: Nueve");
                break;

            case 10:
                System.out.println("10 in spanish is: Diez");
        }
    }
}
