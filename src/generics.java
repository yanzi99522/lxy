import java.util.ArrayList;
import java.util.List;
//泛型generics
public class generics {
    public static void main(String[] args) {
        List<String >  list=new ArrayList<>();
        //向集合中添加元素
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //遍历集合
        //使用增强for循环遍历
        for (String item:list){
            System.out.println("读取集合元素："+item);
        }
    }
}
