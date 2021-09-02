/**
 * 
 */
package bodhi.intro.modifi;



/**
 * @author Vaishnavi
 *
 */
public class ProtectedAccessModifi {

	/**
	 * @param args
	 */
	
	int cadence;
	
	 void changeCadence(int newValu) {
		
		cadence=newValu;
		
	}//changeCadence
	 
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle1 bikw=new Bicycle1();
		bikw.changeCadence(50);
		

	} //end main

} //end class







class Bicycle1
{
	
	protected int cadence=0;
	protected int speed = 0;
	protected int gear=1;
	protected int height=0;
	
	
	/* 1)Non-Parameterize Constructor(Default) 2)Parameterize Constructor */
	
	Bicycle1()
	{
		System.out.println("Default Constructor");
		 
	}//end default constructor
	
	
	Bicycle1(int x,int y,int z)
	{
		
		 cadence=x;
		 speed=y ;
		 gear=z;
		
	}//end Parameterize constructor
	
	
	Bicycle1(int x,int y,int z,int he)
	{
		
		 cadence=x;
		 speed=y ;
		 gear=z;
		 height=he;
		
	}//end Parameterize constructor
	
	
	protected void changeCadence(int newValu) {
		
		cadence=newValu;
		
	}//changeCadence
	
	
	protected void changeGear(int newValu) {
		
		gear=newValu;
		
	}//changeGear
	
	
	protected void speedUp(int increment) {
		
    	speed=increment;
		
	}//changeGear
	
    
	protected void printState() {
    	
    	System.out.println("cadence : "+cadence+"\n speed"+speed+"\n gear"+gear);
    }
	
	
	
			
	
}// end bicycle







// Inheritance 
// Superclass - Child Class
/*
 * Types Inheritance : Single,multilevel ,hierarchical 
 * 
 */

class MountainBicycle1 extends Bicycle1 //Single Inheritance 
{
	
void mountBicy()
{
	super.changeCadence(50);
	
	
	
	MountainBicycle1 obj1= new MountainBicycle1();
	// invoke methods 
	obj1.changeCadence(50);
	obj1.changeGear(2);
	obj1.speedUp(10);
	obj1.printState();
	

} // end mountBicy()
} //end MountainBicycle


class RoadBicycle1 extends MountainBicycle1  // multilevel Inheritance 
{
	
	void RoadBicy()
	{
		RoadBicycle1 obj1= new RoadBicycle1();
		// invoke methods 
		obj1.changeCadence(50);
		obj1.changeGear(2);
		obj1.speedUp(10);
		obj1.printState();
		
		
		
		

	} // end RoadBicy()
	
}//end RoadBicycle

