package Codezen.Problems_of_Day;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Elevation_Map {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fillarray(arr,elem);
        int units=elevation(arr,elem);
        System.out.println("\nUNITS OF WATER IS: "+units);
    }

    public static void fillarray(int[] array,int arraylength)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<arraylength) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int elevation(int[] arr,int elem)
    {
        int height=(arr[0]<arr[elem-1])?arr[0]:arr[elem-1];
        int i=1,units=0;
        while(i<elem-1)
        {

            int diff=(height-arr[i]);
            if(diff>0)
            {
                units=units+diff;
            }
            height=(height<arr[i])?arr[i]:height;
            height=(height<arr[elem-1])?height:arr[elem-1];
            i++;
        }
        return units;
    }
}

