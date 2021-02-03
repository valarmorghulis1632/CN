package Important_Topics.Sorting_Techniques;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] arr=new int[elements];
        fillarray(arr);
//        bubble_sort_optimized(arr);
        bubble_sort_normal(arr);
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

    public static void bubble_sort_normal(int[] arr)
    {
        int i=0,j=0,temp;
        for(i=0;i<arr.length;i++) {
            for (j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            int k=0;
            System.out.println("");
            while(k<arr.length)
            {
                System.out.print(arr[k]+" ");
                k++;
            }
        }
    }

    public static void bubble_sort_optimized(int[] input)
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
                break;
            }
            i++;
        }
    }
}
