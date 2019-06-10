package create;

import java.sql.*;

public class UpdateRow {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo-jdbc", "root", "admin1234");
        Statement statement = connection.createStatement();
        String sql = "UPDATE user_info SET address = 'VietNam' WHERE address = 'England';";
        statement.executeUpdate(sql);
        connection.close();
        System.out.println("updated");

    }
}
