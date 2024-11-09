package com.org.myprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


public class LoginServlet extends HttpServlet {
	public static String s1;
	public static String fil1;
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 s1=request.getParameter("uname1");
	        fil1=request.getParameter("upass1");
		        
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
		    		String query = "select * from users where username='"+s1+"'and password='"+fil1+"'";
		    		System.out.println(query);
		    		
		    		String role="";
		    		ResultSet rs = st.executeQuery(query);
		    		while (rs.next()) 
		    		{
		        		role=rs.getString(4);
		    		}    
		    	    con.close();
		    		System.out.println(role.getClass().getName());
		    		if(role.equals("Employee"))
		    		{				
		    			RequestDispatcher rd=request.getRequestDispatcher("requestAccess.jsp"); 
				        rd.forward(request, response);	

		    		}
		    		else if(role.equals("Manager"))
		    		{			
		    			RequestDispatcher rd=request.getRequestDispatcher("pendingRequests.jsp"); 
				        rd.forward(request, response);	
		    		}
		    		else if(role.equals("Admin"))
		    		{			
		    			RequestDispatcher rd=request.getRequestDispatcher("createSoftware.jsp");  
				        rd.forward(request, response);	
		    		}
		    		else 
		    		{			
		    			RequestDispatcher rd=request.getRequestDispatcher("login.jsp"); 
				        rd.forward(request, response);	
		    		}	
		    		
		    	}
		    	 catch(Exception e)
		         {
		         	System.out.println(e);
		         }

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
