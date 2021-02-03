package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Trailing_zeroes_in_Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int number=scan.nextInt();
        int quotient_sum_with_2=quotient_sum_calc(number,2);
        int quotient_sum_with_5=quotient_sum_calc(number,5);
        if(quotient_sum_with_2>quotient_sum_with_5)
            System.out.println("\nNUMBER OF TRAILING ZEROES IN "+number+"! IS: "+quotient_sum_with_5);
        else System.out.println("\nNUMBER OF TRAILING ZEROES IN "+number+"! IS: "+quotient_sum_with_2);
    }

    public static int quotient_sum_calc(int number,int divisor)
    {
        int sum=0;
        while(number>0)
        {
            sum=sum+(number/divisor);
            number=number/divisor;
        }
        return sum;
    }
}
