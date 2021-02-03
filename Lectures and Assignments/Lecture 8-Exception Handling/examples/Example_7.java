package lect_oops.oops_2.exceptionhandling.examples;

public class Example_7 
	{ 
	    public static void main(String [] args) 
	    {
	        try 
	        {
	            badMethod();  
	            System.out.print("A"); 
	        }  
	        catch (Exception ex) 
	        {
	            System.out.print("B"); 
	        }  
	        finally 
	        {
	            System.out.print("C"); 
	        }  
	        System.out.print("D"); 
	    }  
	    public static void badMethod() {} 
	} 