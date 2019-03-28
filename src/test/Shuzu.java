package test;

public class Shuzu {
    public static void main(String[] args) {
        //静态初始化
        String [] books=new String[]
                {"ABA","MMM","DDD","PPP"};
        String [] names=new String[]{
                "1","256","999"
        };

        //动态初始化
        String[] strings=new String[5];
        System.out.println("第一个数组的长度：" + books.length);
        System.out.println("第二个数组的长度：" + names.length);
        System.out.println("第三个数组的长度：" + strings.length);
    }
}
