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
 * Interface :
 * Abstract:
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
		
		// invoke methods 
		bike1.changeCadence(50);
		bike1.changeGear(2);
		bike1.speedUp(10);
		bike1.printState();
		
		
		bike2.changeCadence(100);
		bike2.changeGear(3);
		bike2.speedUp(15);
		bike2.printState();
		
		

	} //end main

}// end javaoop


class Bicycle
{
	
	int cadence=0;
	int speed = 0;
	int gear=1;
	
	
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
