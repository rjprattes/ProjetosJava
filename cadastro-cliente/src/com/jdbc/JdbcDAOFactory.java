package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.dao.ClienteDAO;
import com.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection connection;
	
	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/sys", "root", "647153");
			
		}catch (Exception e) {
			throw new RuntimeException("Erro, recuperando conexão com o banco.", e);
		}
	}

	public ClienteDAO getClienteDAO() {
		return new jdbcClienteDAO(connection);
	}
}
