package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Swap_Alternate_Elements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE ARRAY TERMS: ");
        fillarray(array,arraylength);
        swap_alternate(array,arraylength);
        display_array(array,arraylength);
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

    public static void swap_alternate(int[] array,int array_length)
    {
        int i=0;
        while(i<array_length)
        {
            if(i==array_length-1 && array_length%2!=0)
            {
                break;
            }
            int temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            i=i+2;
        }
    }

    public static void display_array(int[] array,int array_length)
    {
        int i=0;
        System.out.print("\nTHE CHANGED ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }

    }
}
