/**QUESTION -
 * You are given two arrays. Find the sum of the two arrays and
 put the result in another array.
 E.g. if you are given [1,2,4] and [4,5,6] then output should be
 [5,8,0].
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Sum_of_2_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array_A = new int[50];
        int[] array_B = new int[50];

        System.out.print("ENTER THE LENGTH OF ARRAY A: ");
        int array_length_A = scan.nextInt();
        System.out.print("\nENTER THE LENGTH OF ARRAY B: ");
        int array_length_B = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY A: ");
        fill_array(array_A, array_length_A);
        System.out.print("\nENTER THE TERMS IN ARRAY B: ");
        fill_array(array_B, array_length_B);
        sum_arrays(array_A,array_length_A,array_B,array_length_B);
    }

    public static void fill_array(int[] array, int array_length)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void sum_arrays(int[] arr1,int array_length_A,int[] arr2,int array_length_B)
    {
        int i=array_length_A-1;
        int j=array_length_B-1;
        int g=i>j?i:j;
        int[] array_sum=new int[g+2];
        int temp,carry=0,k=0;
        while(i>=0 && j>=0)
        {
            temp=arr1[i]+arr2[j]+carry;
            int dig=temp%10;
            array_sum[k]=dig;
            k++;
            carry=temp/10;

            if(i==0 && j==0)
            {
                array_sum[k]=carry;
                k++;
            }
            i--;
            j--;
        }

        while(i>=0)
        {
            array_sum[k]=arr1[i]+carry;
            i--;
            k++;
        }

        while(j>=0)
        {
            array_sum[k]=arr2[j]+carry;
            j--;
            k++;
        }
        System.out.println(g+2+" "+k+" "+(g+2-k));
//        if(k<g+2)
//        {
//            int diff=g+2-k;
//            array_sum[array_sum.length-1]=0;
//            display_sum_arrays(array_sum,array_sum.length);
//           // rotate(array_sum,diff);
//        }
        display_sum_arrays(array_sum,array_sum.length);
    }

    public static void display_sum_arrays(int[] array_sum,int k)
    {
        int i=k-1;
        System.out.print("\nTHE SUM OF ARRAYS IS: ");
        while(i>=0)
        {
            System.out.print(array_sum[i]+" ");
            i--;
        }
    }

    public static void rotate(int[] arr,int times)
    {
        int i=1,j;
        arr[arr.length-1]=0;
        display_sum_arrays(arr,arr.length);
        display_sum_arrays(arr,arr.length);
        while(i<=times)
        {
            j=0;
            int temp_2=arr[arr.length-1];
            while(j<arr.length-1)
            {
                arr[j+1]=arr[j];
                j++;
            }
            arr[0]=temp_2;
            i++;
        }

    }
}
