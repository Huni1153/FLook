package DAO;

import connection.DBConnection;

public class CartDAO {
	private DBConnection connection;

	public CartDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDAO(DBConnection connection) {
		super();
		this.connection = connection;
	}

	public DBConnection getConnection() {
		return connection;
	}

	public void setConnection(DBConnection connection) {
		this.connection = connection;
	}
	
	

}
