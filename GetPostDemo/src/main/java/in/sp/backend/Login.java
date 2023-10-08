package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login  extends HttpServlet 
{
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	  String myemail = (String) request.getParameter("email1") ; 
	  String mypass = (String) request.getParameter("pass1");
	 
	 if(myemail.equals("pandu@gmail.com") && mypass.equals("pandu123"))
	 {
		 System.out.println("success");
	 }
	 else
	 {
		 System.out.println("failed");
	 }
   }
}
