package lect_3;

/**
 * Created by ankurkumar on 6/13/17.
 */
public class VariableScopePractise {


    public static void main(String[] args) {
        fun(10);
    }

    public static void fun(int n){


        int i=20;

        for( i=0;i<10;i++){
            for(int j =0;j<10;j++){

                System.out.println(i+j);


            }

            System.out.println(i);
        }













//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }





        System.out.println(i);











        int k =20;
       // char k =30;



        if(n==10) {
             k = 20;
        }



        System.out.println(k);


//        if(n==10){
//            int k =10;
//            System.out.println("hello");
//            System.out.println(n);
//        }
//        System.out.println(k);
//        System.out.println(n);
    }
}
