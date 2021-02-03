/**QUESTION -
 * Find the duplicate number in an array of size n with numbers
 from 0 to n-2. Each number is present at least once.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Duplicate_in_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY (N): ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY (0 TO N-2): ");
        fill_array(array, array_length);
        int duplicate=duplicate_calc(array,array_length);
        if(duplicate!=Integer.MAX_VALUE)
        {
            System.out.println("\nTHE DUPLICATE ELEMENT IS: "+duplicate);
        }
        else
        {
            System.out.println("\nARRAY CONSISTS OF NO DUPLICATES");
        }
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

    public static int duplicate_calc(int[] arr,int arr_length)
    {
        int i=0,j=0;
        while (i<arr_length-1)
        {
            if(i==arr_length-2)
            {
                return arr[i];
            }
            j=i+1;
            while(j<arr_length)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
                j++;
            }
            i++;
        }
     return Integer.MAX_VALUE;
    }
}
