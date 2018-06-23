package JavaBasics;
import java.util.*;


public class Datatypes {
	
	boolean blnDefault;
	char chrDefault;
	byte byteDefault;
	short shrtDefault;
	int intDefault;
	long longDefault;
	float floatDefault;
	double doubleDefault;
	
	
	public void primitiveDatatypesDefaults() {
		
		System.out.println("Default value for boolean :" + blnDefault);
		System.out.println("Default value for char  :" + chrDefault);
		System.out.println("Default value for byte  :" + byteDefault);
		System.out.println("Default value for short  :" + shrtDefault);
		System.out.println("Default value for integer  :" + intDefault);
		System.out.println("Default value for long  :" + longDefault);
		System.out.println("Default value for float  :" + floatDefault);
		System.out.println("Default value for double  :" + doubleDefault);
		
	}
	
	public void nonPrimitiveDatatypes() {
		
		int[] arrayOfIntegers = new int[2];
		
		arrayOfIntegers[0] = 10 ;
		arrayOfIntegers[1] = 20 ;
		
		System.out.println("Integer Held @ Index 0 of the Array :" + arrayOfIntegers[0]);
		System.out.println("Integer Held @ Index 0 of the Array :" + arrayOfIntegers[1]);
		
		
		List<Integer> listOne = new ArrayList<Integer>();	
		listOne.add(0, 10);
		listOne.add(1, 20);
		listOne.add(2, 30);
		
		System.out.println("Value held @ Index 0 of the List :" + listOne.get(0));
		System.out.println("Value held @ Index 0 of the List :" + listOne.get(2));
		
		
		
		
		
		
		
		
	}

}
