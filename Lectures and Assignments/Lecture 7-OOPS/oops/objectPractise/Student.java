package Temp1.oops.objectPractise;



/**
 * Created by ankurkumar on 7/6/17.
 */


public class Student{
    String name;
    int age;
    int rollNumber;

    public void fun1(){

    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Student){
            if(this.name.equals( ((Student)obj).name)){
            	return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name+ " "+age+" "+rollNumber;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.age= 22;
        s.name = "shdahjdga";
        s.rollNumber = 23;
        
        //s=null;
        
        
        
        
        
        

        Student s1 = new Student();
        s1.age= 22;
        s1.name = "shdahjdga";
        s1.rollNumber = 23;

        if(s1.equals(s)){
            System.out.println("both equal");
        }else{
            System.out.println("Not equal");
        }
       // System.out.println(s);
        
        
        Integer x= 10;
        x.equals(4);
        
        
        
        
        
        
    }

}















