package Codezen.Problems_of_Day;

import Codezen.Assignment.Array.Array_1.Intersection_in_2_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Min_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array_A = new int[50];
        int[] array_B = new int[50];
        int[] array_sum = new int[50];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length_A = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY A: ");
        Intersection_in_2_Arrays.fill_array(array_A, array_length_A);
        System.out.print("\nENTER THE TERMS IN ARRAY B: ");
        Intersection_in_2_Arrays.fill_array(array_B, array_length_A);
        System.out.println("");
        int minimum=min_val(array_A,array_B,array_length_A);
        System.out.println("\nMINIMUM SUM OF TERMS NOT HAVING SAME INDICES: "+minimum);
    }

    public static int min_val(int[] arr_A,int[] arr_B,int arr_length)
    {
        int min,i=0,j;
        int sum_arr[]=new int[arr_length];
        while(i<arr_length)
        {   min=Integer.MAX_VALUE;
            j=0;
            while(j<arr_length)
            {
                if(j!=i && min>(arr_A[i]+arr_B[j]))
                {
                    min=arr_A[i]+arr_B[j];
                    sum_arr[i]=min;
                }
                j++;
            }
            i++;
        }

        min=Integer.MAX_VALUE;
        i=0;
        while(i<arr_length)
        {
            if(min>sum_arr[i])
                min=sum_arr[i];
            i++;
        }
        return min;
    }
}
