package com.cent.mpdemo.schedule;

import com.cent.mpdemo.mapper.CronMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.time.LocalDateTime;
import java.util.stream.Collectors;


@Configuration
@EnableScheduling
public class CompleteScheduleConfig implements SchedulingConfigurer {

    @Autowired
    @SuppressWarnings("all")
    CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(
                () -> System.out.println("开始执行定时任务=======================" + LocalDateTime.now().toLocalTime()),

                //2.设置执行周期(Trigger)
                triggerContext -> {
                    String cron = cronMapper.selectList(null).stream().limit(1).collect(Collectors.toList()).get(0).getCron();

                    //2.3 返回执行周期(Date)
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);

                });
    }
}
