/**QUESTION -
 * Given an array of integers A and an integer x. Find pairs of
 elements in A, which sum to x.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Pairs_of_Elements_in_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        System.out.print("\nENTER THE REQUIRED SUM OF ELEMENTS (X): ");
        int number=scan.nextInt();
        no_of_pairs(array,array_length,number);
    }

    public static void fill_array(int[] array, int array_length)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void no_of_pairs(int[] input,int input_length,int x)
    {
        int i=0,j=0,count=0;
        System.out.println("");
        while(i<input_length)
        {   j=i+1;
            while(j<input_length)
            {
                if((input[i]+input[j])==x)
                {
                    count++;
                    if(input[i]<input[j])
                    System.out.println(input[i]+" "+input[j]);
                    else System.out.println(input[j]+" "+input[i]);
                }
                j++;
            }
            i++;
        }
        if(count==0)
            System.out.println("  THE REQUIRED SUM "+x+" IS NOT SATISFIED BY ANY PAIR OF GIVEN ARRAY");
    }

}

