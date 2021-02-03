package Practice_Quests.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 10/07/2017.
 */
public class Print_Permutation_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fill_array(arr);
//        print_permutations(input,result);
        int[] result=new int[0];
        print_permutations_1(arr,result);
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

    public static void print_permutations_1(int[] input,int[] result)
    {
        if (input.length==0)
        {
           int i=0;
           while(i<result.length)
           {
               System.out.print(result[i]+" " );
               i++;
           }
            System.out.println("");
            return;
        }
        int i=0;

        while(i<result.length+1)
        {
            int[] small = new int[result.length + 1];
            int j = 0, k = 0;
            while (j < i) {
                small[k] = result[j];
                j++;
                k++;
            }
            small[k] = input[0];
            k++;
            j = i;
            while (j < result.length) {
                small[k] = result[j];
                j++;
                k++;
            }
            int small_arr[]=new int[input.length-1];
            int l=0;
            while(l<small_arr.length)
            {
                small_arr[l]=input[l+1];
                l++;
            }
            print_permutations_1(small_arr,small);
            i++;
        }
    }
}
