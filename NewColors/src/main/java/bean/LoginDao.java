package bean;
import java.sql.*;

public class LoginDao {

	public static boolean validate(LoginBean bean){
		boolean status=false;
		String jdbcURL = "jdbc:derby:newcolor";
		try{
			Connection con=DriverManager.getConnection(jdbcURL);
			
			PreparedStatement ps=con.prepareStatement("SELECT * FROM LogPass WHERE login=? and password=?");
			ps.setString(1,bean.getLogin());
			ps.setString(2, bean.getPass());
			System.out.println(ps);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){}
		return status;
	}
}
