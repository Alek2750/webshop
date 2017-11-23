package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnector {

    private Connection conn = null;

    //Constants
    private static final String IP = "localhost";
    private static final int PORT = 3306;
    public static final String DATABASE = "webshop";
    private static final String USERNAME = "java";
    private static final String PASSWORD = "java";

    public DBConnector() throws Exception {
        try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        this.conn = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
        
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return this.conn;
    }
}
