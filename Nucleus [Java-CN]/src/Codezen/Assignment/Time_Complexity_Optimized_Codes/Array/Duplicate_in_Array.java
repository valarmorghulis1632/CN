package Codezen.Assignment.Time_Complexity_Optimized_Codes.Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Duplicate_in_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY (N): ");
        int array_length = scan.nextInt();
        int[] array = new int[array_length];
        System.out.print("\nENTER THE TERMS IN ARRAY (0 TO N-2): ");
        fill_array(array);
        int duplicate=duplicate_calc(array);
        if(duplicate!=Integer.MAX_VALUE)
        {
            System.out.println("\nTHE DUPLICATE ELEMENT IS: "+duplicate);
        }
        else
        {
            System.out.println("\nARRAY CONSISTS OF NO DUPLICATES");
        }
    }

    public static void fill_array(int[] array)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int duplicate_calc(int[] input)
    {
        quick_sort(input,0,input.length-1);
        int i=0,ans=Integer.MAX_VALUE;
        while(i<input.length-1)
        {
            if(input[i]==input[i+1])
            {
                ans=input[i];
                break;
            }
            i++;
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
            if(input[i]>temp && input[j]<temp)
            {
                int swap=input[i];
                input[i]=input[j];
                input[j]=swap;
                i++;
                j--;
            }

            else if(input[i]<=temp && input[j]<=temp)
            {
                i++;
            }

            else if(input[i]>=temp && input[j]>=temp)
            {
                j--;
            }
            else if(input[i]<temp && input[j]>temp)
            {
                i++;
                j--;
            }
        }
        return count;
    }

}
