/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 *
 */
public class DatatypesMaxMinValue {

	/**
	 * @param args
	 */
	
	
	
	// Static block
	
	
	static{System.out.print("\n Hello Static Block");}
	
	//Initializer / Instance Block
	
	{System.out.print("\n Hello Non-Static Block inside class");}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Integer MAx & Min Value
		
		
		System.out.print("\n Integer MinValue : "+Integer.MIN_VALUE+"\t Integer MaxValue : "+Integer.MAX_VALUE+"\t Integer Size : "+Integer.SIZE +"bit");
		
		
		// Short Max & min ,size
		
		
		System.out.print("\n Short MinValue : "+Short.MIN_VALUE+"\t Short MaxValue : "+Short.MAX_VALUE+"\t Short Size : "+Short.SIZE +"bit");

		
		// Byte Max & min ,size
		
		
	    System.out.print("\n Byte MinValue : "+Byte.MIN_VALUE+"\t Byte MaxValue : "+Byte.MAX_VALUE+"\t Short Size : "+Byte.SIZE +"bit");

		
       // Long Max & min ,size
		
		
	    System.out.print("\n Long MinValue : "+Long.MIN_VALUE+"\t Long MaxValue : "+Long.MAX_VALUE+"\t Short Size : "+Long.SIZE +"bit");

	    
	     {System.out.print("\n Hello Non-Static Block inside main Method");}
	     
	     
	     DatatypesMaxMinValue obj=new DatatypesMaxMinValue();
	    
	}

}
