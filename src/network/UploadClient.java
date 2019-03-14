package network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class UploadClient {

    public static void main(String[] args) {

        System.out.println("客户端运行...");

        try ( // 向本机的8080端口发出请求
              Socket socket = new Socket("127.0.0.1", 8080);
              // 由Socket获得输出流，并创建缓冲输出流
              BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
              // 创建文件输入流
              FileInputStream fin = new FileInputStream("C:\\Users\\lxy\\Pictures\\cos.jpg");
              //由文件输入流创建缓冲输入流
              BufferedInputStream in = new BufferedInputStream(fin)) {

            // 准备一个缓冲区
            byte[] buffer = new byte[1024];
            //首次读取文件
            int len = in.read(buffer);
            while (len != -1) {
                /// 数据写入Socket
                out.write(buffer, 0, len);
                // 再次读取文件
                len = in.read(buffer);
            }

            System.out.println("上传成功！");

        } catch (ConnectException e) {
            System.out.println("服务器未启动");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

