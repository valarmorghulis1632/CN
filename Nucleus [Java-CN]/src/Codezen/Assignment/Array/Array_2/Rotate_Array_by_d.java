package Codezen.Assignment.Array.Array_2;

import Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays.Reverse_Array;
import Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays.Scan_Only_Once_0s_and_1s;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Rotate_Array_by_d {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int array_length=scan.nextInt();
        int[] array=new int[array_length+1];
        Reverse_Array.fill_array(array,array_length);
        System.out.print("ENTER THE ROTATION NUMBER: ");
        int num=scan.nextInt();
        rotat_by_num(array,array_length,num);
    }

    public static void rotat_by_num(int[] arr,int arr_length,int num)
    {
        int i=1,j;
        while(i<=num)
        {
            j=0;
            int term=arr[j];
            while(j<arr_length-1)
            {
                arr[j]=arr[j+1];
                j++;
            }
            arr[j]=term;
            i++;
        }
        Scan_Only_Once_0s_and_1s.disp_sorted_array(arr,arr_length);
    }
}
