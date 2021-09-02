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


final class FinalClass // we cannot extends final class
{
	
}

public class JavaOOP_Interface {

	/**
	 * @param args
	 */
	
	
	int x=10;
	 int y=20;
	
	/* this keyword we can use
	 * -invoke current class constructor
	 * -invoke cureent class method
	 * -return current class object
	 * -pass an argument in the method call
	 * -pass argument in constructor call*/
	
	
	 // Final Keyword in java
	
	
	// final variable 
	final float PI=3.14f;
	
	
	//blank final variable , must be initialize in costructor
	final int MAXVAL;
	
	
	
	//final method cannot overriden 
	
	final void finalMethod()
	{
		
		System.out.println("its final method");
	}
	
	

	
	
	
	JavaOOP_Interface(int x,int y)
	
	{
		
		
		MAXVAL=200;
		System.out.println("its final blank variable"+MAXVAL);
		
		
		this.x=x;
		this.y=y;
		
		
	
				
		
	} //constructor with 2 args
	
	
	JavaOOP_Interface()
	{
	
		MAXVAL=200;
		System.out.println("its final blank variable"+MAXVAL);
		
	} //constructor without args
	
	
	JavaOOP_Interface(int x,int y,int xy)
	{
		this();
		
		//this(x,y);
		
		//MAXVAL=200;
		System.out.println("its final blank variable"+MAXVAL);
		
		
		this.x=x;
		this.y=y;
		xy=50;
		
	
		
		
	
				
		
	} //constructor with 3 args
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface obj= new InterfaceImplimnt();
		
		
		obj.method1();
		
		
		InterfaceImplimnt obj1= new InterfaceImplimnt();
		obj1.displayVaribl();
		
		
		
		 InterfaceImplimnt1 obj_intfimp1=new  InterfaceImplimnt1();
		 
		 obj_intfimp1.displayVaribl();
		
		 
		 
		 MyInterface2 obj_intfimp2= new InterfaceImplimnt1();
		 
		 obj_intfimp2.method_myintf2();
		 
		 
		 // Final Keyword in java
		 
		 JavaOOP_Interface javaOOP_Obj =new JavaOOP_Interface();
		 //javaOOP_Obj.PI=55.2f;
		 
		 javaOOP_Obj.finalMethod();
		 
		 System.out.println("its final variable"+javaOOP_Obj.PI);
		 
		 

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






interface  MyInterface2
{
	
	//public,static,final by default Variable
		 int j=99;
		 
		 
		 //by default abstract method
		
		 public void method_myintf2();
	
	
	
}// end interface Child1


interface Child1 extends MyInterface
{
	
	
	
}// end interface Child1



interface Child2 extends MyInterface,MyInterface2
{
	
	
	
}// end interface Child1





class InterfaceImplimnt1 implements Child2
{
	
	void displayVaribl()
	{
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	
	
	//implements method from MyInterface
	
	 public void method1() {
		 
		 
		 System.out.println(" MyInterface method using implements Child2 ....");
		 
		 
		// i=50;
	 }
	
	 
	 
		//implements method from MyInterface2
	 
	 public void method_myintf2()
	 {
		 System.out.println(" MyInterface2 method  using implements Child2....");
	 }
	
} // end InterfaceImplimnt




































