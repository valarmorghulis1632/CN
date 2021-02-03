package Lectures.Lecture_3_Functions_and_Arrays.Class_Codes;

/**
 * Created by Ayush Deshwal on 13/06/2017.
 */
import java.util.Scanner;
public class Largest_In_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fillarray(array,arraylength);
        System.out.println("\nLARGEST IS: "+largest_in_array(array,arraylength));

    }

    public static void fillarray(int[] array,int arraylength)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<arraylength) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int largest_in_array(int[] array,int arraylength)
    {
        int large=Integer.MIN_VALUE;
        int i=0;
        while(i<arraylength){
            if (large < array[i]) {
                large = array[i];
            }
         i++;
        }
       return large;
    }

}
