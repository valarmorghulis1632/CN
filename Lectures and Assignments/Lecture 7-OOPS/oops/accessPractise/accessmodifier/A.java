package Temp1.oops.accessPractise.accessmodifier;

public class A {
	
	protected int x;
	
	protected void fun1(){
		
	}
	
	void fun2(){
		fun1();
	}
	
	private void fun3(){
		fun1();
		System.out.println(x);
	}

}
