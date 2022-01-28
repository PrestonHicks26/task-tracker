import java.io.*;
public class Main {
//include test for time drift across multiple hours
    public static void main(String[] args) throws InterruptedException {
        Countdown ctd = new Countdown(0,0,5);
        ctd.start();
    }
}
