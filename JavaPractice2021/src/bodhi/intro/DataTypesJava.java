/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Understand Data Types
 * Primitive ,Non-Primitive
 * 
 * Primitive --> Integer : int,byte,short,long
 * byte - 1 byte : 8bits Range- 0-128
 * shrot - 2byte :16 bit Rang - -32769 - 23767
 * int - 4byte : 32 bit Range - -2147483648-2147483647
 * long - 8byte : 64 bit Range -9223372036854775808 - 9223372036854775807
 * 
 * Floting point  --> float,double
 * float - 4byte 
 * double - 8byte
 * 
 * Character
 * char - 2byte Range - 0-65635
 * 
 * Boolean 
 * 
 * 
 * 
 * Non Primitive -- > String
 * 
 * 
 */



public class DataTypesJava {

	/**
	 * @param args
	 */
	
	static int num=10;
	static short numShort=20;
	static byte numByte=15;
	static long numLong=55;
	
	
	static float numFloat=44.0f;
	static double numDouble=33.00d;
	
	static char varChar='A';
	
	static boolean varBool=true;
	
	static String varString="Sangola";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("integer : "+num);
		System.out.print("short : "+numShort);
		System.out.print("byte : "+numByte);
		System.out.print("long : "+numLong);
		System.out.print("float : "+numFloat);
		System.out.print("double : "+numDouble);
		System.out.print("char : "+varChar);
		System.out.print("boolean : "+varBool);
		
		System.out.print("string : "+varString);
		
		
		

	}

}
