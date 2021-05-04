public class TestMyDate {
    public static void main(String[] argv) {
        MyDate date = new MyDate("10.12.1230", "23:00");
        System.out.println(date.getDate());
        MyDate cal = new MyDate("10.12.1230", "23:00");
        System.out.println(date.getCalendar());
    }
}
