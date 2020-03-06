/**
 *       1. Задан файл со стихотворением Александра Пушкина. Определить частоту повторяемости
 *       всех букв в стихотворении, игнорируя регистр. Вывести результат в файл в виде:
 *       а - 15
 *       б - 7
 *       и т.д.
 */

package _6_io._hw;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterCounter {
    private Map<Character, Integer> letters;
    private final int bfSize = 1024;
    private final String regx = "[а-я]";

    public CharacterCounter() {
        cleanLetters();
    }

    public void count(File inFile,  File outFile) throws IOException {
        cleanLetters();
        try (BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)), bfSize);
             Writer textWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)), bfSize)) {
            String text;
            while ((text = textReader.readLine()) != null) {
                addLetters(text.toLowerCase());
            }

            this.letters.forEach((k, v) -> {
                try {
                    textWriter.write(k + " - " + v + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            textWriter.flush();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    public void addLetters(String text) {
        Matcher rusLetters = Pattern.compile(this.regx).matcher(text);

        while (rusLetters.find()) {
            addMapLetter(rusLetters.group().charAt(0));
        }
    }

    private void addMapLetter(Character letter) {
        this.letters.put(letter, this.letters.getOrDefault(letter, 0) + 1);
    }

    private void cleanLetters() {
        this.letters = new TreeMap<>();
    }

}

