package a720;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lxy
 */
public class MainZHENGLI {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.nextLine();
            char[]chars=s.toCharArray();
            ArrayList<String  >arrayList=new ArrayList<>();
            for (int i=0;i<s.length();i++){
                arrayList.add(chars[i]+"");
            }
//            System.out.println(arrayList);
            arrayList.sort(String::compareTo);
//            System.out.println(arrayList);
            for (String ss:arrayList){
                System.out.print(ss);
            }

        }
    }
}
