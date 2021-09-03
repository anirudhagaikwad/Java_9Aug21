/**
 * 
 */
package fileIO;

import java.io.File;
import java.io.IOException;
/**
 * @author Vaishnavi
 *
 */
public class CreateFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File file=new File("G:\\Java\\workplace\\JavaPractice2021\\src\\fileIO\\newfile.txt");
			
			boolean fvar=file.createNewFile();
			if(fvar) {
				
				System.out.println("File has been created sucessfully....");
			}
			else {
				System.out.println("File already present....");
				
			}
			
			
		}
		catch(IOException e)
		{
			
			System.out.println("Exception Occured :");
			e.printStackTrace();
			
		}
		

	}// end main

}//end class
