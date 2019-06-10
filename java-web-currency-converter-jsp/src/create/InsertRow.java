package create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRow {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo-jdbc", "root", "admin1234");
        Statement stmt = connection.createStatement();
        String sql = "INSERT INTO user_info(name, address) VALUES ('Harry', 'England')";
        String sql2= "INSERT INTO user_info(name, address) VALUES ('Batman', 'USA')";
        stmt.executeUpdate(sql);
        stmt.executeUpdate(sql2);
        connection.close();
        System.out.println("ok!");
    }
}
