package Lectures.Lecture_3_Functions_and_Arrays.Class_Codes;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/06/2017.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("ENTER THE ELEMENTS IN THE ARRAY: ");
        fillarray(array,arraylength);
        Bubble_Sort(array,arraylength);
        System.out.print("AFTER BUBBLE SORT: ");
        Display_Array(array,arraylength);
    }

    public static void fillarray(int[] array,int arraylength)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        System.out.print(" ");
        while(i<arraylength) {
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void Bubble_Sort(int[] arr,int length)
    {
        int i,j,temp;
        for(i=0;i<length;i++) {
            for (j=0; j<length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void Display_Array(int[] arr,int length)
    {
        int i=0;
        while(i<length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

}
