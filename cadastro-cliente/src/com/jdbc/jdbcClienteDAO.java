package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.ClienteDAO;
import com.dao.DAOException;
import com.modelo.Cliente;

public class jdbcClienteDAO implements ClienteDAO {
	
	private Connection connection;
	

	public jdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}


	public void salvar(Cliente cliente) {
		try {
			String sql = String.format("insert into cliente (nome) values ('%s')", cliente.getNome());
		
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro, salvando cliente.", e);
		}finally {
			try {
			this.connection.close();
			}catch (Exception e) {}
		}
	}
}
