/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Default Access Modifier 
 *
 */
public class DeafultAccessModifire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bicycle obj=new Bicycle();
		obj.changeCadence(50);
		obj.changeGear(2);
		obj.speedUp(20);
		obj.printState();

	}

}
