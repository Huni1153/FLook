package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static final DBConnection obj=new DBConnection();
	private Connection con;
	private String url;
	private String id;
	private String password;
	
	private DBConnection()
	{
		this("jdbc:oracle:thin:@127.0.0.1:1521:XE","r2d2","1234");
	}
	private DBConnection(String url,String id,String password)
	{
		this.url=url;
		this.id=id;
		this.password=password;
		this.connect();
	}
	public static DBConnection getInstance()
	{
		return obj;
	}
	private void connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.con=DriverManager.getConnection(this.url,this.id,this.password);
			this.con.setAutoCommit(false);
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
