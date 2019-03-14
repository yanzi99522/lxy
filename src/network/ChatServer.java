package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {

		System.out.println("服务器运行。。。");

		Thread t = new Thread(() -> {

			try ( // 创建一个ServerSocket监听端口8080客户请求
					ServerSocket server = new ServerSocket(8080);
					// 使用accep（）阻塞等待客户端请求
					Socket socket = server.accept();
					DataInputStream in = new DataInputStream(socket.getInputStream());
					DataOutputStream out = new DataOutputStream(socket.getOutputStream());
					BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in))) {

				while (true) {
					//接收数据
					String str = in.readUTF();
					// 打印接收的数据
					System.out.printf("从客户端接收的数据：【%s】\n", str);

					//发送数据
					//读取键盘输入的字符串
					String keyboardInputString = keyboardIn.readLine();
					// 结束聊天
					if (keyboardInputString.equals("bye")) {
						break;
					}
					// 发送
					out.writeUTF(keyboardInputString);
					out.flush();
				}
			} catch (Exception e) {
			}
			System.out.println("服务器停止ֹ...");
		});

		t.start();
	}
}
