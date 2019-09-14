package a720;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author lxy
 */
public class CallableTest {
    //创建线程类
    public static class CallableT implements Callable<String >{
        public String call()throws Exception{
            return "hello world";
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool= Executors.newSingleThreadExecutor();
        //启动线程
        Future<String>future=threadPool.submit(new CallableT());
        try {
            System.out.println("waiting thread to finish");
            System.out.println(future.get());
            //等待线程结束，并获取返回结果
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
