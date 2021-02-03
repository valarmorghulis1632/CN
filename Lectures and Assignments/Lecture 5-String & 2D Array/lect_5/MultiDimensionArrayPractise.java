package lect_4;

import java.util.Scanner;

/**
 * Created by ankurkumar on 6/17/17.
 */
public class MultiDimensionArrayPractise {

    public static void main(String[] args) {

        int[][] arr = getMultiDArray();


        printMultiDArray(arr);



//        int arr[] = new int[];
//
//        int[][] arr1 = new int[4][4];
//
//        int[][] arr2 = new int[2][];
//
//
//        int[][] arr3 = new int[][];
//
//
//        int[][] arr4 = new int[][2];


    }





   int[][] getMultiDimensionVraibaleLengthArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("No of rows");
        int rows = s.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0;i<arr.length;i++){
            System.out.println("Number of cols for row "+i);
            int col = s.nextInt();
            arr[i] = new int[col];
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = s.nextInt();
            }
        }

        return arr;


    }











   public static  int[][] getMultiDArray(){

        Scanner s = new Scanner(System.in);
       System.out.println("Enter no of rows");
       int rows = s.nextInt();
       System.out.println("Enter no of cols");
      int cols =  s.nextInt();

      int[][] arr = new int[rows][cols];
      for(int i=0;i<arr.length;i++){
          for(int j =0;j<arr[i].length;j++){
              arr[i][j] = s.nextInt();
          }
      }

      return arr;
    }




 public static  void   printMultiDArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j] );
            }
        }
    }





















}
