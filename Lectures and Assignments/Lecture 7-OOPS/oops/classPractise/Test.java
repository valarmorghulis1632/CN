package Temp1.oops.classPractise;

 class Student {

	 static int unique = 0; 
	 Student(){
		 
		 this.rollNumber =unique++;
	 }
	String name;
	long phoneNumber;
	int age;
	String email;
	int rollNumber;
	
	
}

public class Test{
	
	public static void main(String[] args) {
//		Student s = new Student();
//		s.name ="fdnwjkenf";
//		s.age= 23;
//		s.email="jewdjweh@gmail.com";
//				
//		Student s2 = new Student();
//		s2.name ="fdnwjkenf";
//		s2.age= 23;
//		s2.email="jewdjweh@gmail.com";
//		System.out.println(s);
//		
//		System.out.println(s.age+" "+s.name+" "+s.email+" "+s.phoneNumber);
//	
//	
		
		Student[] studentArray = new Student[10];
	
		
		for(int i=0;i<studentArray.length;i++){
			studentArray[i] = new Student();
			studentArray[i].name = "abc"+i;
			studentArray[i].age = 10+i;
			studentArray[i].email = "abc"+i+"@gmail.com";
		}
		
		for(int i=0;i<studentArray.length;i++){
			System.out.println(studentArray[i].name+" "+studentArray[i].age+" "+studentArray[i].email);
		}
		
		
		
		
		
		
		
		
	}
}