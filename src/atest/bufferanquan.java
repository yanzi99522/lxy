package atest;

public class bufferanquan {
    public static void main(String[] args) {
//        StringBuilder sb1=new StringBuilder();
//        System.out.println("字符串长度：" + sb1.length());
//        System.out.println("字符串容量："+sb1.capacity());

        StringBuilder sb2=new StringBuilder("Hello");
//        System.out.println("字符串长度" + sb2.length());
//        System.out.println("字符串容量：" + sb2.capacity());
        sb2.append("world");
        sb2.insert(3,"c++");
        System.out.println(sb2);
        sb2.append("and java");
        System.out.println(sb2);
//        System.out.println("字符串长度" + sb2.length());
//        System.out.println("字符串容量：" + sb2.capacity());
//        StringBuilder sb3=new StringBuilder();
//        for (int i=0;i<17;i++){
//            sb3.append(8);
//        }
//        System.out.println("字符串长度" + sb3.length());
//        System.out.println("字符串容量：" + sb3.capacity());
    }
}
