package Codezen.Assignment.Time_Complexity_Optimized_Codes.Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 05/07/2017.
 */
public class Second_and_Third_Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        int[] array = new int[array_length];
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array);
        second_third_largest(array);
    }

    public static void fill_array(int[] array)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void second_third_largest(int[] input)
    {
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int i=0;
        while(i<input.length)
        {
            if (input[i]>large)
            {
                third=second;
                second=large;
                large=input[i];
            }
            else if(input[i]<large && input[i]>second)
            {
                third=second;
                second=input[i];
            }
            else if(input[i]<second && input[i]>third)
            {
                third=input[i];
            }
            i++;
        }
        System.out.println(second+" "+third);
    }
}
