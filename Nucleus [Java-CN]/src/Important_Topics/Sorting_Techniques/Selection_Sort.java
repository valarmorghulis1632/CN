package Important_Topics.Sorting_Techniques;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array,array_length);
        selection_sort(array,array_length);
        display_array(array,array_length);
    }

    public static void fill_array(int[] array,int array_length)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void selection_sort(int[] array,int array_length)
    {
        int i=0,j,small;
        while(i<array_length-1)
        {
            j=i;
            int pos=0;
            small=Integer.MAX_VALUE;
            while(j<array_length)
            {
                if(small>array[j])
                {
                    small = array[j];
                    pos=j;
                }
                j++;
            }
            int temp=array[i];
            array[i]=array[pos];
            array[pos]=temp;
            i++;
        }
    }

    public static void display_array(int[] array,int array_length)
    {
        int i=0;
        System.out.print("THE REVERSE OF GIVEN ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
    }
}
