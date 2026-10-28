// Question: What are an integer’s strict divisors and their sum?
package Loop;
// A program which display the sum of the strict divisors of an integer given by the user
// the stick divisor of a number N are <= N/2
// 10 the strick divisor will be 1,2,5
// 32 ( N <= N/2 = 32/2 = 16 ) 1 , 2, 4, 8,16

import java.util.Scanner;

public class StrictDivisors {
    public static void main(String[] args) {work();}

    public static void work() {
//        enter number
//        divide number by 2
//        for 1 less than divide++
//        if number % i == 0
//        then sum +=i;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your number:");
        int userNum = input.nextInt();
        int sum = 0;
        System.out.print("Strict divisors:");
        if (userNum > 1) {
            System.out.print(" 1");
            sum = 1;
            for (int i = 2; i <= userNum / 2; i++) {
                if (userNum % i == 0) {
                    sum += i;
                    System.out.print(" " + i);
                }
            }
        } else {
            System.out.print(" none");
        }
        System.out.println("\nSum = " + sum);


    }
}
