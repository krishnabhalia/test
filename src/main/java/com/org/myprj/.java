package com.org.myprj;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.mydb.DBConnection;

public class SrvGraph extends HttpServlet 
{
	public static String s;
	public static String fil;
	private static final long serialVersionUID = 1L;
	
    public SrvGraph() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        s=request.getParameter("x")==null?"All":request.getParameter("x");
        fil=request.getParameter("y")==null?"0":request.getParameter("y");

        request.setAttribute("graphRec1", new DBConnection().getCount());
        request.setAttribute("graphRec", new DBConnection().getDBTable());
      
		RequestDispatcher rd=request.getRequestDispatcher("Graph.jsp");  
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
