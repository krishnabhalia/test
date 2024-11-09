package com.org.mydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.org.myprj.SignUpServlet;

public class DBConnection 
{
	/*public ArrayList<Graph> getDBTable() 
	{
		ArrayList<Graph> recSet = new ArrayList<Graph>();*/
		public static void main(String[] s)
		{
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
    		String x1=SignUpServlet.s;
    		String x2=SignUpServlet.fil;
    		String x3=SignUpServlet.role;

    		String query = "insert into users values(x1,x2,x3);";
    	    ResultSet rs = st.executeQuery(query);

    	/*	ResultSet rs = st.executeQuery(query);
    		while (rs.next()) 
    		{
        		System.out.println("ssd"+rs.getString(1));
        		
    		}    
    		System.out.println("done");*/

    		/*
    		String x1=SignUpServlet.s;
    		String x2=SignUpServlet.fil;
    		String x3=SignUpServlet.role;

    		String query = "insert into TRIAL_sec_query_log values(x1,x2,x3)";
    	    	//	System.out.println(query);		    

    		ResultSet rs = st.executeQuery(query);
    		 
    		while (rs.next()) 
    		{
    			Graph gr = new Graph();
    				gr.setTicket_id(rs.getInt(1));
    				gr.setPriority(rs.getString(2));
    				gr.setIncident_type(rs.getString(3));
    				gr.setSubject(rs.getString(4));
    				gr.setActivity_desc(rs.getString(5));
    				gr.setTarget_dt(rs.getString(6));
    	    		gr.setAssign_to(rs.getInt(7));
    				gr.setStatus(rs.getString(8));
    				gr.setLive_dt(rs.getString(9));
    				gr.setEmp_cd(rs.getInt(10));
    				gr.setEmail_dt(rs.getString(11));
    		
    			recSet.add(gr);
    		}
    		con.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
		return recSet;	
	}
	
	public ArrayList<Graph> getCount() 
	{
		ArrayList<Graph> recSet1 = new ArrayList<Graph>();
		try 
        {
        	Class.forName("oracle.jdbc.OracleDriver");
    		
    		// Establish Connection
    		Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-CU1MIB5E:1521:xe", "System", "tiger");
    		
    		Statement st =con1.createStatement();
    		String x2=SrvGraph.fil;
    		String query;
    		int x3=Integer.parseInt(x2);
    		if(x3==0)
    		{
    		 query = "SELECT * FROM ( SELECT  Status FROM TRIAL_sec_query_log) PIVOT (COUNT(Status)   FOR Status IN ('New','In Progress','Solution Provided','Awaiting Customer','Awaiting BIPL','Enhancement Required','Close','On Hold By Customer','UAT Completed','LIVE')) ";
    		}
    		else
    		{
    			query = "SELECT * FROM ( SELECT  Status FROM TRIAL_sec_query_log where product_cd="+x3
    					+ ")PIVOT (COUNT(Status)   FOR Status IN ('New','In Progress','Solution Provided','Awaiting Customer','Awaiting BIPL','Enhancement Required','Close','On Hold By Customer','UAT Completed','LIVE')) ";
    		}
    		System.out.println(query);
    		ResultSet rs1 = st.executeQuery(query);
    		while (rs1.next()) 
    		{
    		Graph gr1 = new Graph();
    		gr1.setNew(rs1.getInt(1));
    		gr1.setIn_Progress(rs1.getInt(2));
			gr1.setSolution_Provided(rs1.getInt(3));
			gr1.setAwaiting_Customer(rs1.getInt(4));
			gr1.setAwaiting_BIPL(rs1.getInt(5));
			gr1.setEnhancement_Required(rs1.getInt(6));
			gr1.setClose(rs1.getInt(7));
			gr1.setOn_Hold_By_Customer(rs1.getInt(8));
			gr1.setUAT_Completed(rs1.getInt(9));
			gr1.setLIVE(rs1.getInt(10));

    		recSet1.add(gr1);
    		}*/
    		
		con.close();
	}
	 catch(Exception e)
     {
     	System.out.println(e);
     }
     //   return recSet1;
	}
}
