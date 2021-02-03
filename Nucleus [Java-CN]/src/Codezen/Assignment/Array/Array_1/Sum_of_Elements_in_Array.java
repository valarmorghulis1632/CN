package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array,array_length);
        int sum=sum_of_elements(array,array_length);
        System.out.println("\nTHE SUM IS: "+sum);
    }

    public static void fill_array(int[] array,int array_length)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int sum_of_elements(int[] array,int array_length)
    {
        int sum=0,i=0;
        while(i<array_length)
        {
            sum=sum+array[i];
            i++;
        }
        return sum;
    }

    /**
     * Created by Ayush Deshwal on 15/06/2017.
     */
    public static class Unique_Element {
        public static void main(String[] args) {

        }
    }
}
