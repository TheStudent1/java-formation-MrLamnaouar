package com.connexion.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnexionManager {

	private static Connection cn = null;

	private ConnexionManager() {
	}

	public static Connection getInstance() throws Exception {

		if (cn == null) {
			Properties p = new Properties();
			p.load(new FileInputStream("src/com/connexion/utils/db.properties"));
			Class.forName(p.getProperty("driver"));
			cn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pwd"));
		}
		return cn;
	}
}
