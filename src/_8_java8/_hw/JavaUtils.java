package _8_java8._hw;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *     1. Пусть дан список строк List<String>. Каждая строка содержит несколько слов разделенных пробелом.
 *        Найдите в нем слово, содержащее максимальное число строчных букв. Чтобы код правильно работал,
 *        когда входной список пуст, можете возвращать объект типа `Optional<String>`.
 *
 *     2. Пусть дан поток, элементы которого - слова. Посчитайте, сколько раз встречается каждое слово.
 *        При следующих исходных данных должен быть возвращен такой объект Мар:[John -> 3, Paul -> 2, George -> 1]:
 *
 *        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John")
 */
public class JavaUtils {

    public static Optional<String> getMaxString(List<String> words) {
        return words.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .max(Comparator.comparingInt(word -> word.replaceAll("[^a-z]", "").length()));
    }

    public static Map<String, Integer> getWordsAmount(Stream<String> words) {
        return words.collect(Collectors.toMap(word -> word, word -> 1, (a, b) -> a + b));
    }
}
