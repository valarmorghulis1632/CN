package lect_3;

/**
 * Created by ankurkumar on 6/15/17.
 */
public class AssignmentPractise {

    public static void main(String[] args) {






        int arr[] = {3,8,9,0,5,9};



        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        for(int i: arr){
            System.out.println(i);
//            if(){
//                break;
//            }
        }













        selectionSort(arr);
        ArrayPractise.printArray(arr);







    }


    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){

            int minIndex = getMinIndex(arr, i);
            swap(arr,i,minIndex);

        }
    }


    public static  int getMinIndex(int arr[], int startIndex){
        int minIndex =-1;
        int minValue= Integer.MAX_VALUE;

        for(int i=startIndex;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }




    public static double getSqroot(int num){
        double start =1;
        while(start*start<num){
            start=start+1;
        }
        return start-1;
    }






}
