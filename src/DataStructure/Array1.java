package DataStructure;

public class Array1 {
    public static void print(Object[] value){
        //输出对象数组元素，静态方法。时间复杂度O（n）
        for (Object obj:value){
            System.out.print(obj == null ? "null" : "" + obj.toString());
            System.out.println();
        }
    }
    //产生n个随机数，范围是0到size-1，返回整数对象数组
    public static Integer[] randomInteger(int n,int size){
        Integer[] values=new Integer[n];
        for (int i=0;i<values.length;i++){
            values[i]=new Integer((int)(Math.random()*size));
        }
        return values;
    }

    public static void main(String[] args) {
        int n=10,size=100;
        Integer[] values=Array1.randomInteger(n,size);
        //通过类名调用类的静态方法
        System.out.println(n+"个元素0~"+size+"之间的随机数的集合：");
        Array1.print(values);
    }
}
