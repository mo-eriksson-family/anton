package se.liu.ida.anter491.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ame on 2015-01-27.
 */
public class Calendar {



    private List<Appointment> appointments;

    public Calendar() {

        appointments = new ArrayList<>();
    }
    public void show() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
    public void book(int year, String month, int day, String start, String end, String subject) {

        TimePoint myStart = new TimePoint(start);
        TimePoint myEnd = new TimePoint(end);

        int startMin = myStart.getMinute();
        int startHour = myStart.getHour();

        int endHour = myEnd.getHour();
        int endMin = myEnd.getMinute();


        if (year < 2013) {
            throw new IllegalArgumentException("Invalid year input");
        }
        else if ((day > Month.getMonthDays(month)) || (day < 1)) {
            // Also takes care of if not month exists
            throw new IllegalArgumentException("Invalid day input");
        }
        else if ((0 > startHour) || (startHour >= 23)) {
            //System.out.println(startHour + " and " + startHour);
            throw new IllegalArgumentException("None accepted start time as input, (Hour)");
        }
        else if ((0 > endHour) || (endHour >= 23)) {
            throw new IllegalArgumentException("None accepted end time as input, (Hour)");
        }
        else if ((0 > endMin) || (endMin >= 59)) {
            throw new IllegalArgumentException("None accepted end time as input, (Min)");
        }
        else if (0 > startMin || startMin >= 59) {
            //System.out.println(startMin + " and " + startMin);
            throw new IllegalArgumentException("None accepted start time as input, (Min)");
        }






        Month myMonth = new Month(month, Month.getMonthNumber(month), Month.getMonthDays(month));
        //System.out.println(Month.getMonthDays(month));

        Date myDate = new Date(year, myMonth, day);
        //System.out.println(myDate.toString());



        TimeSpan myTimeSpan = new TimeSpan(myStart, myEnd);
        //System.out.println(myTimeSpan.toString());

        Appointment myAppointment = new Appointment(subject, myDate, myTimeSpan);
        //System.out.println(myAppointment);

        appointments.add(myAppointment);

    }

    public static void main(String[] args) {
        Calendar myCalendar = new Calendar();

        myCalendar.book(2014, "march", 11, "00:10", "12:10", "Supa");

        myCalendar.book(2014, "may", 9, "11:00", "12:20", "KNULLA");

        myCalendar.book(2014, "may", 8, "12:10", "12:30", "SKita");

        myCalendar.book(2014, "april", 8, "13:20", "12:40", "HOLA");

        myCalendar.book(2014, "march", 8, "14:10", "12:50", "Senorita");

        myCalendar.show();

    }
}

