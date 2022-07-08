<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String addeditemname=request.getParameter("addeditemname");
    String deleteditemname=request.getParameter("deleteditemname");

    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/todolist", "root", "rootpassword");
        Statement st=conn.createStatement();
        int i=st.executeUpdate("insert into additem(addeditemname)values('"+addeditemname+"')");
        int i2=st.executeUpdate("insert into deleteitem(deleteditemname)values('"+deleteditemname+"')");
        out.println("Action successful.");
    }
    catch(Exception e)
    {
        System.out.print("Oh No" + e);
        e.printStackTrace();
    }

%>