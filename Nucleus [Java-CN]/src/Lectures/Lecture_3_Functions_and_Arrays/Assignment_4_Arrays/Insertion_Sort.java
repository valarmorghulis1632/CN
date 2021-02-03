/**
 * Insertion Sort
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        insertion_sort(array,array_length);
    }

    public static void fill_array(int[] array, int array_length)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array_length)
        {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void insertion_sort(int[] array,int array_length)
    {
        int i=0,j=0;
        while(i<array_length)
        {
            j=i-1;
            int x=array[i];
            while(j>=0 && (x < array[j]))
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=x;
            i++;
        }
        display_array(array,array_length);
    }

    public static void display_array(int[] array,int array_length)
    {
        int i=0;
        System.out.print("THE SORTED ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
    }
}
