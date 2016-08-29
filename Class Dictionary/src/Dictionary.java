import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Dictionary {

    private HashMap<String, String> dictionary;

    Dictionary() {
        dictionary = new HashMap<>();
    }

    String translate(String word) {
        if (dictionary.get(word) != null) {
            return  dictionary.get(word);
        }
        else {
            return "null";
        }
    }

    void add(String word, String translation) {
        dictionary.put(word,translation);
    }

    int amountOfWords() {
        return dictionary.size();
    }

    ArrayList<String> translationList() {
        ArrayList<String> dictionaryContent = new ArrayList<>();

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            dictionaryContent.add(entry.getKey() + " = " + entry.getValue());
        }

        return dictionaryContent;
    }
}