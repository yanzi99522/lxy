package DataStructure;

public class Josephus {
    //创建Josephus环，参数指定环长度，起始位置，计数
    public Josephus(int n,int start,int distance){
        System.out.println("Josephus环(" + n + "," + start + "," + distance + ")");
        //创建顺序表实例，元素类型是字符串，构造方法参数指定顺序表容量
        SeqList<String>list=new SeqList<String >(n);
        for (int i=0;i<n;i++){
            list.insert((char)('A'+i)+"");
        }
        System.out.println(list.toString());
        int i=start;
        while (list.size()>1){
            i=(i+distance-1)%list.size();
            System.out.print("删除" + list.remove(i).toString() + ",");
            System.out.println(list.toString());
        }
        System.out.println("被赦免者是"+list.get(0).toString());
    }

    public static void main(String[] args) {
        new Josephus(5, 0, 2);
    }
}
