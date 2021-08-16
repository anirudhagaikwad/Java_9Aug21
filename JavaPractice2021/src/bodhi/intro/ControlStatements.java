/**
 * 
 */
package bodhi.intro;

/**
 * @author Vaishnavi
 *
 */
public class ControlStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//if
		
		if (5>6)
		{
			System.out.println("IF Block Execute");
		}
		else {
			System.out.println("Else Block Execute");
			
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
				
		
		
		
	// Switch Statement
		
		
		
		
		
		int month =8;
		String monthString;
		
		switch(month)
		{
		
		case 1: monthString="Jan";
		        break;
		case 2: monthString="Feb"  ;
		        break;
		case 3: monthString="Mar"  ;
        break;
        
		case 4: monthString="Apr"  ;
        break;
        
		case 5: monthString="May"  ;
        break;
        
		case 6: monthString="Jun"  ;
        break;
        
		case 7: monthString="July"  ;
        break;
        
        
		case 8: monthString="Aug"  ;
        break;
        
        
        
		case 9: monthString="Sept"  ;
        break;
        
        
        
		case 10: monthString="Oct"  ;
        break;
        
        
		case 11: monthString="Nov"  ;
        break;
        
        
		case 12: monthString="Dec"  ;
        break;
        
        default: monthString="Invalid Month";
        
        
		        
		} //end switch
		
		System.out.println("monthString = "+monthString);
		
		
		// Example how switch can have multiple case labels
		
		int year=2021;
		int numDays=0;
		
		switch(month)
		{
		
		case 1: case 3: case 5: case 7: case 8: case 10 : case 12: 
			
			numDays=31;
			break;
			
		case 4: case 6: case 9: case 11:
			numDays=30;
			break;
			
			
		case 2: 
			if(((year%4 ==0) && !(year%100==0)) || (year % 400==0))
			{
				numDays=29;
			}
			else {
				numDays=28;
			}
			break;
			
		default: System.out.println("Invalid Month");
		break;
			
		}
		
		
		System.out.println("Number of Days in "+monthString+" = "+numDays);
		
		
		
		// While Loop
		
		/*
		 * while(Expression){ Staatements; }
		 * 
		 */
		
		int count=1;
		
		while (count<11) {
			
			System.out.println("While loop - Count is : "+count);
			count++;
		}
		
		
		// Do-While Loop
		
				/*
				 * do{ Staatements; }while(Expression);
				 * 
				 */
		
		
		
		do
		{
			System.out.println("Do-While Loop - Count is : "+count);
			count++;
			
		}while(count<11);
		
		
		
		// For loop
		
		/*
		 * for (initialization;termination;increment)
		 * {Statements;}
		 * 
		 */
		
		for(int i=1;i<11;i++)
		{
			
			System.out.println("For Loop - Count is : "+i);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	} //end main

} //end class
