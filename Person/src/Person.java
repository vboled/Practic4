import java.time.LocalDate;
import java.time.Month;

public class Person {

    private LocalDate birthday;

    Person(int day, int month, int year) {
        birthday = LocalDate.of(year, month, day);
    }

    enum Format {SHORT, NORMAL, LONG};

    public String getFormattedString(Format format) {
        if (format == Format.SHORT)
            return birthday.getDayOfMonth() + "." +
                    birthday.getMonthValue() + "." +
                    birthday.getYear() % 100;
        if (format == Format.NORMAL)
            return birthday.getDayOfMonth() + "." +
                    birthday.getMonthValue() + "." +
                    birthday.getYear();
        if (format == Format.LONG)
            return birthday.getDayOfMonth() + " " +
                   birthday.getMonth() + " of " +
                    birthday.getYear() + " year";
        return null;
    }

    @Override
    public String toString() {
        return "year: " + birthday.getYear() +
                " month: " + birthday.getMonth() +
                " day: " + birthday.getDayOfMonth();
    }
}
