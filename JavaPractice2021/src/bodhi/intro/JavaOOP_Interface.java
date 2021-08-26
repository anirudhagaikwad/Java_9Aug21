/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Interface 
 * 1) interface methods by default abstract method
 * 2) variable declared in interfaces are public,static,final by default
 */
public class JavaOOP_Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface obj= new InterfaceImplimnt();
		
		
		obj.method1();
		
		
		InterfaceImplimnt obj1= new InterfaceImplimnt();
		obj1.displayVaribl();
		
		

	} //main

} // end JavaOOP_Interface



// interface

interface MyInterface
{
	//public,static,final by default Variable
	 int i=99;
	 
	 
	 //by default abstract method
	
	 public void method1();
	
	
} //end MyInterface




class InterfaceImplimnt implements MyInterface
{
	
	void displayVaribl()
	{
		System.out.println(" i = "+i);
	}
	
	 public void method1() {
		 
		 
		 System.out.println("Implimate of interface method....");
		 
		 
		// i=50;
	 }
	
	
} // end InterfaceImplimnt





