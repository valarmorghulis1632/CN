/**
 * Created by ankurkumar on 6/10/17.
 */
import java.util.Scanner;

public class FtoC {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input Max value");


        int max  = s.nextInt();


        String st1 = s.nextLine();
        char ch = s.next().charAt(0);



        System.out.println(max+" "+st1+" "+ ch);








        int celsius ;
        int fahrenhiet =0;

        while(fahrenhiet<=max) {
            celsius = (int) ((5.0 / 9) * (fahrenhiet - 32));
            System.out.println(fahrenhiet + "     " + celsius);
            fahrenhiet = fahrenhiet+20;
        }
    }
}
