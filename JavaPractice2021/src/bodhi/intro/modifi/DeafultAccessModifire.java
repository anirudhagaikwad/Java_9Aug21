/**
 * 
 */
package bodhi.intro.modifi;

import bodhi.intro.modifi.Bicycle;

/**
 * @author Vaishnavi
 * 
 * Access Default modifire to outside package 
 * occured error
 *
 */
public class DeafultAccessModifire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bicycle obj=new Bicycle();
//		obj.changeCadence(50);
//		obj.changeGear(2);
//		obj.speedUp(20);
		obj.printState();

	}

}
