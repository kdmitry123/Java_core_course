package _8_java8._hw;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestJavaUtils {

    private static List<String> words = Arrays.asList("Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation.",
            "DearneValleyOldMoorisan 89-hectare (220-acre) wetlands nature reserve in the .... Help desk – Ask questions about using Wikipedia. Local embassy");

    private static Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

    public static void main(String[] args) {

        Optional<String> optional = JavaUtils.getMaxString(words);
        optional.ifPresent(System.out::println);
        System.out.println(JavaUtils.getWordsAmount(names));
    }
}
