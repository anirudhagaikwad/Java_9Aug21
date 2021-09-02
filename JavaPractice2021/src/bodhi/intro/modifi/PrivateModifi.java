/**
 * 
 */
package bodhi.intro.modifi;

//import bodhi.intro.Bicycle;

/**
 * @author Vaishnavi
 * 
 * Example of Private Access Modifier 
 *
 */
public class PrivateModifi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bike1=new Bicycle();
		bike1.printState();
		
		
	}

}




class Bicycle
{
	
	private int cadence=0;
	private int speed = 0;
	private int gear=1;
	private int height=0;
	
	
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
	
	
	private void changeCadence(int newValu) {
		
		cadence=newValu;
		
	}//changeCadence
	
	
	private void changeGear(int newValu) {
		
		gear=newValu;
		
	}//changeGear
	
	
	private void speedUp(int increment) {
		
    	speed=increment;
		
	}//changeGear
	
    
public void printState() {
    	Bicycle bike1=new Bicycle();
    	// invoke methods 
    			bike1.changeCadence(50);
    			bike1.changeGear(2);
    			bike1.speedUp(10);
    			bike1.printState();
    	
    	System.out.println("cadence : "+cadence+"\n speed"+speed+"\n gear"+gear);
    }
	
	
	
			
	
}// end bicycle
