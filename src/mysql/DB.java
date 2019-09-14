package mysql;

import java.sql.*;

public class DB {
    public static void main(String[] args) {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mysql";
        String user="root";
        String password="123456";

        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,user,password);
            if (!con.isClosed()){
                System.out.println("数据库连接成功");
            }
            Statement statement=con.createStatement();
            String sql="select * from test;";
            ResultSet resultSet=statement.executeQuery(sql);
            String name;
            while (resultSet.next()){
                name=resultSet.getString("name");
                System.out.println("姓名"+name);

            }
            resultSet.close();
            con.close();
        }catch(ClassNotFoundException e){
            System.out.println("数据库驱动没有安装");
        }catch (SQLException e){
            System.out.println("数据库连接失败");
        }
    }
}
