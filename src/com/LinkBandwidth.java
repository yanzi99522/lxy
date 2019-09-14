package com;

/**
 * @author lxy
 */
public class LinkBandwidth {
    private String srcID;//源交换机
    private String srcPort;//源端口
    private String dstID;//目的交换机
    private String dstPort;//目的端口
    private String route;//保存路由
    private String forTotalTimeID;//是为Packet-Out消息打的标签ID，控制器可以根据这个标签识别该包是用于时延测量的包
    private String forLossRateID;//表示需要将Packet-Out消息打的标签ID
    private String startTime;//记录了控制器发送Packet-out消息到路径上第一个交换机的时间
    private String startTimeForControllerToSwitch;//控制器发送到交换机数据包的时间
    private String endTime;//
    private String endTimeForControllerToSwitch;//控制器收到该交换机数据包的时间
    private String totalTime;//记录了控制器-交换机-控制器的总时延
    private String numberOfSendPackets;//表示控制器发送Packet-Out消息的个数
    private String numberOfReceivedPackets;//表示控制器收到转发过来Packet-In消息的个数

    public void getAvailableBandwidth() {//获得可用带宽
        //1.首先通过getSwitchStatistics得到交换机端口的统计信息values，并将这些信息放在List<OFStatistics>中
        //2.然后在该列表中查找类型为OFPortStatisticsReply的消息。通过该消息对象获得接收字节数（getReceivedBytes)
        //  和传输字节数（getTransmitBytes),将这两个值相加得到bytesBefore,即当前的字节数，同时记录当前的时间beforeTime
        //3.测量线程等待DEFAULT_PERIOD_FOR_BANDWIDTH毫秒（默认1000毫秒）
        //4.继续通过getSwitchStatistics得到交换机端口的统计信息values，得到bytesEnd和endTime
        //5.计算已用传输带宽为（bytesEnd-bytesBefore)/(endTime-beforeTime),
        //  可用带宽为链路总带宽减去已用传输带宽
        return;
    }
}
