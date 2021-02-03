package lect_oops.oops_2.exceptionhandling.examples;

public class Example_2 {

	    public static void aMethod() 
	    {
	        try 
	        {
	        	
	            throw new RuntimeException(); 
	            
	        } catch(Exception e){
	        	System.out.println("a");
	        }
	        finally 
	        {
	            System.out.print("finally ");
	        } 
	    } 
	    public static void main(String args[]) 
	    {
	        try 
	        {
	            aMethod();  
	        } 
	        catch (Exception e) 
	        {
	            System.out.print("exception "); 
	        } 
	        System.out.print("finished"); 
	    } 
	}