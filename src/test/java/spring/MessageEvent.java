package spring;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Thinkpad on 17/07/11.
 **/
public class MessageEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String messageContent;

    public MessageEvent(Object source) {
        super(source);
    }

    public MessageEvent(Object source, String messageContent) {
        super(source);
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
