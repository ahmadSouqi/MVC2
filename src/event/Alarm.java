package event;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by asouqi on 3/25/18.
 */
@WebListener
public class Alarm implements ServletContextListener {

    private ScheduledExecutorService schedul;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        schedul= Executors.newSingleThreadScheduledExecutor();
        /*schedul.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {


                Duration examDuration=Duration.ofMinutes(1);

                LocalDate date=LocalDate.now();
                LocalDate start_date=LocalDate.of(2018,3,25);
                ///LocalDate end_date=LocalDate.of(2018,3,26);

                LocalTime time=LocalTime.now();
                LocalTime startTime=LocalTime.of(5,37);
                LocalTime endTime=LocalTime.of(5,38);


                LocalDateTime dateTime=LocalDateTime.now();
                LocalDateTime startDate=LocalDateTime.of(2018,3,26,9,44);
                LocalDateTime endDate=LocalDateTime.of(2018,3,26,9,45);


                if (dateTime.isBefore(startDate))
                    System.out.println("Left To Exam: "+ChronoUnit.DAYS.between(dateTime,startDate)+","+
                            ChronoUnit.HOURS.between(dateTime,startDate)+","+
                            ChronoUnit.MINUTES.between(dateTime,startDate));

                if (dateTime.isAfter(startDate) && dateTime.isBefore(endDate))
                        System.out.println("Start Exam...");
                if (dateTime.isAfter(endDate))
                        System.out.println("End Exam...");

            }
        },0,30, TimeUnit.SECONDS);*/

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
