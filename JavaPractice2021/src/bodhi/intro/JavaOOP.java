/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Java OOP Concept
 * Class : 
 * Object :
 * Inheritance:
 * Java Constructor
 
 * 
 *
 */
public class JavaOOP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//create object
		Bicycle bike1=new Bicycle();	
		Bicycle bike2=new Bicycle();
		
		Bicycle bike3=new Bicycle(2,3,4);
		Bicycle bike4=new Bicycle(2,3,4,45);
		
		// invoke methods 
		bike1.changeCadence(50);
		bike1.changeGear(2);
		bike1.speedUp(10);
		bike1.printState();
		
		
		bike2.changeCadence(100);
		bike2.changeGear(3);
		bike2.speedUp(15);
		bike2.printState();
		
		
		
		// Single Inheritance
		
		MountainBicycle mountbike= new MountainBicycle();
		
		mountbike.mountBicy();
		
		
		// multilevel Inheritance
		
		RoadBicycle roadbike= new RoadBicycle();
		
		roadbike.RoadBicy();
		
		
		//  hierarchical Inheritance
		
		KidsBicycle kidbike= new KidsBicycle();
		
		kidbike.kidsBicy();
		

	} //end main

}// end javaoop


class Bicycle
{
	
	int cadence=0;
	int speed = 0;
	int gear=1;
	int height=0;
	
	
	/* 1)Non-Parameterize Constructor(Default) 2)Parameterize Constructor */
	
	Bicycle()
	{
		System.out.println("Default Constructor");
		 
	}//end default constructor
	
	
	Bicycle(int x,int y,int z)
	{
		
		 cadence=x;
		 speed=y ;
		 gear=z;
		
	}//end Parameterize constructor
	
	
	Bicycle(int x,int y,int z,int he)
	{
		
		 cadence=x;
		 speed=y ;
		 gear=z;
		 height=he;
		
	}//end Parameterize constructor
	
	
	void changeCadence(int newValu) {
		
		cadence=newValu;
		
	}//changeCadence
	
	
	void changeGear(int newValu) {
		
		gear=newValu;
		
	}//changeGear
	
	
    void speedUp(int increment) {
		
    	speed=increment;
		
	}//changeGear
	
    
    void printState() {
    	
    	System.out.println("cadence : "+cadence+"\n speed"+speed+"\n gear"+gear);
    }
	
	
	
			
	
}// end bicycle







// Inheritance 
// Superclass - Child Class
/*
 * Types Inheritance : Single,multilevel ,hierarchical 
 * 
 */

class MountainBicycle extends Bicycle //Single Inheritance 
{
	
void mountBicy()
{
	MountainBicycle obj1= new MountainBicycle();
	// invoke methods 
	obj1.changeCadence(50);
	obj1.changeGear(2);
	obj1.speedUp(10);
	obj1.printState();
	

} // end mountBicy()
} //end MountainBicycle


class RoadBicycle extends MountainBicycle  // multilevel Inheritance 
{
	
	void RoadBicy()
	{
		RoadBicycle obj1= new RoadBicycle();
		// invoke methods 
		obj1.changeCadence(50);
		obj1.changeGear(2);
		obj1.speedUp(10);
		obj1.printState();
		

	} // end RoadBicy()
	
}//end RoadBicycle



class KidsBicycle extends Bicycle  // hierarchical Inheritance 

{
	
	void kidsBicy()
	{
		KidsBicycle obj1= new KidsBicycle();
		// invoke methods 
		obj1.changeCadence(50);
		obj1.changeGear(2);
		obj1.speedUp(10);
		obj1.printState();
		

	} // end kidsBicy()
	
	
	
} //end KidsBicycle









































