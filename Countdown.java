import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.Clip;

public class Countdown {
    int hours;
    int minutes;
    int seconds;

    public Countdown(int hours, int minutes, int seconds){
        hours = hours;
        minutes = minutes;
        seconds = seconds;
    }
    public void start() throws InterruptedException {
        boolean run = true;
        while(run){
            Thread.sleep(1000);
            if(seconds == 0){
                seconds = 59;
                if(minutes == 0){
                    minutes = 59;
                    if(hours == 0){
                        run = false;
                    }else{
                        hours--;
                    }
                }else{
                    minutes--;
                }
            }else{
                seconds--;
            }
        }
        //play beeping noise
    }
}

