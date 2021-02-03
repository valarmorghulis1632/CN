package Lectures.Lecture_3_Functions_and_Arrays.Class_Codes;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/06/2017.
 */
public class Linear_Search_in_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE ARRAY TERMS: ");
        fillarray(array,arraylength);
        System.out.print("\nENTER THE NUMBER TO BE SEARCHED: ");
        int number=scan.nextInt();
        int index=linear_search(array,number);
        if(index!=-1)
        {
            System.out.println("\nGIVEN TERM "+number+" EXISTS AT ARRAY INDEX: "+index);
        }
        else System.out.println("\nGIVEN TERM "+number+" DOESN'T EXIST IN THE ARRAY");
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

    public static int linear_search(int[] arr,int num)
    {
        int i=0;
        while(i<arr.length) {
            if (arr[i] == num) {
                return i;
            }
            i++;
        }
         return -1;
    }
}
