/**
 * 
 */
package exceptionjava;

/**
 * @author Vaishnavi
 *
 */
public class JavaException {
	
	
	/*
	 *  Hierarchy
	 *  Throwable 
	 *  
	 *  Exception , Error
	 *  
	 *  Exception --> Checked,Unchecked
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  Object -->Throwable-->Exception---> IOException
	 *                                      ClassNotFound
	 *                                      SQLException
	 *                                                            ArithmaticException
	 *                                                            ClassCastException
	 *                                                            NullPointerException
	 * 
	 * 
	 */

	/**
	 * @param args
	 */
	
	 // Array Declaration
	int intArray[];
	
	int[] intArray2;
	
	 
	 // Syntax of throw
	// throw new excseptionClass("error message");
	
	void checkElgib(int stuage,int stuweight)
	{
		
		if(stuage<12 && stuweight<40)
		{
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else {
			System.out.println("Entry is valid!");
		}
	}
	 
	
	
	void myMethod() throws ArithmeticException,NullPointerException
	{
	//statements 	
		
	}
	
	
	
	
	
	int num1,num2;
	
	void exceptionHandling() {
		
		intArray=new int[20]; //array allocate memory
		int[] intArray2=new int[15];
	    int[] imtArry3=new int[] {1,2,3,4,5};	
		
	try {
			
			num1=0;
			num2=55;
			int result=num2/num1;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured "+e);
			
			System.out.println("Division by zero is not allowed....");
		}

		
	} // end exceptionHandling()
	
	
	
	
	void exceptionHandlingMultCatch() {
		
		try {
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("First print statement in try block");
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception occured "+e);
			
//			System.out.println("Division by zero is not allowed....");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception occured "+e);
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured "+e);
			
		}
		
		finally {
			
			System.out.println("Finally Block ");
		}
		
		System.out.println("Out of try catch ");

		
	} // end exceptionHandlingMultCatch() 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaException obj= new JavaException();
		
		obj.exceptionHandling();
		
		obj.exceptionHandlingMultCatch();
		obj.checkElgib(15, 20);
		
		try {
		obj.myMethod(); } catch(ArithmeticException e) {
			
			//exception handling message
			
		}
catch(NullPointerException e) {
			
	//exception handling message
		}
	
	} //end main

}//end class























