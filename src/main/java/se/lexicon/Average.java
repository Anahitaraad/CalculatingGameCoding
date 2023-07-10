package se.lexicon;

public class Average {

            public static void main(String[] args) {
                int num1 = 23;
                int num2 = 11;
                int num3 = 77;

                int sum = num1 + num2 + num3;
                int count = 3;

                double average = (double) sum / count;

                System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / " + count + " = " + average);
            }
        }
