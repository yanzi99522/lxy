package aaaaniu.ke.wang.testMAIN;

import java.util.*;

public class xioabaishuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Map<String, String> map = new HashMap<String, String>();
        Map map=new HashMap();
        int n = in.nextInt();
        while (in.hasNext()) {

            String key1 = in.next();
            String value1 = in.next();
            map.put("key1", "value1");
        }
//        Set<String> set=new HashSet<>();
        Set keys=map.keySet();

        Collection values=map.values();
        for (Object key:keys){
            int ikey=(Integer)key;
            String value=(String)map.get(ikey);
            System.out.printf("key=%d-value=%s\n",ikey,value);
        }
    }
}
