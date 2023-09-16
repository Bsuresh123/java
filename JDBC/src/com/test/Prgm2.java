package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prgm2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prabha","root","qwerty.123");
		Statement st=con.createStatement();
		String sql="create table prabha(sno int,mname varchar(20),movieverdict varchar(20),year int)";
		String sql1="insert into prabha values (2,'Raghavendra','avg',2003),(1,'Eswar','Hit',2002)";
		st.execute(sql1);
		String sql3="update prabha set name='dhqd' where id=1";
		String sql2="delete from prabha where id=1";
		String sql5="select * from prabha";
		ResultSet  rs=st.executeQuery(sql5);
		while(rs.next())
		{
		System.out.println("Sno:"+rs.getInt(1)  +  "  mname:"+rs.getString(2)  +"   MoVIEVerdict:"+rs.getString(3));

		}		
	}

}



