/**QUESTION -
 * Print sum of all positive and negative numbers separately in
 an array.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Sum_of_Pos_and_Neg_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        calc_sum(array,array_length);
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

    public static void calc_sum(int[] array,int array_length)
    {
        int i=0,sum_positive=0,sum_negative=0;
        while(i<array_length)
        {
          if(array[i]>=0)
          {
              sum_positive=sum_positive+array[i];
          }
          else
          {
              sum_negative=sum_negative+array[i];
          }
          i++;
        }
        System.out.println("\nSUM OF POSITIVE NUMBERS IS: "+sum_positive);
        System.out.println("SUM OF NEGATIVE NUMBERS IS: "+sum_negative);
    }

}

