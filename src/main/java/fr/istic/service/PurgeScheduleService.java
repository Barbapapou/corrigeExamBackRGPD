package fr.istic.service;

import io.quarkus.scheduler.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PurgeScheduleService
{
    private final Logger log = LoggerFactory.getLogger(PurgeScheduleService.class);
    @Scheduled(every="10s")
    void test() {
        // do not fire ?
        log.error("purge");
    }
}
