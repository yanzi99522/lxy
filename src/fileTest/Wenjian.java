package fileTest;

import java.io.File;
import java.io.FilenameFilter;


public class Wenjian {
    public static void main(String[] args) {
        //用File对象表示一个目录，.表示当前目录
        File dir=new File("./TestDir");
        //创建HTML文件过滤器
        Filter filter=new Filter("html");
        System.out.println("HTML文件目录："+dir);
        //列出目录TestDir下，文件后缀名为HTML的所有文件
        String files[]=dir.list(filter);
        //遍历文件列表
        for (String fileName:files){
            //为目录TestDir下的文件或目录创建File对象
            File f=new File(dir,fileName);
            //如果该f对象是文件，则打印文件名
            if (f.isFile()){
                System.out.println("文件名：" + f.getName());
                System.out.println("文件绝对路径：" + f.getAbsolutePath());
                System.out.println("文件路径："+f.getPath());
            }else {
                System.out.println("子目录："+f);
            }
        }
    }
}
//自定义基于文件扩展名的文件过滤器
class Filter implements FilenameFilter{
    //文件扩展名
    String extent;
    //构造方法
    Filter(String extent){
        this.extent=extent;
    }
    @Override
    public boolean accept(File dir,String name){
        //测试文件扩展名是否为extent所指定的
        return name.endsWith("."+extent);
    }
}
