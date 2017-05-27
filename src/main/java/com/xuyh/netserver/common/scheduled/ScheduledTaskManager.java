package com.xuyh.netserver.common.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Thinkpad on 17/05/27.
 **/

@Component("scheduledTaskManager")
public class ScheduledTaskManager {
    @Scheduled(cron = "2 * * * * *")
    public void autoCardCalculate() {
        System.out.println("定时卡点计算... " + new Date());
    }
}
