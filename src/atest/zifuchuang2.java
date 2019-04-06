package atest;

public class zifuchuang2 {
    public static void main(String[] args) {
        String str=new String();
        str="There is a string accessing example.";
        String [] array=str.split(" ");
        for (String string:array){
            System.out.println(string);
        }
//        String  str2=str.trim();
//        System.out.println(str.trim().length());
//        int len=str.length();
//        System.out.println(str.substring(3, 9));
//        System.out.println(str.substring(3));
//        System.out.println("字符串str是：" + str);
//        char c = str.charAt(16);
//        System.out.println(c);
//        int firstchar1=str.indexOf('r');
//        int lastchar1=str.lastIndexOf("r");
//        int firsrstr1=str.indexOf("ing");
//        int laststr1=str.lastIndexOf("ing");
//        int firstchar2=str.indexOf('e',15);
//        int lastchar2=str.lastIndexOf("e",15);
//        int firststr2=str.indexOf("ing",5);
//        int laststr2=str.lastIndexOf("ing",5);
//        System.out.println(firsrstr1 +" "+ firstchar1 +"  "+ firstchar2 + " "+ firststr2);
//        System.out.println(lastchar1 + "  "+lastchar2 +  "   "+laststr1 +" "+ laststr2);
//        System.out.println("字符串的长度："+len);
    }
}
