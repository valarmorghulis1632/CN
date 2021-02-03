package Temp1.oops.staticPractise;

class Student {
	String name;
	long phoneNumber;
	int age;
	String email;
	int rollNumber;
	static String batch = "Java";
	
	public static void study(){
		System.out.println(batch);
		//System.out.println(email);
		//play();
		dance();
	}
	
	public  void play(){
		dance();
	}
	
	public static void dance(){
		
	}
	
	public static void main(String[] args) {
		
	}
}








public class Test {
 public static void main(String[] args) {
	
	 String[] arr = {"","djhwe"};
	 Student.main(arr);
	 System.out.println(Student.batch);
	 Student.study();
	 
	 
	Student s1 = new Student();
	s1.name = "abc";
	s1.age = 21;
	s1.rollNumber = 32;
	s1.study();
	
	Student s2 = new Student();
	s2.name = "abc";
	s2.age = 21;
	s2.rollNumber = 32;
	s2.study();
	
	System.out.println(s1.batch);
	System.out.println(s2.batch);
	s1.batch = "C++";
	System.out.println(s1.batch);
	System.out.println(s2.batch);
			
	
}
}
