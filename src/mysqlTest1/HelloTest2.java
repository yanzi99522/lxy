package mysqlTest1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class HelloTest2 {
    public static void main(String[] args) {
        //加载驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动程序加载成功。。。");
        }catch (ClassNotFoundException e){
            System.out.println("驱动程序加载失败。。。");
            //退出
            return;
        }

        Properties info = new Properties();
        try {
            InputStream input =HelloTest2.class.getClassLoader()
                    .getResourceAsStream("config.properties");
            info.load(input);
        }catch (IOException e){
            //退出
            return;
        }

        String url = "jdbc:mysql://localhost:3306/MyDB";

        try( Connection conn= DriverManager.getConnection(url,info)) {
            System.out.println("数据库连接成功。。。"+conn);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
