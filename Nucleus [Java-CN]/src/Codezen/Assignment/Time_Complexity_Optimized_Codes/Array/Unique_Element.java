package Codezen.Assignment.Time_Complexity_Optimized_Codes.Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Unique_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        int[] array = new int[array_length];
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array);
        int unique = unique_element_calc(array);
        if (unique != Integer.MAX_VALUE)
            System.out.println("\nTHE UNIQUE ELEMENT IS: " + unique);
        else System.out.println("\nNO UNIQUE ELEMENT PRESENT");

    }

    public static void fill_array(int[] array) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int unique_element_calc(int[] input)
    {
        quick_sort(input,0,input.length-1);
        int i=0,ans=Integer.MAX_VALUE,flag=0;
        while(i<input.length-1)
        {
            if(input[i]==input[i+1])
            {
                i=i+2;
            }
            else
            {
                ans=input[i];
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            return input[input.length-1];
        }
        return ans;
    }

    public static void quick_sort(int[] input,int start,int end)
    {
        if(start>=end)
        {
            return;
        }

        int pos=get_position(input,start,end);
        quick_sort(input,start,pos-1);
        quick_sort(input,pos+1,end);
    }

    public static int get_position(int[] input,int start,int end)
    {
        int i=start+1,count=0;
        while(i<=end)
        {
            if(input[i]<input[start])
            {
                count++;
            }
            i++;
        }

        int temp=input[start];
        input[start]=input[start+count];
        input[start+count]=temp;
        int j=end;
        i=start;
        count=start+count;
        while(i<count && j>count)
        {
            if (input[i] < temp)
            {
                i++;
            }
            else if(input[j] > temp)
            {
                j--;
            }
            else
            {
                int swap=input[i];
                input[i]=input[j];
                input[j]=swap;
            }
        }
        return count;
    }
}
