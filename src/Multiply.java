import java.util.Scanner;

public class Multiply {

    public static void main (String [] args){


        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first integer number: ");
        int a = scanner.nextInt();

        System.out.println("Enter seoond integer number; ");

        int b = scanner.nextInt();

        System.out.println("Multiply of " +a+  " and " +b+ " = " + (a*b));

    }



}
