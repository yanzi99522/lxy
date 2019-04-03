package mysqlTest1;

import java.sql.*;
import java.util.Properties;

public class Hello1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动程序加载成功。。。");
        }catch (ClassNotFoundException e){
            System.out.println("驱动程序加载失败。。。");
            //退出
            return;
        }

        String url="jdbc:mysql://localhost:3306/MyDB";
        //创建Properties对象
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","123456");
        info.setProperty("verifyServerCertificate","false");
        info.setProperty("useSSL","false");
//        String user="root";
//        String password="123456";

        try (//自动资源管理技术释放资源
                Connection conn= DriverManager.getConnection(url,info);
             Statement statement=conn.createStatement();
             ResultSet resultSet=statement.executeQuery("select name,userid from user")){
            while (resultSet.next()){
                System.out.printf("name:%s id:%d\n",resultSet.getString("name"),resultSet.getInt(2));
            }
//            System.out.println("数据库连接成功！"+conn);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
