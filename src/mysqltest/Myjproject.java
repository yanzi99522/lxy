package mysqltest;

import java.sql.*;

public class Myjproject {
 public static void main(String args[])
 {
     try {
          Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
          //Class.forName("org.gjt.mm.mysql.Driver");
         System.out.println("Success loading Mysql Driver!");
        }
        catch (Exception e) {
          System.out.print("Error loading Mysql Driver!");
          e.printStackTrace();
        }
  try {
      Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","123456");
     
       int num=100;
       PreparedStatement Statement=connect.prepareStatement("INSERT INTO user VALUES(?,?)");
       for(int i=0;i<num;i++)        //�����100�ε�ѭ�������������һ������Ϣ��
      {
           Statement.setString(1,"lxy"+i);
           Statement.setString(2,"test"+i);
           Statement.executeUpdate();
   }

  // } catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
   // System.out.println("An error has occurred:"+e.toString());
  //  e.printStackTrace();
   }catch(SQLException e)
   {
   }
 }
}
