/**
 * 
 */
package fileIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Vaishnavi
 *
 */
public class WriteFileJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String mycontent="Our products is available at a cost-effective price with the best of services,We help our client to stay step ahead from their competitors by using our smart, professional and time bound services.";
		
		FileOutputStream fos=null;
		File file;
		try {
			
			file=new File("G:\\Java\\workplace\\JavaPractice2021\\src\\fileIO\\newwrite.txt");
			fos=new FileOutputStream(file);
			
			if(!file.exists()) {
				
				file.createNewFile();
				
			}
			
			byte[] bytesArray=mycontent.getBytes();
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File written sucessfully....");
			
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(fos!=null)
				{
					fos.close();
				}
			}
			catch(IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
		
	} //end main

}//end class
