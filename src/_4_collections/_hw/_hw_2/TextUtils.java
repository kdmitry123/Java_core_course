/**
 *         Задан текст на английском языке. Выделить все различные слова. Для каждого слова подсчитать частоту
 *         его встречаемости. Слова, отличающиеся регистром букв, считать различными. Воспользуйтесь для этой
 *         цели классом TreeMap<String, Integer>.
 */

package _4_collections._hw._hw_2;

import java.util.*;

public class TextUtils {
    private Map<String, Integer> words;

    public TextUtils(String str) {
        countWord(str);
    }

    public void countWord(String str) {
        List<String> listWords = new ArrayList<>();
        this.words = new TreeMap<>();
        if (str.length() != 0) {
            listWords.addAll(Arrays.asList(str.split("[^a-zA-Z]+")));
        }
        for (String word : listWords) {
            this.words.put(word, this.words.containsKey(word) ?
                    this.words.get(word) + 1 : 1);
        }
    }

    public Map<String, Integer> getWord() {
        return words;
    }
}
