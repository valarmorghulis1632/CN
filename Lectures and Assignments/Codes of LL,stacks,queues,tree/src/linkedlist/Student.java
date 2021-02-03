package linkedlist;

public class Student implements Comparable<Student>{

	String name;
	int age;
	int rollNumber;
	@Override
	public int compareTo(Student o) {
		
		if(this.age>o.age){
			return 1;
		}else if(this.age<o.age){
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age=20;
		Student s2 = new Student();
		s2.age=30;
		if(s1.compareTo(s2)>0){
			
		}
	}
}
