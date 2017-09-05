package com.xuyh.netserver.test.ThreadPool;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

/**
 * Created by Thinkpad on 17/07/29.
 **/
class ConsumerThread implements Runnable {

    private KafkaStream kafkaStream;
    private boolean running;

    ConsumerThread(KafkaStream stream, Boolean status) {
        this.kafkaStream = stream;
        this.running = status;
    }

    @Override
    public void run() {

        while (running && kafkaStream.iterator().hasNext()){
            String datas = (String) kafkaStream.iterator().next().message();
            System.out.println("datas:"+datas);
        }
    }


}
