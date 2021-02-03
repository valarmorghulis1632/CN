package Lectures.Lecture_8_Time_Complexity;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 01/07/2017.
 */
public class Coeff_and_Exponent {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int coeff_length=scan.nextInt();
        int[] coeff=new int[coeff_length];
        fillarray(coeff);
        int x=scan.nextInt();
        int val=value(coeff,x);
        System.out.println("VAL="+val);
    }

    public static void fillarray(int[] array)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array.length) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int value(int[] coeff,int x)
    {
        int mid=coeff.length/2;
        int i=0,sum=0,term=1;
//        while(i<mid)
//        {
//            sum=sum+(coeff[i]*(int)Math.pow(x,coeff.length-i-1))+(coeff[coeff.length-1-i]*(int)Math.pow(x,i));
//            i++;
//        }
//
        i=coeff.length-1;
        while(i>=0)
        {
            sum=sum+(term)*(coeff[i]);
            term=term*x;
            i--;
        }
        return sum;
    }
}
