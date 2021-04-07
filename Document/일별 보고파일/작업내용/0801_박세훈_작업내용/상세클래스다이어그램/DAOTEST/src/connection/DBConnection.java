
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : DBConnection.java
//  @ Date : 2015-06-24
//  @ Author : 
//
//




public class DBConnection
{
	private Connection conn;
	private String url;
	public String dbId;
	public String dbPwd;
	public DBConnection()
	{
		this("jdbc:oracle:thin:@127.0.0.1:1521:XE","R2D2","1234");
	}
	public DBConnection(String url,String dbId,String dbPwd)
	{
		this.url = url;
		this.dbId = dbId;
		this.dbPwd = dbPwd;
		connect();
	}
	
	private void connect()
	{
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,dbId,dbPwd);
			conn.setAutoCommit(false);
			System.out.println("접속완료!!!!!!!!!");
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("해당 클래스가 없음 \n" + cnfe.getMessage());
		}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
	}

	public void disConnect()
	{
		try{
			if(conn != null)
			{
				conn.close();
				System.out.println("DB 종료 완료!");
			}
		}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
	}
	public void setConn(Connection conn)
	{
		this.conn = conn;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public void setDbId(String dbId)
	{
		this.dbId = dbId;
	}
	public void setDbPwd(String dbPwd)
	{
		this.dbPwd = dbPwd;
	}
	public Connection getConn()
	{
		return conn;
	}
	public String getUrl()
	{
		return url;
	}
	public String getDbId()
	{
		return dbId;
	}
	public String getDbPwd()
	{
		return dbPwd;
	}
	public String toString()
	{
		String conStr = conn.toString();
		String str = conStr + " / " + url+ " / "+dbId+" / "+dbPwd;
		return str;
	}
}
