import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        ArrayList<String> strings = new ArrayList<String>();
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of string: ");
        size = Integer.parseInt(scanner.nextLine());
        if (size < 2)
            throw new IllegalArgumentException("Too few strings");
        strings.ensureCapacity(size);
        System.out.println("Input " + size + " strings:");
        for (int i = 0; i < size; i++)
            strings.add(scanner.nextLine());
        WordsAnalizotar w = new WordsAnalizotar(strings);
        System.out.println(w.inFirstAndSecond(OUTPUT.COMMON));
        System.out.println(w.inFirstNotInSecond(OUTPUT.COMMON));
        System.out.println(w.inAnyString(OUTPUT.COMMON));
    }
}
