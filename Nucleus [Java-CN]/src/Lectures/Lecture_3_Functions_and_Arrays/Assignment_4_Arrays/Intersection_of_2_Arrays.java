/**
 * Given two arrays print their intersection.
       a. Instead of printing write a function which returns their
          intersection.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Intersection_of_2_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array_A = new int[50];
        int[] array_B = new int[50];
        int[] array_sum = new int[50];
        System.out.print("ENTER THE LENGTH OF ARRAY A: ");
        int array_length_A = scan.nextInt();
        System.out.print("\nENTER THE LENGTH OF ARRAY B: ");
        int array_length_B = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY A: ");
        fill_array(array_A, array_length_A);
        System.out.print("\nENTER THE TERMS IN ARRAY B: ");
        fill_array(array_B, array_length_B);
        intersection_calc(array_A,array_length_A,array_B,array_length_B);
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

    public static void intersection_calc(int[] array_A,int array_length_A,int[] array_B,int array_length_B)
    {
        int i=0,j=0,flag=0,temp=Integer.MAX_VALUE;

        while(i<array_length_A)
        {
            j=0;
            while(j<array_length_B)
            {
                if(array_A[i]==array_B[j] && array_B[j]!=temp)
                {
                    temp=array_B[j];
                    flag++;
                    System.out.print("\nINTERSECTION ELEMENT "+flag+" IS: "+array_A[i]+" ");
                }
                j++;
            }
            i++;
        }
        if(flag==0)
            System.out.println("\nNO INTERSECTION IN ARRAYS");
    }
}

