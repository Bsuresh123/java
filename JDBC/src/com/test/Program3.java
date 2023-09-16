package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Program3 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fruits1","root","qwerty.123");
//		PreparedStatement ps=con.prepareStatement("insert into fruit3 values (?,?,?)");
//		ps.setInt(1, 111);
//		ps.setString(2, "Apple");
//		ps.setString(3, "TPT");
//			ps.execute();
		PreparedStatement pst=con.prepareStatement("update fruit3 set sname=? where sno=?");
		pst.setInt(1 , 111);
		pst.setString(2 , "tamato");
		pst.setString(3,"mpl");
	    pst.execute();
//		PreparedStatement pst1=con.prepareStatement("select * from ");
//		ResultSet rs=pst1.executeQuery();
//		while(rs.next())
//		{
//			System.out.println("ID:"+rs.getInt(1)+"Name:"+rs.getString(2)+"city:"+rs.getString(3));
//		}
		System.out.println("successful");
		

	}

}
