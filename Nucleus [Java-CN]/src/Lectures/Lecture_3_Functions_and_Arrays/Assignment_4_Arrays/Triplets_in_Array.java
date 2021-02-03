/**
 * Given an array of integers A and an integer x. Find triplets of
 elements in A which sum to x.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Triplets_in_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        System.out.print("\nENTER THE REQUIRED SUM OF ELEMENTS (X): ");
        int number=scan.nextInt();
        no_of_triplets(array,array_length,number);
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

    public static void no_of_triplets(int[] array,int array_length,int number)
    {
        int i=0,j,count=0;
        System.out.println("");
        while(i<array_length)
        {
            j=i+1;
            while(j<array_length)
            {
                int k=j+1;
                while(k<array_length)
                {
                    if((array[i]+array[j]+array[k])==number)
                    {
                        count++;
                        System.out.println("TRIPLET "+count+" SATISFYING CONDITION IS: "+array[i]+" , "+array[j]+" , "+array[k]);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        if(count==0)
            System.out.println("  THE REQUIRED SUM "+number+" IS NOT SATISFIED BY ANY TRIPLET OF GIVEN ARRAY");
    }
}
