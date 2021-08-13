/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 * Code for understand operators in java  
 */
public class JavaBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10; // Assignment Operator
		String x="English"; // Assignment Operator
		
		
		/* Arithmetic Operators */
		
		int result=1+2;
		System.out.println("1+2 = "+result);
		
		int original_result=result;
		
		result=result-1;
		
		//result value is 2
		
		System.out.println(original_result+" -1 = "+result);
		
		original_result=result;
		
		
		result=result*2;
		//result value is 4
        System.out.println(original_result+" *2 = "+result);
		
		original_result=result;
		
		
		result=result/2;
		//result value is 2
        System.out.println(original_result+" /2 = "+result);
		
		original_result=result;
		
		
		result=result+8;
		//result value is 10
        System.out.println(original_result+" +8 = "+result);
		
		original_result=result;
		
		
		result=result%7;
		//result value is 3
        System.out.println(original_result+" %7 = "+result);
		
		original_result=result;
		
		
		
		/* Unary Operators */
		
		
		int result_unary=+1;
		// reslt_unary 1 
		System.out.println("result_unary");
		
		 result_unary--;
		// reslt_unary 0 
		System.out.println("result_unary");
		
		
		result_unary++;
		// reslt_unary 1 
		System.out.println("result_unary");
		
		
		result_unary=-result_unary;
		// reslt_unary -1 
		System.out.println("result_unary");
		
		
		boolean sucess = false;
		
		// false
		System.out.println(sucess);
		
		
		//true
		System.out.println(!sucess);
		
		
		

		
/* Relational / Comparison Operator */
		
		
		
	int val1=1;
	int val2=2;
	
	if (val1==val2) {
		
		System.out.println("val1==val2");
	}
	
	
if (val1!=val2) {
		
		System.out.println("val1!=val2");
	}


if (val1>val2) {
	
	System.out.println("val1>val2");
}


if (val1>=val2) {
	
	System.out.println("val1>=val2");
	
	
	}




if (val1<val2) {
	
	System.out.println("val1<val2");
}



if (val1<=val2) {
	
	System.out.println("val1<=val2");
}


		
		
	/*   Conditional Operator */


if((val1==1) && (val2==2))
{
	System.out.println("Val1 is 1 and val2 is 2");
}

if((val1==1) || (val2==2))
{
	System.out.println("Val1 is 1 or val2 is 2");
}




/* Bitwise Operator */


int bitmask = 0x000F;
int value=0x2222;

// print 2

System.out.println(value & bitmask);






		
		
		
		
		
		
		
		
		
		
		
		
		
		

	} // end main method

} //end class

