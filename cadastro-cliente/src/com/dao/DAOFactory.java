package com.dao;

import com.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getDaoFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
		
	}

