
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class databaseConnection {
    // /Users/e./NetBeansProjects/mysql-connector-j-8.4.0
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // com.mysql.cj.jdbc.Driver
        final static String DB_URL = "jdbc:mysql://localhost:3306   /openuniv2";
    
    final static String USER = "root";
    final static String PASS = "";
    
    public static Connection connection() {
        try {
            Class.forName(JDBC_DRIVER);
            
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            return conn;
            
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
