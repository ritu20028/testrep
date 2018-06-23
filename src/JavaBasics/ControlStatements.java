package JavaBasics;

public class ControlStatements {


	public void forStatement(){

		for (int i=0 ; i < 5 ; i++) {

			System.out.println("The value of i in for loop " + i);
		}
		
	}
	
	
	
	
	public void whileStatement() {
		
		int i = 0;
		
		while (i<5) {
			
			System.out.println("The value of i in while loop " + i);
			++i;
		}
		
	}
	
	
	public void doWhileStatement() {
		
		int i = 0;
		do {
			
			
			System.out.println("The value of i in do while loop " + i);
			++i;
					
		}while(i<5);
		
	}
	
	
}
