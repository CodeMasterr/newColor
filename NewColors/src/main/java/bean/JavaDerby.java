package bean;
import java.sql.*;

public class JavaDerby {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:derby:newcolor;create=true;";
		
		//block try catch dla polaczenia do bazy danych
		try {
		
			Connection connection = DriverManager.getConnection(jdbcURL);
			//System.out.println("New derby db created");
			String sql;
			Statement statement = connection.createStatement();

		//dropowanie tabeli uzytkownikow
			if(!tableExists(connection,"LogPass")) {
				sql = "DROP TABLE LogPass";
				statement.executeUpdate(sql);
				System.out.println("Successfuly drop LogPass table");
			} else System.out.println("LogPass table doesn't exist");
				

	
		//dropowanie tabeli ulubionych filmow
			if(!tableExists(connection,"Favorite")) {
				sql = "DROP TABLE Favorite";
				statement.executeUpdate(sql);
				System.out.println("Successfuly drop Favorite table");
			} else System.out.println("Favorite table doesn't exist");

		//tworzenie tabeli uzytkownikow	
				sql = "Create Table LogPass("
						//+ "id int not null,"
						+ "login varchar(128) not null,"
						+ "password varchar(128) not null)";
				statement.executeUpdate(sql);
				System.out.println("Successfuly create LogPass table");
		//tworzenie tabeli ulubionych filmow		
				sql = "Create Table Favorite("
						+ "id int not null,"
						+ "title varchar(128) not null,"
						+ "description varchar(128) not null,"
						+ "genre varchar(128) not null,"
						+ "director varchar(128) not null,"
						+ "poster blob not null,"
						+ "link varchar(128) not null)";
				statement.executeUpdate(sql);
				System.out.println("Successfuly create Favorite table");
			
			//tworzenie tabeli uzytkownikow		
				/*statement.executeUpdate("INSERT INTO LogPass VALUES (1,'Malcolm','GTC68MHL4BY')");
				statement.executeUpdate("INSERT INTO LogPass VALUES (2,'Ann','WMD24FPH8SB')");
				statement.executeUpdate("INSERT INTO LogPass VALUES (3,'Palmer','VNO61UWI3BH')");
				statement.executeUpdate("INSERT INTO LogPass VALUES (4,'abc','cba')");*/
				
				statement.executeUpdate("INSERT INTO LogPass VALUES ('Malcolm','GTC68MHL4BY')");
				statement.executeUpdate("INSERT INTO LogPass VALUES ('Ann','WMD24FPH8SB')");
				statement.executeUpdate("INSERT INTO LogPass VALUES ('Palmer','VNO61UWI3BH')");
				statement.executeUpdate("INSERT INTO LogPass VALUES ('abc','cba')");
				System.out.println("Successfuly fill LogPass table");

				ResultSet rs= statement.executeQuery("SELECT * FROM LogPass WHERE login='Ann' and password='WMD24FPH8SB'");
				//boolean IsIttrue =statement.execute("SELECT * FROM LogPass WHERE login='Palmer' and password='VNO61UWI3BH'");
				boolean status=rs.next();
				System.out.println(status);
				
				rs= statement.executeQuery("SELECT * FROM LogPass WHERE login='abc' and password='cba'");
				status=rs.next();
				System.out.println(status);
				
				rs= statement.executeQuery("SELECT * FROM LogPass WHERE login='1' and password='123'");
				status=rs.next();
				System.out.println(status);
				
				rs= statement.executeQuery("SELECT * FROM LogPass");
				System.out.println(rs.getString("login")+ " " + rs.getString("password"));
				
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static boolean tableExists(Connection connection, String tableName) throws SQLException {
		    DatabaseMetaData meta = connection.getMetaData();
		    ResultSet resultSet = meta.getTables(null, null, tableName, new String[] {"TABLE"});
		    //System.out.println(resultSet);
		    return resultSet.next();
	}
}
