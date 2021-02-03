/**
 * You are given with an array containing only 0’s, 1’s and 2’s. Write a
 function to sort this array. Also find another solution which scans the
 array once.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Quest_5_incomplete {
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

    public static void sort_by_scan_only_once(int[] array,int array_length)
    {
        int i=0,j=0,k=0,temp=0;
        while(k<array_length)
        {
            if(i==j && i==k && array[k]==0)
            {
                i++;
                j++;
                k++;
            }
            else if(array[j]==0 && i!=j)
            {

                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j++;
            }
        }

        disp_sorted_array(array,array_length);
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
