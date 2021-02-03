/**
 * A sorted array has been rotated by some number k in clockwise
 direction. Find k. E.g. Input: 5,6,1,2,3,4 Output: 2
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_4_Arrays;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Rotation_by_k {




    public static void main(String[] args) {

        int[] arr = new int[5];
        arr = new int[6];
        System.out.println(arr[3]);
    }
//         Scanner scan=new Scanner(System.in);
//        int[] array=new int[20];
//        System.out.print("ENTER THE LENGTH OF ARRAY: ");
//        int array_length=scan.nextInt();
//        System.out.print("\nENTER THE TERMS IN ARRAY: ");
//        fill_array(array,array_length);
//        int rotation=Bubble_Sort(array);
//        System.out.println("\nNUMBER OF ROTATIONS IS: "+rotation);
//    }
//
//    public static void fill_array(int[] array,int array_length)
//    {   Scanner scan=new Scanner(System.in);
//        int i=0;
//        while(i<array_length) {
//            System.out.print(" ");
//            array[i] = scan.nextInt();
//            i++;
//        }
//    }
//
//    public static int Bubble_Sort(int[] arr)
//    {
//        int i=0,j=0,temp;
//        for(i=0;i<arr.length;i++)
//        {
//            for (j=0; j<arr.length-i-1; j++)
//            {
//                if (arr[j] > arr[j+1])
//                {
//                    temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return i;
//    }
}

