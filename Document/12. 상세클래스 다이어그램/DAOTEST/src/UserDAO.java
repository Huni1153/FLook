

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.DBConnection;
import VO.UserVO;

public class UserDAO {
	private ArrayList<UserVO> userVOList;
	private DBConnection dbConnection;
	

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	public UserDAO(ArrayList<UserVO> userVOList) {
		this.userVOList = userVOList;
		this.dbConnection = new DBConnection();
	}
	
	public UserDAO(ArrayList<UserVO> userVOList, DBConnection dbConnection) {
		super();
		this.userVOList = userVOList;
		this.dbConnection = dbConnection;
	}

	public ArrayList<UserVO> getUserVOList() {
		return userVOList;
	}

	public void setUserVOList(ArrayList<UserVO> userVOList) {
		this.userVOList = userVOList;
	}
	public UserVO checkLogin(String email, String password){
		PreparedStatement pstmt=null;
		UserVO userVO=null;
		
		String userCode=null;
		String userName=null;
		String userImage=null;
		String userEmail=null;
		String userPassword=null;
		String userGender= null;
		String userBirthday=null;
		
		
		
		try
		{
			String sql="select user_name,user_image,user_email,user_gender,user_birthday from user_tb "
					+ "where user_email='?' AND user_password=?";
					
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setString(2,password);

			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				userCode=rs.getString("user_code");
				userName=rs.getString("user_name");
				userImage=rs.getString("user_image");
				userEmail=rs.getString("user_email");
				userPassword=rs.getString("user_password");
				userGender=rs.getString("user_gender");
				userBirthday=rs.getString("user_birthday");
			
			}
				
				userVO=new UserVO(userCode,userName,userImage,userEmail,userPassword,userGender,userBirthday);
				 
				

		}
		
		catch(SQLException se)
		{
				System.out.println(se.getMessage());
			//se.stackTracePrint();
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
			//e.stackTracePrint();
		}
		finally
		{
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
				}
				catch(SQLException se)
				{
				System.out.println(se.getMessage());
					//se.stackTracePrint();
				}
			}
		}

		if(userVO!=null){
			return userVO;
		}
		else{
			return null;
		}
		
		
	}
	
	public int joinUs(String userName,String userImage, String userEmail,String userPassword,String userGender,String userBirthday )
	{
		/*INSERT INTO user_tb(user_code,user_name,user_image,user_email,user_password,user_gender,user_birthday)
		VALUES('USER_150729_001','전상우','http://www.naver.com','swj1539@naver.com','1539','남성',to_date('1990/08/04','yyyy/mm/dd'))
	*/
		PreparedStatement pstmt=null;
		int row=0;
		
		try
		{
			String sql="INSERT INTO user_tb(user_code,user_name,user_image,user_email,user_password,"
					+ "user_gender,user_birthday)"+
		"VALUES(?,?,?,?,?,?,to_date('?','yyyy/mm/dd'))";
			pstmt=dbConnection.getConn().prepareStatement(sql);
			pstmt.setString(1,"1");//코드생성필요
			pstmt.setString(2,userName);
			pstmt.setString(3,userImage);
			pstmt.setString(4, userEmail);
			pstmt.setString(5, userPassword);
			pstmt.setString(6, userGender);
			pstmt.setString(7, userBirthday);

			row=pstmt.executeUpdate();
			if(row!=0)
				dbConnection.getConn().commit();
			else
				dbConnection.getConn().rollback();
			
			
		}
		
		catch(SQLException se)
		{
				System.out.println(se.getMessage());
			//se.stackTracePrint();
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
			//e.stackTracePrint();
		}
		finally
		{
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
				}
				catch(SQLException se)
				{
					System.out.println(se.getMessage());
					//se.stackTracePrint();
				}
			}
		}

		return (byte) row;
	
	}
	
	

}
