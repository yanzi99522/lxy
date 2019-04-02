package fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyT {
    public static void main(String[] args) {
        try (
                FileInputStream in=new FileInputStream("./TestDir/src.zip");
                FileOutputStream out=new FileOutputStream("./TestDir/subDir/src.zip")){
            //开始时间，当前系统纳秒时间
            long startTime=System.nanoTime();
            //准备一个缓冲区
            byte[] buffer=new byte[1024];
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
            //结束时间，当前系统纳秒时间
            long elapsedTime=System.nanoTime()-startTime;
            System.out.println("耗时："+(elapsedTime/1000000.0)+"毫秒");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
