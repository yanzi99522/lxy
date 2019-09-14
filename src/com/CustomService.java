package com;

import java.util.Collection;

public class CustomService {
    private  String name;//表示定制服务网络类型，不能为空
    private  String CSID;//表示定制服务ID，不能为空
    private  String traffic;//表示定制服务所要隔离的流量类型
    private  String srcHost;//表示源主机
    private  String dstHost;//表示目的主机
    private  String bandwidth;//表示定制服务有带宽的需求，且带宽需求大小为bandwidth的值
    private  Collection<AddrType> hosts;//表示定制服务的主机集合，
    // 其中AddrType表示hosts中存储的主机集合以类型AddrType标识，如以IP地址或者MAC地址标识

    public void setName(String name) {//设置定制服务的名字
        this.name = name;
    }
    public void getName(String name) {//获取定制服务的名字
        this.name = name;
    }
    public String getBandwidth() {//得到此定制服务带宽要求的大小
        return bandwidth;
    }
    public String setSrcHost() {//源主机
       this.srcHost=srcHost;
       return srcHost;
    }
    public String getSrcHost() {//得到此定制服务所要隔离的源地址
        return srcHost;
    }
    public Collection<AddrType> addHost() {//往定制服务中添加主机
        return hosts;
    }
    public String getTraffic() {//得到此定制服务所要隔离的流量类型

        return traffic;
    }
    public String getDstHost() {//得到此定制服务所要隔离的目的地址

        return dstHost;
    }

}
