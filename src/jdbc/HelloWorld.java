package jdbc;

public class HelloWorld {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动程序加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
