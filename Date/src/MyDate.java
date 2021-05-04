import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyDate {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    static public void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input date in format: day.month.year");
        String date = scan.nextLine();
        System.out.println("Input time in format: hours:minutes");
        String time = scan.nextLine();
        MyDate myDate = new MyDate(date, time);
        System.out.println(myDate.getDate());
        System.out.println(myDate.getCalendar().toString());
    }

    MyDate (String date, String time) throws IllegalArgumentException {
        String[] split1 = date.split("\\.");
        String[] split2 = time.split(":");
        System.out.println(split1.length);
        if (split1.length != 3)
            throw new IllegalArgumentException("Too few elements");
        try {
            year = Integer.parseInt(split1[0]);
            month = Integer.parseInt(split1[1]);
            day = Integer.parseInt(split1[2]);
            hour = Integer.parseInt(split2[0]);
            minute = Integer.parseInt(split2[1]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Wrong date format");
        }
    }

    public Calendar getCalendar() {
        return new GregorianCalendar(year, month, day, hour, minute, 0);
    }

    public Date getDate() {
        return getCalendar().getTime();
    }
}
