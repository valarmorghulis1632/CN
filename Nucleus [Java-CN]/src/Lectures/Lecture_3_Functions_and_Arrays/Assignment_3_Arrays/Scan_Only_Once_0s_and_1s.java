/**QUESTION -
 * You are given with an array containing only 0’s and 1’s. Write
 a
 function to sort this array. Find a solution which scans the
 array only once.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Scan_Only_Once_0s_and_1s {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        sort_by_scan_only_once(array,array_length);
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

    public static void sort_by_scan_only_once(int[] arr,int arr_length)
    {
        int j=0,k=0,temp;
        while(j< arr_length)
        {
            if(k==j && arr[j]==0)
            {
                j++;
                k++;
            }
            else if(arr[j]==1)
            {
                j++;
            }
            else if(arr[j]==0 && k!=j)
            {

                temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k++;
                j++;
            }
        }
        disp_sorted_array(arr,arr_length);
    }

    public static void disp_sorted_array(int[] array,int array_length)
    {
        int i=0;
        System.out.println("\nSORTED ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
    }
}
