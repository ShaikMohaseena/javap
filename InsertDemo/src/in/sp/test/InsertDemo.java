package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception 
	{
		  //-------user values---------------
		  String name1="amit";
		  String email1="amit@gmail.com";
		  String pass1="amit123";
		  String gender1="male";
		  String city1="banglore";
        
		  Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "1313");
          
         
        //  PreparedStatement ps= con.prepareStatement("insert into register values('priya','priya@gmail.com','priya123','female','bihar')");

          PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
          ps.setNString(1, name1);
          ps.setNString(2,email1);
          ps.setNString(3,pass1);
          ps.setString(4, gender1);
          ps.setString(5, city1);
          
          int i=ps.executeUpdate();
         
         if(i>0)
         {
        	 System.out.println("success");
         }
         else
         {
        	 System.out.println("fail");
         }
	}

}
