package fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (
            FileInputStream in=new FileInputStream("./TestDir/build.txt");
            FileOutputStream out=new FileOutputStream("./TestDir/subDir/build.txt")){

            //准备一个缓冲区
            byte[] buffer=new byte[10];
            //首先读取一次
            int len=in.read(buffer);

            while (len!=-1){
                String copyStr=new String(buffer);
                //打印复制的字符串
                System.out.println(copyStr);
                //开始写入数据
                out.write(buffer,0,len);
                //再读取一次
                len=in.read(buffer);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
