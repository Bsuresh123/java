  package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam1 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suresh","root","qwerty.123");
		Statement st=con.createStatement();
		String sql="create table suri(id int,name varchar(20),city varchar(20))";
		String sql1="insert into suri values (1,'suresh','mpl'),(2,'suri','tpt'),(1,'suman','blr')";
		String sql2="update suri set sname='dhqd' where sno=1";
//		String sql3="delete from  suri where sno=1";
		String sql4="select * from suri";
		
		st.execute(sql1);
		ResultSet rs=st.executeQuery(sql4);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
		}
		con.close();
		System.out.println("hello");  


	
	}

}
