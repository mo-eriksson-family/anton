package se.liu.ida.anter491.tddd78.lab2;

/**
 * Created by ame on 2015-01-27.
 */
public class Appointment {
    private String subject;
    private Date date;
    private TimeSpan timeSpan;

    public Appointment(String subject, Date date, TimeSpan timeSpan) {
        this.subject = subject;
        this.date = date;
        this.timeSpan = timeSpan;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    @Override
    public String toString() {

        return "Appointment: " + date + ", Subject: " + subject + ", Timespan: " + timeSpan;
    }



    public static void main(String[] args) {

        System.out.println();

    }
}
