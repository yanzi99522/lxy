package stringtest;

public class SplitS {
    public static void main(String[] args) {
        String str="www-baidu-com";
        System.out.println(str);
        System.out.println(str.replace('b','J'));
        StringBuffer sbf=new StringBuffer("HRRPP123");

        System.out.println(sbf.reverse());
        System.out.println();
        String[] temp;
        String D="-";
        temp=str.split(D);
        System.out.println(temp);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }


        String str2="www.baidu.com";
        String[] temp2;
        String de="\\.";
        temp2=str2.split(de);
        for (int i=0;i<temp2.length;i++){
            System.out.println(temp2[i]);
        }
    }
}
