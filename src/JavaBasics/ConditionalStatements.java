package JavaBasics;

public class ConditionalStatements {
	
	public void ifStatements() {
		
		// if Statement		
		if(true) {
			
			System.out.println( "The if condition is satisfied" );
			
		}
		
		
		// if - else statement		
		boolean blnForIfElse = false;
		if(blnForIfElse) {
			System.out.println( "The if condition is satisfied" );
		}			
		else {		
			System.out.println( "The else condition is satisfied" );
		}
		
		// if-else if-else
		
		boolean blnForIfElseIf = true ;
		if( blnForIfElse ) {
			
			
		}else if( blnForIfElseIf ) {
			
			System.out.println( "The else if condition is satisfied" );
			
		}else {
			
			
		}
		
	}
	

	
	public void switchStatement() {
		
		String key = "Hello";
		//key = "Hi";
		//key = "";
		
		switch (key) {
		
		case "Hi":			
			System.out.println("I am in Hi Block");
			break;
			
		case "Hello":			
			System.out.println("I am in Hello Block");
			break;

		default:			
			System.out.println("I am in default");
			break;
		}
		
	}
	
	
	
	

}
