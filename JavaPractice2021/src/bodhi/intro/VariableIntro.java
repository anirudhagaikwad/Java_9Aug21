package bodhi.intro;

/*
 * Understand Variables in java
 * 
 */

public class VariableIntro {

/**  Instance Variable ,Static Variable,Local Variable 

	dataType varname=value;

    {block }
	
	Data Types - int,short,byte,float,double,string.boolean
	*/
	
	public int numFirst=10;
	private int num;
	static int numSec=99;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// loacal variable 
		
		int i=55;
		System.out.print("static variable"+VariableIntro.numSec);
		System.out.print("local variable"+i);

	}

}
