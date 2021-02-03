package lect_3;

/**
 * Created by ankurkumar on 6/13/17.
 */
public class ArrayPractise {

    public static void main(String[] args) {
        int arr[] = new int[5];
        fillArray(arr);
        printArray(arr);

    }


    public static void fillArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] =i+1;
        }

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
