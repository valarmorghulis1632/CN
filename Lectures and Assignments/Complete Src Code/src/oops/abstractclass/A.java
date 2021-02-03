package oops.abstractclass;


abstract class Bank{
	abstract void roi();
	
	public void fun1(){
		
	}
	
	public void fun2(){
		
	}
	
}

class CitiBank extends Bank{

	@Override
	void roi() {
			
	}
	
	
	void fun(){
		Bank b = new CitiBank();
		
		b.fun1();
	}
	
	
}








public class A {

}
