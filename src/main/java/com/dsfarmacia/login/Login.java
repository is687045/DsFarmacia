package com.dsfarmacia.login;

import com.dsfarmacia.cnx.*;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	private Cnx cnx;
	private String username;
	private String password;
	
	public Login(){
		cnx = new Cnx();
	}
	public String Connect(String username, String password) {
		this.username = username;
		this.password = password;
		String SQL = "SELECT Id FROM Usuarios where usuario = '"
				+ this.username + "' and Password= '" + this.password + "'";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = cnx.con.createStatement();
			rs = stmt.executeQuery(SQL);
			if (!rs.isBeforeFirst())
				return "Wrong username/password";
			rs.next();
		//	System.out.println(rs.getString(1));	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return "Connection Stablished";
	}

}
