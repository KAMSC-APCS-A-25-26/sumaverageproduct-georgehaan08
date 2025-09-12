/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage
{
    public static void main(String[] args)
    {
        double x, y, z, a, b, numruns, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many runs? ");
        numruns = scan.nextInt();
        for(i = 0.0; i < numruns; i++)
        {
            System.out.println("\nEnter 3 numbers ");
            x = scan.nextDouble();
            a = scan.nextDouble();
            b = scan.nextDouble();
            y = x + a + b;
            z = x * a * b;
            System.out.println("\nThe sum is " + y);
            System.out.println("\nThe average is " + y/numruns);
            System.out.println("\nThe product is " + z);
        }
    }
}
