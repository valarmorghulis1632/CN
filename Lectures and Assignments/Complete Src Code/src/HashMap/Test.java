package HashMap;

 class Student {

	String name;
	int rollNumber;
	
	@Override
	public boolean equals(Object obj) {
		return this.rollNumber==((Student)obj).rollNumber;
	}
	
	@Override
	public int hashCode() {
		
		return rollNumber;
	}
}

class Test{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNumber=8;
		Student s2 = new Student();
		s2.rollNumber=8;
		if(s1.equals(s2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
