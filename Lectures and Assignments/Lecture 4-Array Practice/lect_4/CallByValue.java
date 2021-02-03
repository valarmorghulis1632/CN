package lect_3;

/**
 * Created by ankurkumar on 6/13/17.
 */
public class CallByValue {


    public static void main(String[] args) {
//        int a=10;
//        int b = 20;
//        System.out.println(a+"    "+b);
//        swap(a,b);
//        System.out.println(a+"    "+b);

        int z = 10;
        System.out.println(z);
        z = increment(z);
        System.out.println(z);



    }




    public static int increment(int x){
        //x=x+1;
        return x++;
    }








    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"    "+b);
    }



}
