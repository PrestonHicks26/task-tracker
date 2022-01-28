import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.Clip;

public class Countdown {
    int hours;
    int minutes;
    int seconds;

    public Countdown(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    public String getTime(){
        String time = Integer.toString(hours)+":"+Integer.toString(minutes)+":"+Integer.toString(seconds);
        return time;
    }
    public void start() throws InterruptedException {
        boolean run = true;
        while(run){
            Thread.sleep(1000);
            if(seconds == 0 && minutes == 0 && hours == 0)
                break;
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
            System.out.println(hours+":"+minutes+":"+seconds);
        }
    }
}

