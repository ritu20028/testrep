package JavaBasics;

public class Runner {

	public static void main(String[] args) {
		
		//Variables
		
		Variables variableOne = new Variables();		
		variableOne.globalVariable();
		variableOne.localVariable();
		
		//Data Types 
		
		Datatypes dataType = new Datatypes();		
		dataType.primitiveDatatypesDefaults();
		dataType.nonPrimitiveDatatypes();
		
		//Control Statements 
		
		ControlStatements controlStatements = new ControlStatements();
		controlStatements.forStatement();
		controlStatements.whileStatement();
		controlStatements.doWhileStatement();
		
		
		//Conditional Statements
		
		ConditionalStatements conditionalStatements = new ConditionalStatements();		
		conditionalStatements.ifStatements();
		conditionalStatements.switchStatement();
		
		
	}

}
