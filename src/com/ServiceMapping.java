package com;

import java.util.Map;
import java.util.Set;

public class ServiceMapping {//服务映射模块，用来管理所有服务映射关系数据结构
    //包括定制服务ID到定制服务的映射，定制服务ID到定制服务名字的映射、定制服务ID到定制服务主机集合的映射
    //IP地址到MAC地址的映射， 主机到交换机端口的映射
    //通过包的匹配项得到包的源地址和目的地址，从而进一步确定该包所属的定制服务，达到了定制服务映射的目的

    private String restAPI;
    private String routingEngine;
    private Map<String ,CustomService> CSIDToCustomService;//表示定制服务ID到定制服务的映射表
    private Map<String ,String > CSIDToName;//表示定制服务ID到定制服务名字的映射表
    private Map<String,Set<AddrType>> CSIDToAddress;//表示定制服务ID到主机地址集合的映射表
    private Map<IPv4Address,MACAddress> IPToMAC;//表示主机IP地址到MAC地址的映射表
    private Map<IPv4Address,NodePortTuple> HostToSwitchPort;//表示IP地址到交换机端口的映射表
                                                            //即交换机端口所连接的主机

    public void createService(){

    }
    public void deleteService(){

    }
    public void addHost(){

    }
    public void deleteHost(){

    }
    public void init(){

    }
    public void getName(){

    }
    public void receive(){

    }
    public void getOwnedService(){

    }
    public void getSwitchStatistics(){

    }
    public void processBlockedTraffic(){

    }
    public void processCertainSrcDstTraffic(){

    }
    public void processBandwidthRequest(){

    }
    public void addRateLimitQueue(){

    }
    public void processPacketIn(){

    }
    public void addFlowsForEachSwitchInRoute(){

    }
    public void addFlow(){

    }
    public void listALLService(){

    }
    public void listService(){

    }

}
