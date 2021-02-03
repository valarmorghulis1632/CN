package Lectures.Lecture_3_Functions_and_Arrays.Class_Codes;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/06/2017.
 */
public class Assignment_2A_AllinOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" /n  *****MENU*****" + " \n 1.Bst_Of_2_Test_Marks " + "\n 2.Even_Sum_Odd_Sum" + "\n 3.Nature_Of_Roots");
        System.out.print("\n 4.Pattern_Code_1"+"\n 5.Pattern_Code_2 "+ "\n 6.Pattern_Code_3"+"\n 7.Pattern_Code_4");
        System.out.print("\n 8.Pattern_Code_5"+"\n 9.Pattern_Code_6"+"\n 10.Power_Function"+"\n 11.Reverse_Of_Number");
        System.out.println("\n 12.Salary_Calculation"+"\n 13.Upper_or_lower_Case"+"\n");
        System.out.print("ENTER THE CHOICE: ");
        int choice=scan.nextInt();
        System.out.println("");
        switch (choice) {
            case 1:
                Bst_Of_2_Test_Marks();
                break;
            case 2:
                Even_Sum_Odd_Sum();
                break;
            case 3:
                Nature_of_Roots();
                break;
            case 4:
                Pattern_Code_1();
                break;
            case 5:
                Pattern_Code_2();
                break;
            case 6:
                Pattern_Code_3();
                break;
            case 7:
                Pattern_Code_4();
                break;
            case 8:
                Pattern_Code_5();
                break;
            case 9:
                Pattern_Code_6();
                break;
            case 10:
                Power_Function();
                break;
            case 11:
                Reverse_Of_Number();
                break;
            case 12:
                Salary_Calculation();
                break;
            case 13:
                Upper_or_lower_Case();
                break;
            default:
                System.out.println("\n    INVALID CHOICE");
                break;
        }
    }
    public static void Bst_Of_2_Test_Marks()
    { Scanner scan=new Scanner(System.in);
        char ch='y';
        do {
            System.out.print("Enter Your Name: ");
            String name=scan.next();
            System.out.println("\nEnter Name And Marks Of 3 Subjects You Have Studied: ");
            String subject1 = scan.next();
            float marks1 =scan.nextFloat();
            String subject2 = scan.next();
            float marks2 =scan.nextFloat();
            String subject3 = scan.next();
            float marks3 =scan.nextFloat();
            if(marks1>=marks3 && marks2>=marks3)
            {
                System.out.println(subject1+" & "+subject2+" have his/her best of 3");
                System.out.println("Average of the 2 is: "+((marks1+marks2)/2) +"\n");
            }
            else if(marks1>=marks2 && marks3>=marks2)
            {
                System.out.println(subject1+" & "+subject3+" have his/her best of 3");
                System.out.println("Average of the 2 is: "+((marks1+marks3)/2)+"\n");
            }
            else
            {
                System.out.println(subject2+" & "+subject3+" are his/her best out of 3 subjects");
                System.out.println("Average of the 2 is: "+((marks3+marks2)/2)+"\n");
            }
            System.out.println("Want to Enter for Another Student: ");
            ch=scan.next().charAt(0);

        }while(ch=='y' || ch=='Y');
    }

    public static void Even_Sum_Odd_Sum()
    {   Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int num=scan.nextInt();
        int evendigsum=0,odddigsum=0,dig=0;
        while(num>0) {
            dig = num % 10;
            if (dig % 2 == 0)
                evendigsum = evendigsum + dig;
            else odddigsum = odddigsum + dig;
            num = num / 10;
        }

        System.out.println("\nTHE SUM OF EVEN DIGITS APPEARING IN "+num+" : "+evendigsum);
        System.out.println("THE SUM OF ODD DIGITS APPEARING IN "+num+" : "+odddigsum);
    }
   public static void Nature_of_Roots()
   { Scanner scan=new Scanner(System.in);
       System.out.println("ENTER THE COEFFICIENTS a,b,c OF QUADRATIC EQUATION a(x^2)+bx+c: ");
       System.out.print("a = ");
       float a=scan.nextFloat();
       System.out.print("b = ");
       float b= scan.nextFloat();
       System.out.print("c = ");
       float c= scan.nextFloat();
       System.out.println("");
       double root1,root2,discriminant;
       discriminant=(Math.pow(b,2)-(4*a*c));
       if(discriminant>0) {
           root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
           root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
           System.out.println(" ROOTS ARE REAL AND DISTINCT");
           System.out.println("ROOTS ARE: "+ root1+ " & "+root2);
       }
       else if(discriminant<0) {
           System.out.println(" ROOTS ARE IMAGINARY AND CONJUGATE OF ONE ANOTHER");
           System.out.print("ROOTS ARE: " + (-b / (2 * a)) + "+i" + ((Math.sqrt((-1) * discriminant)) / 2 * a)+" & ");
           System.out.println((-b / (2 * a)) + "-i" + ((Math.sqrt((-1) * discriminant)) / 2 * a));
       }
       else {
           System.out.println(" ROOTS ARE REAL AND EQUAL");
           root1 = -b / (2 * a);
           root2 = root1;
           System.out.println("ROOTS ARE: " + root1 + " & " + root2);
       }
   }

   public static void Pattern_Code_1()
   { Scanner s=new Scanner(System.in);
       System.out.print("Enter the Number of rows: ");
       int row=s.nextInt();
       int i=1,j;
       System.out.println("\nThe Output is: \n");
       while(i<=row)
       {
           j = 1;
           while(j<=i) {
               System.out.print("1 ");
               j++;
           }
           System.out.println("");
           i++;
       }
   }
   public static void Pattern_Code_2()
   { Scanner scan=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER OF ROWS: ");
       int row=scan.nextInt();
       System.out.println("\n1 ");
       int i=1,j,k=1;
       while(i<=row) {
           j = 1;
           while (j <= (i + 1)) {
               if (j == 1 || j == (i + 1))
                   System.out.print(i + " ");
               else System.out.print(0 + " ");
               j++;
           }
           i++;
           System.out.println("");
       }
   }

   public static void Pattern_Code_3()
   { Scanner scan=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER OF ROWS: ");
       int row=scan.nextInt();
       System.out.println("\n1 ");
       int i=1,j,k=1;
       while(i<=row) {
           j = 1;
           while (j <= (i + 1)) {
               if (j == 1 || j == (i + 1))
                   System.out.print(1 + " ");
               else System.out.print(2 + " ");
               j++;
           }
           i++;
           System.out.println("");
       }
   }

   public static void Pattern_Code_4()
   { Scanner scan=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER OF ROWS: ");
       int row=scan.nextInt();
       System.out.println("");
       int i=1,j,k;
       while(i<=row) {
           k=1;
           j=row-i+1;
           while (j >= 1) {
               System.out.print(k + " ");
               k++;
               j--;
           }
           i++;
           System.out.println("");
       }
   }

   public static void Pattern_Code_5()
   { Scanner scan=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER OF ROWS: ");
       int row=scan.nextInt();
       System.out.println("");
       int i=1,j;
       while(i<=row) {
           j = row;
           while (j >= 1) {
               if (j == i)
                   System.out.print("* ");
               else System.out.print(j + " ");
               j--;
           }
           System.out.println("");
           i++;
       }
   }

   public static void Pattern_Code_6()
   { Scanner scan=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER OF ROWS: ");
       int row=scan.nextInt();
       System.out.println("");
       int i=1,j;
       while(i<=row) {
           j = row - i + 1;
           while (j >= 1) {
               if (i % 2 == 0)
                   System.out.print(0 + " ");
               else System.out.print(1 + " ");
               j--;
           }
           i++;
           System.out.println("");
       }
   }

   public static void Power_Function()
   { Scanner scan=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER X AND THE POWER TO WHICH ITS TO BE RAISED N: ");
       float x=scan.nextFloat();
       int n=scan.nextInt(),i=1;
       float equivalent=1.0f;   //final answer of x^n
       while(i<=n)
       {
           equivalent = equivalent * x;
           i++;
       }
       System.out.println("\nNumber "+x+" Raised to the Power "+n+" is: "+equivalent);
   }

   public static void Reverse_Of_Number()
   { Scanner scan=new Scanner(System.in);
       System.out.print("ENTER A NUMBER: ");
       int num=scan.nextInt();
       int dig=0,rev=0,n;
       n=num;
       while(n>0) {
           dig = n % 10;
           rev = dig + (rev * 10);
           n = n/10;
       }
       System.out.println("THE REVERSE OF GIVEN NUMBER "+num+" IS: "+rev);
   }

   public  static void Salary_Calculation()
   {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Your Name: ");
       String name=scan.nextLine();
       System.out.println("Enter Your Basic Pay: ");
       float basic=scan.nextFloat();
       System.out.println("Enter Your Employee Grade Assigned By The Company: ");
       char grade=scan.next().charAt(0);
       float hra=(20.0f/100)*basic;
       float da=(50.0f/100)*basic;
       int allowance=0;
       if(grade=='A' || grade=='a')
           allowance=1700;
       else if(grade=='B' || grade=='b')
           allowance=1500;
       else if( grade=='C' || grade=='c')
           allowance=1300;
       double pf=(11.0d/100)*basic;
       double total_salary= basic + hra + da - pf + allowance;
       System.out.println("\nTOTAL SALARY OF EMPLOYEE " +name+ " IS: "+ total_salary);
   }

   public static void Upper_or_lower_Case()
   {
       Scanner scan=new Scanner(System.in);
       System.out.println("ENTER THE CHARACTER TO BE TESTED: ");
       char character=scan.next().charAt(0);
       if(upper(character))
           System.out.println(character + " is an UPPER CASE one");
       else if(lower(character))
           System.out.println(character + " is an LOWER CASE one");
       else System.out.println(character+" is an INVALID one (Niether Upper case nor Lower case)");
   }

   public static boolean upper(char ch)
   {
       if(ch>=65 && ch<=90)
           return true;
       else return false;
   }

   public static boolean lower(char ch)
   {
       if(ch>=97 && ch<=122)
           return true;
       else return false;
   }
}

