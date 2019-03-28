package MultiThread;

public class ProCustomer {
    public static void main(String[] args) {
        Stack stack=new Stack();
        //下面的消费者和生产者所操作的是同一个堆栈对象stack
        //生产者线程
        Thread producer=new Thread(()->{
            char c;
            for (int i=0;i<10;i++){
                //随机产生10个字符
                c=(char)(Math.random()*26+'A');
                //把字符压栈
                stack.push(c);
                //打印字符
                System.out.println("生产："+c);
                try {
                    //每产生一个字符线程就睡眠
                    Thread.sleep((int)(Math.random()*1000));
                }catch (InterruptedException e){

                }
            }
        });

        //消费者线程
        Thread customer=new Thread(()->{
            char c;
            for (int i=0;i<10;i++){
                //从堆栈中读取字符
                c=stack.pop();
                //打印字符
                System.out.println("消费："+c);
                try {
                    //每读取一个字符线程就睡眠
                    Thread.sleep((int)(Math.random()*1000));
                }catch (InterruptedException e){

                }
            }
        });

        producer.start();//启动生产者线程
        customer.start();//启动消费者线程
    }
}
