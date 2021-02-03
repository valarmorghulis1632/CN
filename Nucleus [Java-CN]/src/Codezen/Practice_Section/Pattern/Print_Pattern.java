package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Print_Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        print_pattern(num);
    }

    public static void print_pattern(int n)
    {
        int i=0,j=n-1,k,count=0,l=1;
        int[][] arr=new int[n][n];
        while(i!=j)
        {
            if (count % 2 == 0) {
                k = 0;
                while (k < arr[0].length) {
                    arr[i][k] = l;
                    l++;
                    k++;
                }
                count++;
                i++;
            }
            else
            {
                k=0;
                while(k<arr[0].length)
                {
                    arr[j][k]=l;
                    l++;
                    k++;
                }
                count++;
                j--;
            }
        }

        k=0;
        while(k<arr[0].length)
        {
            arr[i][k]=l;
            l++;
            k++;
        }
         i=0;
        while(i<arr.length)
        {
            j=0;
            while(j<arr[0].length)
            {
                System.out.print(arr[i][j]+" ");
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
