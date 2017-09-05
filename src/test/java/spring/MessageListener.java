package spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import spring.MessageEvent;

/**
 * Created by Thinkpad on 17/07/11.
 **/
public class MessageListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof MessageEvent){
            MessageEvent messageEvent = (MessageEvent) event;
            System.out.println("信息内容是:" + messageEvent.getMessageContent());
        }else{
            System.out.println("其他的信息！" + event.toString());
        }

    }
}
