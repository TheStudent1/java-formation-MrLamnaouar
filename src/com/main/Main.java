package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connexion.utils.ConnexionManager;

public class Main {

	public static void main(String[] args) throws Exception {

		//Connexion Testing *********
		Connection cn = ConnexionManager.getInstance();

		Statement st = cn.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM car");

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));

		}

		cn.close();
		//Connexion Testing *********

	}

}
