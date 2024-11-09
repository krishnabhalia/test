package com.org.myprj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignUpServlet") 
public class SignUpServlet extends HttpServlet 
{
	public static String s;
	public static String fil;
	public static String role;

	private static final long serialVersionUID = 1L;
	
    public SignUpServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  
		  s=request.getParameter("uname");
	        fil=request.getParameter("upass");
	        role=request.getParameter("role");
		        
		    	try 
		        {
		        	Class.forName("org.postgresql.Driver");
		    		
		    		// Establish Connection
		    		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123");
		    		if(con!=null)
		    		{
		    		System.out.println("consuccess");
		    		}
		    		else
		    		{
		        		System.out.println("fail");
		    		}
		    		
		    		Statement st =con.createStatement();
		    		String query = "insert into users(username,password,role) values('"+s+"','"+fil+"','"+role+"')";
		    		System.out.println(query);

		    	    st.executeUpdate(query);
		    	    con.close();
		    	}
		    	 catch(Exception e)
		         {
		         	System.out.println(e);
		         }
		        
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		        rd.forward(request, response);	
		       }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);

	}

}
