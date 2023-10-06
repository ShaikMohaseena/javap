package in.sp.select;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo
{

	public static void main(String[] args) throws Exception
	{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","1313");
           
           PreparedStatement ps =con.prepareStatement("select * from register");
           ResultSet rs=ps.executeQuery();
           
           while(rs.next())
           {
        	    String name1 =rs.getString("name");
        	    System.out.println ("Name : "+name1);
        	    
        	    String email1=rs.getNString("email");
        	    System.out.println("Email : "+email1);
        	    
        	    String pass1=rs.getString("password");
        	    System.out.println("password : " +pass1);
        	    
        	    String gender1=rs.getString("gender");
        	    System.out.println("Gender : "+gender1);
        	    
        	    String city1=rs.getString("city");
        	    System.out.println("city : "+city1);
        	    
        	    System.out.println("------------------------------------");
        	    
        	   
        	  // System.out.println("Name : "+rs.getString("name"));
           }
           con.close();
           
    }

}
