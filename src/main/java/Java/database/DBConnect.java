package Java.database;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class DBConnect {

	public static void main(String[] args) throws SQLException {
		
		String url = "";
		String username = "sachin";
		String password = "264";
		
		Connection conn = DriverManager.getConnection(url , username , password);
		
		Statement stmt = conn.createStatement();
		
		String query = "SELECT * FROM Tablename";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString("Columnname"));
		}
		
		rs.close();
		stmt.close();
		conn.close();

	}

}
