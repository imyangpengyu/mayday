package javaPart.utils;

import java.sql.*;

/**
 * @author ypy
 * @date 2018/1/18 21:11
 */
public class JDBCUtil {
    private static String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static String user = "ypy";
    private static String password = "123456";

    private JDBCUtil() {
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void free(ResultSet rs, PreparedStatement ps, Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}