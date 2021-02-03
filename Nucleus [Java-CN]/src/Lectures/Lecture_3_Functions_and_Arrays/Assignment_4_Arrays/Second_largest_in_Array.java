/**
 * Find second largest element in an array.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Second_largest_in_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        System.out.print("\nENTER THE CHOICE: ");
        int choice=scan.nextInt();
        int second_largest=0;
        if(choice==1)
            second_largest=second_largest_calc_1(array,array_length);
        else if(choice==2)
            second_largest=second_largest_calc_2(array,array_length);
        else if(choice==3)
            second_largest=second_largest_calc_3(array,array_length);
        System.out.println("\nSECOND LARGEST ELEMENT IN ARRAY IS: "+second_largest);
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

    public static int second_largest_calc_1(int[] array,int array_length)
    {
        int i=0,large=Integer.MIN_VALUE;
        int[] difference_array=new int[100];
        while(i<array_length)
        {
            if(large<array[i])
            {
                large=array[i];
            }
            i++;
        }
        i=0;
        while(i<array_length)
        {
            difference_array[i]=large-array[i];
            i++;
        }
        i=0;
        int second_to_small=Integer.MAX_VALUE;
        while(i<array_length)
        {
            if(second_to_small>difference_array[i] && difference_array[i]!=0)
            {
                second_to_small=difference_array[i];
            }
            i++;
        }
        return (large-second_to_small);
    }

    public static int second_largest_calc_2(int[] array,int array_length)
    {   int i = 0, large = Integer.MIN_VALUE;
        while (i < array_length) {
            if (large < array[i]) {
                large = array[i];
            }
            i++;
        }
        i=0;
        int second_largest=Integer.MIN_VALUE;
        while(i<array_length)
        {
            if (second_largest < array[i] && array[i]!=large)
            {
                second_largest = array[i];
            }
            i++;
        }
       return (second_largest);
    }

    public static int second_largest_calc_3(int[] array,int array_length)
    {   int i = 0, large = Integer.MIN_VALUE,pos=0;
        while (i < array_length) {
            if (large < array[i])
            {
                large = array[i];
                pos=i;
            }
            i++;
        }
        array[pos]=Integer.MIN_VALUE;
        i=0;
        int second_largest=Integer.MIN_VALUE;
        while(i<array_length)
        {
            if (second_largest < array[i])
            {
                second_largest = array[i];
            }
            i++;
        }
        return (second_largest);
    }
}


