package Temp1.oops.constructor;

 class Student {
		String name;
		int phoneNumber;
		int age;
		String email;
		int rollNumber;
		
		Student(String name, int phoneNumber, int age){
			this.name = name;
			this.phoneNumber =phoneNumber;
			this.age =age;
			email = "abc@gmail.com";
		}
		Student(){
			name = "kjhdjkqwhdk";
			phoneNumber =90909090;
			age =20;
			email = "abc@gmail.com";
		}
		Student(String n){
			name = n;
			phoneNumber =90909090;
			age =20;
			email = "abc@gmail.com";
		}
		
		Student(String n, int a){
			name = n;
			age =a;
		}
		
		@Override
		public String toString() {
		
		return name+" "+age+" "+ email+" "+phoneNumber;
		}
		
}

 
 public class Test{
	 public static void main(String[] args) {
		 
		 System.out.println(args.length);
		 for(String str:args){
			 System.out.println(str);
		 }
		 
		 
		 System.out.println(args[1]);
		 
		 
		 
		//Student s1 = new Student();
		 Student s1 = new Student("Amit",9999999,22);
		 s1.name = "wehjfkwejfjhwe";
		 
//		 Student s2 = new Student("Amit",9999999,22);
//		 Student s3 = new Student("Amit",9999999,22);
//		 
//		 
//		 System.out.println(s1);
		 
		 
		 
		 
		 
//		 System.out.println(s1.age+" "+s1.name+" "+s1.phoneNumber);
//		 System.out.println(s1.email);
//		 
		 
//		 Student s2 = new Student("Amit",9999999);
//		 Student s3 = new Student();
		 
//		s1.name = "Amit";
//		s1.age = 22;
//		s1.email = "anc@gmail.com";
//		s1.rollNumber = 32;
		
//		Student s2 = new Student("Anil",12768768,21);
//		s2.name = "anil";
//		s2.age = 12;
//		s2.email = "ancc@gmail.com";
//		s2.rollNumber = 12;
				
	}
 }