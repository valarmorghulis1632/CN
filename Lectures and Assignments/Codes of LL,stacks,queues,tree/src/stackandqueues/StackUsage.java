package stackandqueues;

public class StackUsage {
	public static void main(String[] args) {
		OurStack myStack = new OurStack();
		try {
			for(int i =0;i<100;i++){
				myStack.push(i);
			}
			
	
			while(!myStack.isEmpty()){
				System.out.println(myStack.pull());
			}
			
			
			
			
		} catch (MyStackOverFlowException e) {
			
		}
	}
}
