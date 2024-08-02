package dev.julia;

public class ArmstrongNumber {

    
    public static void main(String[] args) {
        int number = 371;
        if (isArmstrong(number)) {
            System.out.println(number + " es un número de Armstrong.");
        } else {
            System.out.println(number + " no es un número de Armstrong.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}