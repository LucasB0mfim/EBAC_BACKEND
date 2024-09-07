package br.com.lbomfim.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection connection;
	
	private ConnectionFactory(Connection connection) {
		
	}

	//verifica se já existe uma conexão aberta. Se não, cria uma nova.
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
			return connection;
		} else if (connection.isClosed()) {
			connection = initConnection();
			return connection;
		}
		return connection;
	}

	private static Connection initConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "saun@qualifiedreb1rth");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
