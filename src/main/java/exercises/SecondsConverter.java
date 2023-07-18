package exercises;

import java.util.Scanner;

/* Create a program that converts seconds to hours, minutes and seconds Input seconds: 86399 Expected output: 23:59:59 */
public class SecondsConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input seconds: ");
            int seconds = scanner.nextInt();

            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remainingSeconds = seconds % 60;

            System.out.printf("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        }
    }

