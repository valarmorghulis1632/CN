package Lectures.Lecture_6_Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Sorted_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE ARRAY TERMS: ");
        fillarray(array,arraylength);
        boolean ans=sorted(array);
        if(ans==true)
        {
            System.out.println("SORTED");
        }
        else
        {
            System.out.println("NOT SORTED");
        }

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

    public static boolean sorted(int[] arr)
    {
        if(arr.length==0 || arr.length==1)
        {
            return true;
        }

        if(arr[0]>arr[1])
        {
            return true;
        }
        int i=0;
        int[] arr1=new int[arr.length-1];
        while(i<arr1.length)
        {
            arr1[i]=arr[i+1];
            i++;
        }
        return sorted(arr1);
//        if(ans==false)
//        {
//            return false;
//        }
//        else
//        {
//            return true;
//        }

    }
}
