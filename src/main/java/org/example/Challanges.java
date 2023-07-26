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
}
