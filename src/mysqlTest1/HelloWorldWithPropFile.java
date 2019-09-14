/*
* Created by �ǽݿ���
* ������վ��http://www.zhijieketang.com/group/5
* �ǽݿ������߿��ã�www.zhijieketang.com
* �ǽݿ���΢�Ź����ţ�zhijieketang
* ���䣺eorient@sina.com
* Java���߷���QQȺ��547370999
*
* ��Java��С�׵���ţ��ֽ�ʰ�ͼ�飬��������Ƶ
*
* �����׵����顿��ַ��
*       ͼ��������
*       http://www.ituring.com.cn/book/2480
*       �ٶ��Ķ���
*       https://yuedu.baidu.com/ebook/7c1499987e192279168884868762caaedd33ba00 
*/


//HelloWorldWithPropFile.java�ļ�
package mysqlTest1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class HelloWorldWithPropFile {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����������سɹ�...");

		} catch (ClassNotFoundException e) {
			System.out.println("�����������ʧ��...");
			// �˳�
			return;
		}

		Properties info = new Properties();
		try {
			InputStream input = HelloWorldWithPropFile.class.getClassLoader()
					.getResourceAsStream("config.properties");

			info.load(input);

		} catch (IOException e) {
			// �˳�
			return;
		}

		String url = "jdbc:mysql://localhost:3306/MyDB";

		try (Connection conn = DriverManager.getConnection(url, info)) {

			System.out.println("���ݿ����ӳɹ���" + conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
