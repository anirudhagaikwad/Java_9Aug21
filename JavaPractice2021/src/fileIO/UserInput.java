/**
 * 
 */
package fileIO;

import java.util.Scanner;
/**
 * @author Vaishnavi
 *
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter Your name :: ");
		String uname=scanObj.nextLine();
		
		System.out.println("User name :: "+uname);

	}

}
