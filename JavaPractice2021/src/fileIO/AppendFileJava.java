/**
 * 
 */
package fileIO;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;


/**
 * @author Vaishnavi
 *
 */
public class AppendFileJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String mycontent="\n \n Developing smooth, reliable, scalable and robust apps within the specified time frame, ensuring 100% customer satisfaction, provide smart solutions for growth your Business.";
		
		File file=new File("G:\\Java\\workplace\\JavaPractice2021\\src\\fileIO\\newwrite.txt");
		
		if(!file.exists()) {
			
			file.createNewFile();
			
		}
		
		FileWriter fw= new FileWriter(file,true);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(mycontent);
		bw.close();
		
		System.out.println("Data sucessfully append....");
		
		
		
		}//end try
		
catch(IOException e)	
		{
	e.printStackTrace();
	
		}//end catch
		

	} //end main

} //end class
