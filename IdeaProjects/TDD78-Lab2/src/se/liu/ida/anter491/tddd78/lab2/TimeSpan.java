package se.liu.ida.anter491.tddd78.lab2;

/**
 * Created by ame on 2015-01-27.
 */
public class TimeSpan {
    private TimePoint start;
    private TimePoint end;

    public TimeSpan(TimePoint start, TimePoint end) {
        this.start = start;
        this.end = end;
    }

    public TimePoint getStart() {
        return start;
    }

    public TimePoint getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return start + "-" + end;
    }

    public static void main(String[] args) {
        TimePoint testStart = new TimePoint("13:45");
        TimePoint testEnd = new TimePoint("14:20");
        TimeSpan testSpan = new TimeSpan(testStart, testEnd);
        System.out.println(testSpan.toString());

    }
}
