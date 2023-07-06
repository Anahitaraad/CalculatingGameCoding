package se.lexicon;

import java.util.Scanner;

public class App
{
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

        int sum = num1 + num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int subtraction = num1 - num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);

    }
}



