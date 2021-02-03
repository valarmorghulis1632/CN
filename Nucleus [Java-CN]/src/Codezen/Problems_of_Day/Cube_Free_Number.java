package Codezen.Problems_of_Day;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Cube_Free_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        cube_free_calc(num);
//        int position=cube_free_calc(num);
//        if(position!=Integer.MAX_VALUE)
//           System.out.println(position);
//        else System.out.println("\nNOT CUBE FREE");
    }

    public static void cube_free_calc(int num)
    {
//        int i=2;
//        int arr[]=new int[num+1],k=1,count,count_div;
//        arr[0]=1;
//        while(i<=num)
//        {
//            if(cube_check(i))
//            {   count=0;
//                count_div=0;
//                int j =2;
//                while (j<=i)
//                {
//                    if (i%j==0)
//                    {
//                        count++;
//                        if(cube_check(j))
//                            count_div++;
//                    }
//                    j++;
//                }
//                if(count==count_div)
//                {
//                    arr[k]=i;
//                    k++;
//                }
//            }
//            i++;
//        }
//        if(arr[k-1]==num)
//            return k;
//        return Integer.MAX_VALUE;
//    }
//
//    public static boolean cube_check(int x)
//    {
//        int i=1;
//        while(i*i*i<x)
//        {
//            i++;
//        }
//        if(i*i*i==x)
//            return false;
//        else return true;
//    }
        int i=2;
        int arr[]=new int[num+1],k=1,count,count_div;
        arr[0]=1;
        while(i<=num)
        {
            if(cube_check(i))
            {   count=0;
                count_div=0;
                int j =2;
                while (j<=i)
                {
                    if (i%j==0)
                    {
                        count++;
                        if(cube_check(j))
                            count_div++;
                    }
                    j++;
                }
                if(count==count_div)
                {
                    arr[k]=i;
                    k++;
                }
            }
            i++;
        }
        if(arr[k-1]==num)
            System.out.print(k);
        else System.out.print("Not Cube Free");
    }

    public static boolean cube_check(int x)
    {
        int i=1;
        while(i*i*i<x)
        {
            i++;
        }
        if(i*i*i==x)
            return false;
        else return true;
    }
}
