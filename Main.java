import java.io.Console;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        WordChecker checker = new WordChecker();
        checker.addWord("an");
        checker.addWord("band");
        checker.addWord("band");
        checker.addWord("abandon");
        checker.addWord("abandoned");
        checker.isWordChain();
    }
}
