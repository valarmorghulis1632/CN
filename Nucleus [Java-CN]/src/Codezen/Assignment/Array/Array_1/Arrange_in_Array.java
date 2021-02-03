package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Arrange_in_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int array[]=arrange(number);
        Swap_Alternate_Elements.display_array(array,array.length);
    }

    public static int[] arrange(int num)
    {
        int i=1;
        int array[]=new int[num];
        while(i<=num)
        {
            if(i%2!=0)
            {
                array[i/2]=i;
            }
            else
            {
                array[num-(i/2)]=i;
            }
            i++;
        }
        return array;
    }
}
