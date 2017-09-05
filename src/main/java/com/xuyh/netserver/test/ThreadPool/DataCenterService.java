package com.xuyh.netserver.test.ThreadPool;


import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Thinkpad on 17/07/29.
 **/
public class DataCenterService {

    private static final ExecutorService executor =  Executors.newCachedThreadPool();
    public static boolean running = true;
    private static ConsumerConnector consumer;

    public void start(){
        Properties props = new Properties();
        String topic = "topic-ams";
        int topicCount = 1;
        props.put("zookeeper.connect","172.28.3.166:2181");
        props.put("group.id","kafka.ams");
        props.put("auto.offset.reset","largest");
        props.put("auto.commit.enable","false");
        props.put("zookeeper.connection.timeout.ms","15000");
        props.put("zookeeper.session.timeout.ms","5000");
        props.put("zookeeper.sync.time.ms","5000");
        consumer = kafka.consumer.Consumer.createJavaConsumerConnector(new ConsumerConfig(props));
        Map<String,Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic,topicCount);
        List<KafkaStream<byte[],byte[]>> consumerList = consumer.createMessageStreams(topicCountMap).get(topic);
        System.out.println("comsumerlist:"+consumerList.size());
        for (final  KafkaStream<byte[],byte[]> stream: consumerList) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    ConsumerIterator<byte[],byte[]> consumerIterator = stream.iterator();
                    while (consumerIterator.hasNext()){
                        System.out.println("data:"+new String(consumerIterator.next().message()));
                    }
                }
            });
        }
    }

    public static void main(String[] args) {
        DataCenterService dataCenterService = new DataCenterService();
        dataCenterService.start();
    }
}
