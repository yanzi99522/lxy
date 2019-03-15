package com;

public interface ICustomService {//提供定制服务的相关
    void createNetwork();//创建新的定制服务
    void deleteNetwork();//通过CSID删除定制服务
    void addHost();//向定制服务中添加主机
    void deleteHost();//向定制服务中删除主机
    void listAllCustomService();//列出系统中存在的所有定制服务
    void listCustomService();//列出某一个定制服务


}
