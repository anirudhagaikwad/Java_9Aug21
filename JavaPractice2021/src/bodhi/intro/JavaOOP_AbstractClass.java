/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Java OOP
 * Abstract Class
 * Rules :
 * 1) Abstract class always use abstarct keyword
 * 2) Abstract method has no body
 * 3) Abstract class must be extended and method must be overriden
 * 4) Java not allow to create Abstract class object
 */
public class JavaOOP_AbstractClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal obj=new Dog();
		obj.sound();
		obj.earthAnimal();

	} //main

}//JavaOOP_AbstractClass



// Abstract Class

abstract class Animal
{
	//abstaract method
	
	public abstract void sound();
	
	void earthAnimal()
	{
		System.out.println("Animal from Earth...");
		
	}
	
} // end animal class


// Dog class extends Animal class

class Dog extends Animal
{
	public void sound() {
		
		System.out.println("Woof....Woof");
		
	}
	
	
	
} // end Dog class
