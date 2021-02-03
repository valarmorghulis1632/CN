package Lectures.Lecture_4_Working_on_Codezen;

import Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays.Reverse_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Binary_Search {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        Reverse_Array.fill_array(array,array_length);
        System.out.print("\nENTER THE NUMBER TO BE SEACRHED: ");
        int number=scan.nextInt();
        binary_search(array,array_length,number);
    }

//    public static void fill_array(int[] array,int array_length)
//    {   Scanner scan=new Scanner(System.in);
//        int i=0;
//        while(i<array_length) {
//            System.out.print(" ");
//            array[i] = scan.nextInt();
//            i++;
//        }
//    }

    public static void binary_search(int[] array,int array_length,int number)
    {
        int beginning=0,end=array_length-1,mid,flag=0;
        while(beginning<=end)
        {
            mid=(beginning+end)/2;
            if(number<array[mid])
            {
                end=mid-1;
            }
            else if(number>array[mid])
            {
                beginning=mid+1;
            }
            else
            {
                System.out.println("\nTHE REQUIRED NUMBER "+number+" IS PRESENT IN THE ARRAY AT POSITION "+mid);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("\nTHE REQUIRED NUMBER "+number+" DOESN'T EXIST IN THE ARRAY");
        }
    }
}
