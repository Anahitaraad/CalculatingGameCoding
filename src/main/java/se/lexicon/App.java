package se.lexicon;


public class App 
{
    public static void main( String[] args )
    {

        /*
        System.out.println( "Hello World!" );
        System.out.println("Hello");
        System.out.println("AnnA!");


        char m = '\u0000';
        char x = '\uffff';

        System.out.println(m);
        System.out.println(x);

         */

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


            }
}
