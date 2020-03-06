package _4_collections._hw._hw_1;

import _3_generics._hw._hw_1_generics.Pair;
import java.util.List;
import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        List<Pair<Integer>> pairList = asList(new Pair(1, 2), new Pair(3, 2), new Pair(1, 5));

        for (Integer max : new PairMaxIterable(pairList)) {
            System.out.print(max + " ");
        }

        System.out.println();

        for (Object max : PairMaxIterable.pairMaxInterval(1, 2, pairList)) {
            System.out.print(max + " ");
        }

        System.out.println();

        for (Object max : PairMaxIterable.pairMaxInterval(1, 4, asList(new Pair("fadfadsfa", "werxsfcs"),
                new Pair("sdfgsdfgsdfg", "werwerwer"), new Pair("sdfgsfsdf", "afadfadsfa"), new Pair("sdfs", "werwdhj"),
                new Pair("ghjyt", "sr345dfgdf"), new Pair("dhg565", "ghdfer5643")))) {
            System.out.print(max + " ");
        }
    }
}
