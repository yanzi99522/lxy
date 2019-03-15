package com;

public interface IMonitorService {
    public void getAvailableBandwidth();//获得交换机相应端口的可用带宽
    public void getDelay();//获得源交换机到目的交换机端口的时延
    public void getPacketLossRate();//获得源交换机到目的交换机端口的丢包率
}
