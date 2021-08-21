/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * 
 * Understand Java Methods
 *
 */
public class JavaMethods {

	/**
	 * @param args
	 */
	
	
	// without return type and without argument
	
	void WoutReArg()
	{
		System.out.println("Method without return type and without argument");
	}
	
	
	
	// with return type and without argument
	
		String WitReNoArg()
		{
			String result="Method without return type and without argument";
			
			return result;
		}
		
	
	
		// without return type and with argument
		
		void WoutRewithArg(int x)
		{
			System.out.println("Method without return type and with argument : "+x);
		}
		
		
		
		// with return type and with argument
		
				int withRewithArg(int x)
				{
					System.out.println("Method with return type and with argument : "+x);
					
					return x;
				}
	
	
	// instance methods & static method
				
				
				static void staticMethod() {
					
					System.out.println("Static Method :");
					
					//WoutReArg();
				}
				
                void instanceMethod() {
					
                	WoutReArg();
                	
					System.out.println("Instance Method :");
				}
				
				
				
				
				
				
				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaMethods obj =new JavaMethods();
		
		obj.instanceMethod();
				
		//obj.staticMethod();
		
		
		staticMethod();
		
		
		
	} //end main

} //end class
