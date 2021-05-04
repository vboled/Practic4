
import java.util.*;

enum OUTPUT {COMMON, REVERSED};

public class WordsAnalizotar {

    ArrayList<String> strings;

    WordsAnalizotar(List<String> strings) {
        this.strings = new ArrayList<String>(strings);
    }

    public String inFirstAndSecond(OUTPUT format) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.get(0).length(); i++) {
            if (strings.get(1).indexOf(strings.get(0).charAt(i)) != -1)
                res.append(strings.get(0).charAt(i));
        }
        return formattedString(res, format);
    }

    public String inFirstNotInSecond(OUTPUT format) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.get(0).length(); i++) {
            if (strings.get(1).indexOf(strings.get(0).charAt(i)) == -1)
                res.append(strings.get(0).charAt(i));
        }
        return formattedString(res, format);
    }

    private String formattedString(StringBuilder res, OUTPUT format) {
        if (format == OUTPUT.COMMON)
            return res.toString();
        return res.reverse().toString();
    }

    public String inAnyString(OUTPUT format) {
        StringBuilder res = new StringBuilder();
        LinkedHashSet<String> symbs = new LinkedHashSet<String>();
        for (String str : strings) {
            symbs.addAll(Arrays.asList(str.split("")));
        }
        for (String str : symbs)
            res.append(str);
        return formattedString(res, format);
    }
}
