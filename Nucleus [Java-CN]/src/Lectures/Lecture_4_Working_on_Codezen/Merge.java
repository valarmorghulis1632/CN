package Lectures.Lecture_4_Working_on_Codezen;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Merge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array_A = new int[50];
        int[] array_B = new int[50];
        System.out.print("ENTER THE LENGTH OF ARRAY A: ");
        int array_length_A = scan.nextInt();
        System.out.print("\nENTER THE LENGTH OF ARRAY B: ");
        int array_length_B = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY A: ");
        fill_array(array_A, array_length_A);
        System.out.print("\nENTER THE TERMS IN ARRAY B: ");
        fill_array(array_B, array_length_B);
        int[] merged_array=merge_sorted_arrays(array_A,array_length_A,array_B,array_length_B);
        Display_Array(merged_array);

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

    public static int[] merge_sorted_arrays(int[] arr1,int arr1_length,int[] arr2,int arr2_length)
    {
        int i=0,j=0,k=0;
        int[] merged_array=new int[100];
        while(i<arr1_length && j<arr2_length)
        {
            if(arr1[i]<arr2[j])
            {
                merged_array[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                merged_array[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1_length)
        {
            merged_array[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2_length)
        {
            merged_array[k]=arr2[j];
            j++;
            k++;
        }
        return merged_array;
    }

    public static void Display_Array(int[] arr)
    {
        int i=0;
        while(i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

}
