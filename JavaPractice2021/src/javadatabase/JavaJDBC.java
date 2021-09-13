/**
 * 
 */
package javadatabase;

import java.sql.*;

/**
 * @author Vaishnavi
 *
 */








public class JavaJDBC {

	/**
	 * @param args
	 */
	
	
	
	void fetchData()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql:/localhost:3306/test?autoReconnect=true&useSSL=false","root","password");
		//jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false
		Statement s =con.createStatement();
		
		ResultSet rs=s.executeQuery("select * from student");
		//PreparedStatement pst=con.prepareStatement("select * from student");
		//pst.executeUpdate();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
						
		}
		
		con.close();
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql:/localhost:3306/test","root","password");
			
			Statement s =con.createStatement();
			PreparedStatement pst=con.prepareStatement("inset intp student values(?,?)");
			
			pst.setInt(1, 104);
			pst.setString(2, "Anirudha");
			pst.executeUpdate();
				
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		

	} //end main

}// end class




