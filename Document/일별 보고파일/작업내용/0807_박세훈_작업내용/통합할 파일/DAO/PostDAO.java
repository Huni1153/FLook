package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Connection.DBConnection;
import VO.PostVO;

public class PostDAO {
	private DBConnection dbConnection; 
	private static int codeNum=1; 
	private static final String codeType="0201UP";

	private static PostDAO dao;
	static{
		dao=new PostDAO();
	}

	public static PostDAO getInstance()
	{
		return dao;
	} 
	private PostDAO() {
		dbConnection = DBConnection.getInstance();
	}
	public DBConnection getDbConnection() {
		return dbConnection;
	}
	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public String insertPost(String recipeCode,String userCode,int likeCount,int postHits,String postHashTag)
	{
		PreparedStatement pstmt=null;
		String postCode=codeGenerator2();//CalculateCode.makeCode(codeType, codeNum);
		int row = 0; 
		try
		{
			String sql = "INSERT INTO post_tb VALUES(?,?,?,?,?,?,sysdate)";
			Connection conn = dbConnection.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,postCode);
			pstmt.setString(2,recipeCode);
			pstmt.setString(3,userCode);
			pstmt.setInt(4,likeCount);
			pstmt.setInt(5,postHits);
			pstmt.setString(6,postHashTag);  
			
			row=pstmt.executeUpdate();
			if(row!=0)
			{
				conn.commit();
			}
			
		}
		catch(SQLException se){
			se.printStackTrace(); 
		}finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace(); 
			}
		}   
		if(row!=0)
		{
			codeNum++;
			return postCode;
		}
		return null; 	
	}
	public String insertPost(String postCode,String recipeCode,String userCode,int likeCount,int postHits,String postHashTag)
	{
		PreparedStatement pstmt=null;
		int row = 0; 
		try
		{
			String sql = "INSERT INTO post_tb VALUES(?,?,?,?,?,?,sysdate)";
			Connection conn = dbConnection.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,postCode);
			pstmt.setString(2,recipeCode);
			pstmt.setString(3,userCode);
			pstmt.setInt(4,likeCount);
			pstmt.setInt(5,postHits);
			pstmt.setString(6,postHashTag);  
			
			row=pstmt.executeUpdate();
			if(row!=0)
			{
				conn.commit();
			}
			
		}
		catch(SQLException se){
			se.printStackTrace(); 
		}finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace(); 
			}
		}   
		if(row!=0)
		{
			return postCode; 	
		}
		return null;
	}
	public String insertPost(PostVO postVO)
	{
		String postCode=postVO.getPostCode();
		String recipeCode=postVO.getRecipeCode();
		String userCode=postVO.getUserCode();
		int likeCount=postVO.getLikeCount();
		int postHits=postVO.getPostHits();
		String postHashTag=postVO.getPostHashtag();
		String postDate=postVO.getPostDate();
		if(postCode!=null)
		{
			return this.insertPost(postCode, recipeCode, userCode, likeCount, postHits, postHashTag); 	
			}
		else
		{
			System.out.println(postVO);
			return this.insertPost(recipeCode, userCode, likeCount, postHits, postHashTag);			
		}
	}
	public int deletePost(String postCode)
	{
		int row = 0;
		PreparedStatement pstmt = null;
		try {

			String sql = "DELETE FROM post_tb WHERE post_code=?";
			pstmt = dbConnection.getConn().prepareStatement(sql);
			
			pstmt.setString(1, postCode);
			
			row = pstmt.executeUpdate();
			if (row != 0)
				dbConnection.getConn().commit();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
		}
		return row;
	}
/*	public String codeGenerator2(){
		SimpleDateFormat formatter = new SimpleDateFormat ( "yyyyMMdd", Locale.KOREA );
		Date currentTime = new Date ( );
		String dTime = formatter.format ( currentTime );
		System.out.println ( dTime );
		
		return dTime+"UP"+System.currentTimeMillis();
	}*/

	public String codeGenerator2(){
		return "0201UP"+System.currentTimeMillis();
	}
	
	public static void main(String[] args)
	{
		PostDAO dao=PostDAO.getInstance();
		//System.out.println(dao.insertPost("0101UR3", "USER_150729_001", 1, 1, "#a"));
		System.out.println(dao.deletePost("0101UR3"));
	}
}
