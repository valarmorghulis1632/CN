package Temp1.oops.methodoverriding;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

class Bank{
	
}

class ICICI extends Bank {
	
}

class Citi extends Bank{
	
}

class Dena extends Bank{
	
}
public class Test1 {

//	Bank maxLoanLimit(Bank bank){
//		return new Dena();
//	}
//	
//	Bank defaulterBank(Bank bank){
//		
//	}
	public static void main(String[] args) {
		Bank b = new ICICI();
		
		ICICI c = new ICICI();
		
	}
	
}
