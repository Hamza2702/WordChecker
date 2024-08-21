import java.util.ArrayList;

public class WordChecker
{
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList;

    public WordChecker(){
        wordList = new ArrayList<>();
    }
    /**
     * Returns true if each element of wordList (except the first) contains the previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {/* to be implemented in part (a) */
        for (int i = 0; i < wordList.size(); i++){
            String currentWord = wordList.get(i);
            if (i > 0){
                String previousWord = wordList.get(i - 1);
                if (!currentWord.contains(previousWord)){
                    System.out.println("Isn't word chain");
                    return false;
                }
            }
        }
        System.out.println("Is word chain");
        return true;
    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public ArrayList<String> getWordList(){
        return wordList;
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in wordList.
     */
    public ArrayList<String> createList(String target) { /* to be implemented in part (b) */
        ArrayList<String> list = new ArrayList<>();
        for (String word : wordList) {
            if (word.equals(target)) {
                list.add(word.replaceFirst(target, ""));
            }
        }
        return list;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
