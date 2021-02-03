package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Sum_Array_Elem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE ARRAY TERMS: ");
        fillarray(array,arraylength);
        System.out.println("SUM IS: "+sum_array(array));
    }

    public static void fillarray(int[] array,int arraylength)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<arraylength) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int sum_array(int[] input)
    {
        if(input.length==1)
        {
            return input[0];
        }
        int[] small_arr=new int[input.length-1];
        int i=0;
        while(i<small_arr.length)
        {
            small_arr[i]=input[i+1];
            i++;
        }
        return input[0]+sum_array(small_arr);
    }
}
