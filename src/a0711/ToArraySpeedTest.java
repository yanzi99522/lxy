package a0711;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxy
 */
public class ToArraySpeedTest {
    private static final int COUNT=100*100*100;

    public static void main(String[] args) {
        List<Double> list=new ArrayList<>(COUNT);
        //构造一个100万元素的测试集合
        for (int i=0;i<COUNT;i++){
            list.add(i*1.0);
        }
        long start=System.nanoTime();
        Double[] notRnoughArray=new Double[COUNT-1];
        list.toArray(notRnoughArray);
        long middlel=System.nanoTime();
        Double[]equalArray=new Double[COUNT];
        list.toArray(equalArray);
        long middle2=System.nanoTime();
        Double[] doubleArray=new Double[COUNT*2];
        list.toArray(doubleArray);
        long end=System.nanoTime();

        long notEnoughArrayTime=middlel-start;
        long equalArrayTime=middle2-middlel;
        long doubleArrayTime=end-middle2;

        System.out.println("数组容量小于集合大小：NotEnoughArrayTime：" + notEnoughArrayTime / (1000.0 * 1000.0) + "ms");

        System.out.println("数组容量等于集合大小：equalArrayTime:" + equalArrayTime / (1000.0 * 1000.0) + "ms");

        System.out.println("数组容量是集合的两倍：doubleArrayTime:" + doubleArrayTime / (1000.0 * 1000.0) + "ms");
    }
}
