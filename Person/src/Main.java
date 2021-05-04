public class Main {
    public static void main(String[] argv) {
        Person per = new Person(10, 12,1960);
        System.out.println(per.getFormattedString(Person.Format.LONG));
        System.out.println(per.getFormattedString(Person.Format.NORMAL));
        System.out.println(per.getFormattedString(Person.Format.SHORT));
    }
}
