/**
 * 
 */
package fileIO;
import java.io.*;

/**
 * @author Vaishnavi
 *
 */
public class ReadFileJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file =new File("G:\\Java\\workplace\\JavaPractice2021\\src\\fileIO\\newfile.txt");
		BufferedInputStream bis=null;
		FileInputStream fis=null;
		
		try
		{
			
			fis=new FileInputStream(file);
			
			bis=new BufferedInputStream(fis);
			
			while(bis.available()>0)
			{
				System.out.println((char)bis.read());
			}
			
			
		}
		
		catch(FileNotFoundException fnf)
		{
			System.out.println("FileNotFoundException Occured :");
			fnf.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println("IOException Occured :");
			ex.printStackTrace();
		}
		
		
		finally {
			
			try {
				if(bis!=null && fis!=null)
				{
					fis.close();
					bis.close();
				}
				
			}
			catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		

	} //end main

} // end class
