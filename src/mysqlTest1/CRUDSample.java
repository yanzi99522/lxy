package mysqlTest1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class CRUDSample {
    //连接数据库url
    static String url;
    //创建Properties对象
    static Properties info = new Properties();
    //1.驱动程序加载
    static {
        //获得属性文件输入流
        InputStream inputStream = CRUDSample.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            //加载属性文件内容到Properties对象
            info.load(inputStream);
            //从属性文件中取出driver
            String driverClassName=info.getProperty("driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动程序加载成功。。。");

        }catch (ClassNotFoundException e){
            System.out.println("驱动程序加载失败、、、");
        }catch (IOException e){
            System.out.println("加载属性文件失败");
        }
    }

    public static void main(String[] args) {
        //查询数据
        read();
    }
    //数据查询操作
    public static void read(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            //2.创建数据库连接
            connection= DriverManager.getConnection(url,info);
            //3.创建语句对象
            preparedStatement=connection.prepareStatement(
                    "select name ,userid from "+"user where userid >? order by userid");
            //4.绑定参数
            preparedStatement.setInt(1, 0);
            //5.执行查询（R)
            resultSet=preparedStatement.executeQuery();
            //6.遍历结果集
            while (resultSet.next()){
                System.out.printf("id: %d name: %s\n",resultSet.getInt(2),resultSet.getString("name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //7.释放资源
            if (resultSet!=null){
                try {
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
