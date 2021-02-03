/**QUESTION -
 * In an array that contains duplicates, find the first non
 repeating element.
 E.g – input – [5,2,6,7,5,6,9] and output - 2
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class First_Non_Repeating_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        int num_not_repeating=first_non_repeating(array,array_length);
        if(num_not_repeating!=Integer.MAX_VALUE)
        {
            System.out.println("\nTHE FIRST NON REPEATING ELEMENT IS: "+num_not_repeating);
        }
        else
        {
            System.out.println("\nNO NON REPEATING NUMBER PRESENT IN THE ARRAY");
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

    public static int first_non_repeating(int[] array,int array_length)
    {
       int i=0,j=0,count=1;
       while(i<array_length)
       {   count=1;
           j=0;
           while (j<array_length)
           {
               if(array[i]==array[j] && i!=j)
               {
                   count++;
               }
               else if(array[i]!=array[j] && count==1 && j==array_length-1)
               {
                   return array[i];
               }
               j++;
           }
           i++;
       }
       return Integer.MAX_VALUE;
    }
}
