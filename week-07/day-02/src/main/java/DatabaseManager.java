import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private String dbURL = "jdbc:mysql://localhost:3306/todoapp";
    private String username = "mysqladmin";
    private String password = "";

    private Connection dbCon = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public List<String> load() {

        String query = "SELECT * FROM task";
        List<String> content = new ArrayList<>();

        try {
            dbCon = DriverManager.getConnection(dbURL, username, password);
            stmt = dbCon.prepareStatement(query);
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                content.add(rs.getString(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return content;
    }
}








