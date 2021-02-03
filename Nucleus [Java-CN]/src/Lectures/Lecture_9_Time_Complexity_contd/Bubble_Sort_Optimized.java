package Lectures.Lecture_9_Time_Complexity_contd;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 27/06/2017.
 */
public class Bubble_Sort_Optimized {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] arr=new int[elements];
        fillarray(arr);
        bubble_optimized(arr);
        int i=0;
        System.out.println("");
        while(i<arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static void fillarray(int[] array)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array.length) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static void bubble_optimized(int[] input)
    {
        int i=0,j,flag=0;
        while (i<input.length)
        {
            flag=0;
            j=0;
            while(j<input.length-i-1)
            {
                if(input[j+1]<input[j])
                {
                    int temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                    flag=1;
                }
                j++;
            }
            if(flag==0)
            {
                System.out.println("***");
                break;
            }
            i++;
        }
    }
}
