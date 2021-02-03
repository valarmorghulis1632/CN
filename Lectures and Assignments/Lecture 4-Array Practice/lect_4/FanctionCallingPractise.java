package lect_3;

/**
 * Created by ankurkumar on 6/13/17.
 */
public class FanctionCallingPractise {

    public static void main(String[] args) {


        int a =3;
        int b = 6;

        fun1(a,b);

    }







    public static void fun1(int a, int b){

        fun2(a,b);

    }

     public static void fun2(int a, int b){

        fun1(a,b);
        // System.out.println(a+"    "+b);
//         fun3(b);
//         System.out.println("qweq    we  qew");
//         int x = 10;
//         int y = x+1000;

    }


   public static void  fun3(int c){

       System.out.println(c);
    }
}
