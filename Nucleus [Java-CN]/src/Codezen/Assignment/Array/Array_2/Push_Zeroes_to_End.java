package Codezen.Assignment.Array.Array_2;

import Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays.Reverse_Array;
import Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays.Scan_Only_Once_0s_and_1s;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Push_Zeroes_to_End {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int array_length=scan.nextInt();
        int[] array=new int[array_length+1];
        Reverse_Array.fill_array(array,array_length);
        System.out.print("ENTER CHOICE:(1 or 2): ");
        int choice=scan.nextInt();
        if(choice==1)
        {
            push_0_end_1(array,array_length);
        }
        else if(choice==2)
        {
            push_0_end(array,array_length);
        }


    }

    public static void push_0_end_1(int[] arr,int arr_length)
    {
        int i=0,k=0;
        int[] rev_arr=new int[arr_length+1];

        while(i<arr_length)
        {
            if(arr[i]==0)
            {
                rev_arr[k]=arr[i];
                k++;

            }
            i++;
        }
        i=arr_length-1;
        while(i>=0)
        {
            if(arr[i]!=0)
            {
                rev_arr[k]=arr[i];
                k++;

            }
            i--;
        }

        Scan_Only_Once_0s_and_1s.disp_sorted_array(rev_arr,k);
        System.out.println("");
        i=0;
        while(i<(k/2))
        {
            int temp=rev_arr[i];
            rev_arr[i]=rev_arr[k-i-1];
            rev_arr[k-i-1]=temp;
            i++;
        }
        Scan_Only_Once_0s_and_1s.disp_sorted_array(rev_arr,k);
    }

    public static void push_0_end(int[] arr,int arr_length)
    {
        int i,j=arr_length-1;
        while(arr[j]==0)
        {
            j--;
        }
        i=j;
        while(i>=0)
        {
            if(arr[i]==0)
            {
                int k=i;
                while (k<=j)
                {
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                    k++;
                }
                j--;
            }
            i--;
        }
        System.out.println("\n"+arr.length);
        Scan_Only_Once_0s_and_1s.disp_sorted_array(arr,arr_length);
    }
}
