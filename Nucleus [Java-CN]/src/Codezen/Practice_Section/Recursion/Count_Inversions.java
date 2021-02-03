package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 02/07/2017.
 */
public class Count_Inversions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] input=new int[elem];
        Floor_Value.fillarray(input);
        System.out.println("\nINVERSIONS = "+count_inversions(input,0));
    }

    public static long count_inversions(int[] input,int index)
    {
        if(index==input.length)
        {
            return 0;
        }

        int count=0;
        int i=index+1;
        while (i<input.length)
        {
            if(input[index]>input[i])
                count++;
            i++;
        }
        return count+count_inversions(input,index+1);
    }
}
