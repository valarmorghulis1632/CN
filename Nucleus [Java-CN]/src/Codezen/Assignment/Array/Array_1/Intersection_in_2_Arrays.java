package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Intersection_in_2_Arrays {
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
            System.out.println("");
            intersection_calcu_l(array_A,array_length_A,array_B,array_length_B);
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

    public static void intersection_calcu_l(int[] array_A,int array_length_A,int[] array_B,int array_length_B)
    {
        int i=0,large=Integer.MIN_VALUE;
        while(i<array_length_A)
        {
            if(large<array_A[i])
            {
                large=array_A[i];
            }
            i++;
        }

        i=0;
        while(i<array_length_B)
        {
            if(large<array_B[i])
            {
                large=array_B[i];
            }
            i++;
        }


        int[] count_A=new int[large+1];
        i=0;
        while(i<array_length_A)
        {
            count_A[array_A[i]]++;
            i++;
        }
        i=0;
        int count_B[]=new int[large+1];
        while(i<array_length_B)
        {
            count_B[array_B[i]]++;
            i++;
        }
        i=0;
        while(i<large+1)
        {
            if(count_A[i]!=0 && count_B[i]!=0)
            {
                if(count_A[i]<=count_B[i])
                {
                    display(i,count_A[i]);
                }
                else
                {
                    display(i,count_B[i]);
                }
            }
            i++;
        }
    }

    public static void display(int num,int times)
    {
        int i=1;
        while(i<=times)
        {
            System.out.println(num);
            i++;
        }
    }
}
