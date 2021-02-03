package Codezen.Assignment.Array.Array_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Scan_Only_Once_0s_1s_2s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        sort_by_scan_only_once(array,array_length);
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

    public static void disp_sorted_array(int[] array,int array_length)
    {
        int i=0;
        System.out.println("\nSORTED ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
    }

    public static void sort_by_scan_only_once(int[] arr,int arr_length)
    {
        int low=0,mid=0,high=arr_length-1;
        while(mid<=high)
        {
            switch (arr[mid])
            {
                case 0:
                    if(arr[low]!=0 || mid==low)
                    {
                        swap(arr, mid, low);
                        mid++;
                        low++;
                    }
                    else
                    {
                        low++;
                    }
                    break;

                case 1:if(arr[low]!=1)
                        {
                            low++;
                        }
                    mid++;
                    break;

                case 2:
                    if (arr[high] != 2)
                    {
                        swap(arr,mid,high);
                        if(arr[mid]<arr[low])
                        {
                            swap(arr,mid,low);
                            low++;
                        }
                        mid++;
                        high--;
                    }
                    else
                    {
                        high--;
                    }
                 default: break;
            }
        }
        disp_sorted_array(arr,arr_length);
    }

    public static void swap(int[] arr,int mid,int other_index )
    {
        int temp=arr[mid];
        arr[mid]=arr[other_index];
        arr[other_index]=temp;
    }

}
