package se.liu.ida.anter491.tddd78.lab2;

import java.util.Arrays;

/**
 * Created by ame on 2015-01-26.
 */
public class TimePoint {

    private String time;
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public TimePoint(String time) {
        this.time = time;
        String[] parts = time.split(":");
        hour = Integer.parseInt(parts[0]);
        minute = Integer.parseInt(parts[1]);
        //System.out.println(hour+ "-" +minute);



    }


    public static void main(String[] args) {
        TimePoint testTime = new TimePoint("10:10");
        //Integer.parseInt(parts);
        System.out.println(testTime.toString());

    }

    @Override
    public String toString() {
        return time;
    }
}
