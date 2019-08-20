package quadratic;

import java.util.Scanner;
import java.lang.Math;

/*
*This program takes any equation in the form
* of ax^2 + bx + c and gives you the answers for
* x. If it is imaginary, the program will stop
*after printing a line.
*/

public class quadratic
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your A value?");
        double numA = scanner.nextInt();
        System.out.println("What is your B value?");
        double numB = scanner.nextInt();
        System.out.println("What is your C value?");
        double numC = scanner.nextInt();
        
        //Divides everything by numA
        double numC2 = numC / numA;
        double numB2 = numB / numA;
        double numA2 = numA / numA;
        
        //Puts numC on the right side, making it negative
        double negNumC = numC2 * -1;
        
        //Divides by 2, then squares it and adds it to right side
        double numBdiv2 = numB2 / 2;
        double rightSide = (numBdiv2 * numBdiv2) + negNumC;
        
        //Not important
        double i = 0;
        double sqrtRightSide = 0;
        
        //If statement to see if num is imaginary
        while (true) {
            if (rightSide >= 0) {
                sqrtRightSide = Math.sqrt(rightSide);
                i = 1;
                break;
            } else {
                System.out.println("Answer is imaginary");
                break;
            }
        }
        
        //Prints out all answers
        if (i > 0) {
            System.out.println(" ");
            System.out.println("Answer 1 for x: " + ((sqrtRightSide) - numBdiv2));
            System.out.println("Answer 2 for x: " + ((sqrtRightSide * -1) - numBdiv2));
        }
    }
}