package se.lexicon;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        /*
        System.out.println( "Hello World!" );
        System.out.println("Hello");
        System.out.println("AnnA!");


        char m = '\u0000';
        char x = '\uffff';

        System.out.println(m);
        System.out.println(x);

         */

       /*
        Person anna = new Person();
        anna.firstName = "AnnA";
        anna.lastName = "Raad";
        anna.age = 14;
        anna.hobby = "programming";
        System.out.println(anna.getInformation());

        Person amir = new Person();
        amir.firstName = "Amir";
        amir.lastName ="Gholami";
        amir.age = 40;
        amir.hobby = "game";
        System.out.println(amir.getInformation());
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num5 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num6 = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num7 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num8 = scanner.nextInt();


        int sum = num1 + num2;
        int multiplication = num3 * num4;
        int division = num5 / num6;
        int subtraction = num7 - num8;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num3 + " * " + num4 + " = " + multiplication);
        System.out.println(num5 + " / " + num6 + " = " + division);
        System.out.println(num7 + " - " + num8 + " = " + subtraction);

    }


}



