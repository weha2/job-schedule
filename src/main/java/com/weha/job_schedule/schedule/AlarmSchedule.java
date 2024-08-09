package com.weha.job_schedule.schedule;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AlarmSchedule {

    /**
     * cron = * * * * * *
     * 1 -> Second
     * 2 -> Minute
     * 3 -> Hour
     * 4 -> Day
     * 5 - > Month
     * 6 -> Year
     */

    @Scheduled(cron = "0 * * * * *")
    public void EveryMinute() {
        log.info("Hello, From Every Minute");
    }

    @Scheduled(cron = "* 50 10 * * *", zone = "Asia/Bangkok")
    public void EveryDayNineAM() {
        log.info("Hello, From Every Day 10.50 AM");
    }

}
