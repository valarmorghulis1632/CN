package Codezen.Assignment.Time_Complexity_Optimized_Codes.Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 05/07/2017.
 */
public class Push_Zeroes_to_End {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        int[] array = new int[array_length];
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array);
        push_zeroes_to_end(array);
        int i=0;
        while(i<array.length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
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

    public static void push_zeroes_to_end(int[] input)
    {
        int i=0,j=0;
        while(j<input.length)
        {
            if(input[j]!=0 && i==j)
            {
                i++;
                j++;
            }
            else if(input[j]==0)
            {
                j++;
            }
            else if(input[j]!=0 && i!=j)
            {
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j++;
            }
        }
    }
}
