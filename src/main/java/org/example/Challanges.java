package org.example;

public class Challanges {

    //Challange #1: The greatest common divisor or GCD for num1 & num2
    public static int gcd(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return gcd(num1-num2, num2);
        }
        else {
            return gcd(num1, num2-num1);
        }
    }

    //Challange #2: Check for prime number
    public static boolean isPrime(int num, int i) {

        // First base case
        if (num < 2) {
            return false;
        }
        // Second base case
        else if (i == 1) {
            return true;
        }
        // Third base case
        else if (num%i == 0) {
            return false;
        }
        // Recursive case
        else {
            return isPrime(num, i-1);
        }
    }

    //Challange #3: Convert decimal to binary
    public static int decimalToBinary(int n){
        String counter = null;
        //base
        if (n < 2){
            return 0;
        }
        if (n%2==0){
            counter = counter + "0";
            return decimalToBinary(n/2);
        }else if (n%2==1){
            counter = counter + "1";
            return decimalToBinary(n/2);
        }
        return decimalToBinary(n/2);

    }


}
