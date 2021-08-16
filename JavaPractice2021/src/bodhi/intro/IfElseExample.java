/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Program to understand IF-Else
 * If Block execute when condition/Expression is True
 *  */
public class IfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(10<2) {
			System.out.println(" if block : 10>2");
		} 
		else {
			
			System.out.println("Else block 10<2");
		}
		
		
		
		
		int testscore = 76;
		char grade;
		
		if(testscore>=90)
		{
			grade='A';
			
		}
		
		else if(testscore>=80)
		{
			grade='B';
			
		}
		
		else if(testscore>=70)
		{
			grade='C';
			
		}
		
		else if(testscore>=60)
		{
			grade='D';
			
		}
		
		else
		{
			
			grade='F';
		}
		
		
		System.out.println("Student Grade is : "+grade);
		
		
		
		
		
		
		
	} // end main

} // end class
