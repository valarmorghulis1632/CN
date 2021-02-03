package Important_Topics.Sorting_Techniques;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fill_array(arr);
        quick_sort(arr,0,arr.length-1);
        int i=0;
        while(i<arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
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
