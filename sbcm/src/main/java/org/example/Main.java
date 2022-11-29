package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //jdbc测试
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://host/test?user=username&password=password")) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from user1 limit 1");
            if(rs.next()){
                System.out.println(rs.getString("user_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}