/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 *
 */
public class Method_Overloading_Overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum sumObj=new Sum();
		
		System.out.println(sumObj.add(10, 20));
		
		System.out.println(sumObj.add(10,20,10,10));
		System.out.println(sumObj.add(10, 20,30));
		
		
		Cycle objCycle=new SportCycle();
		Cycle objCycle1=new Cycle();
		SportCycle objCycle2=new SportCycle();
		
		objCycle.printState();
		objCycle1.printState();
		objCycle2.printState();
		
		

	} //main method
	
	
	
	
	
	
	// overload main
	
	
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		
		Sum sumObj=new Sum();
		
		System.out.println(sumObj.add(10, 20));
		
			
		

	} //main method overload
	
	

}// class Method_Overloading_Overriding



// class for overloding method

class Sum
{
	
	int add(int n1,int n2)
	{
		return n1+n2;
	}
	
	
	int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	
	
	
	int add(int n1,int n2,int n3,int n4)
	{
		return n1+n2+n3+n4;
	}
		
	
	
	
} //class sum





class Cycle
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
    	
    	System.out.println("Its from class Cycle ::: \\ncadence : "+cadence+"\n speed"+speed+"\n gear"+gear);
    }
    
}// end cycle


class SportCycle extends Cycle
{
	
			
	
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
    	
    	System.out.println(" Its from class SportCycle ::: \n cadence : "+cadence+"\n speed"+speed+"\n gear"+gear);
    }
	
	
} //end sportcycle
	








