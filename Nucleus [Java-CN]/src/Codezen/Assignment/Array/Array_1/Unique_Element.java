package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Unique_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        int unique = unique_element_calc(array, array_length);
        if (unique != Integer.MAX_VALUE)
            System.out.println("\nTHE UNIQUE ELEMENT IS: " + unique);
        else System.out.println("\nNO UNIQUE ELEMENT PRESENT");
    }

    public static void fill_array(int[] array, int array_length) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int unique_element_calc(int[] array, int array_length)
    {
        int i=0,large=Integer.MIN_VALUE;
        while(i<array_length)
        {
            if(large<array[i])
                large=array[i];
            i++;
        }
        int[] count=new int[large+1];
        i=0;
        while(i<array_length)
        {
            count[array[i]]++;
            i++;
        }
        i=0;
        while(i<=large)
        {
            if(count[i]==1)
                return i;
            i++;
        }
     return Integer.MAX_VALUE;
    }
}
