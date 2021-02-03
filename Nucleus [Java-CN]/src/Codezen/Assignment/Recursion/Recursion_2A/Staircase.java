package Codezen.Assignment.Recursion.Recursion_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 22/06/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("WAYS: " + staircase_recursion(n));
//        System.out.println("WAYS: " + staircase(n));
    }

    public static int staircase_recursion(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        if(num==2)
        {
            return 2;
        }
        return staircase_recursion(num-1)+staircase_recursion(num-2)+staircase_recursion(num-3);
    }

//    public static int staircase(int num)
//    {
//        return formula(num);
//    }
//
//    public static int formula(int num)
//    {
//        int[] arr=new int[num+1];
//        arr[0]=1;
//        int i=1;
//        while(i<arr.length)
//        {
//            if(i==1)
//            {
//                arr[i]=arr[i-1]+arr[i];
//                System.out.print(arr[i]+" ");
//            }
//            else if(i==2)
//            {
//                arr[i]=arr[i-1]+arr[i-2];
//                System.out.print(arr[i]+" ");
//            }
//            else
//            {
//                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
//                System.out.print(arr[i]+" ");
//            }
//            i++;
//        }
//        return arr[num];
//    }
}
