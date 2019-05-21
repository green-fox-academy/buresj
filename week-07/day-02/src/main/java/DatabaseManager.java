import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/todoapp";
        String username = "mysqladmin";
        String password = "";

        Connection dbCon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "SELECT task_text FROM task WHERE task_id = 1";

        try {
            dbCon = DriverManager.getConnection(dbURL, username, password);
            stmt = dbCon.prepareStatement(query);
            rs = stmt.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}








