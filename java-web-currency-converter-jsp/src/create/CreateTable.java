package create;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo-jdbc", "root", "admin1234");
//        String sql = "CREATE TABLE user_info (" +
//                "  id int(11) NOT NULL AUTO_INCREMENT," +
//                "  name varchar(45) DEFAULT NULL," +
//                "  address varchar(255) DEFAULT NULL," +
//                "  PRIMARY KEY (id)" +                ")";
//0
//        PreparedStatement stmt = connection.prepareStatement(sql);
        String sql2="CREATE TABLE customer("+
                " customer_number int(11) NOT NULL AUTO_INCREMENT,"+
                " customer_name varchar(45) DEFAULT NULL,"+
                "PRIMARY KEY (customer_number)"+           ")";
        PreparedStatement stmt2= connection.prepareStatement(sql2);
        stmt2.executeUpdate(sql2);
//        stmt.executeUpdate(sql);
        connection.close();
        System.out.println("Created!");
    }
}