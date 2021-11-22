package com.DAO.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.connexion.utils.ConnexionManager;

public class ConnectionUtils {

	public ResultSet executeQuery(String sql) throws Exception {
		Connection cn = ConnexionManager.getInstance();

		Statement st = cn.createStatement();

		return st.executeQuery(sql);
	}

	public int executeUpdate(String sql) throws Exception {
		Connection cn = ConnexionManager.getInstance();

		Statement st = cn.createStatement();

		return st.executeUpdate(sql);
	}
}
