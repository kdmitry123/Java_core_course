package _4_collections._hw._hw_1;

import _3_generics._hw._hw_1_generics.*;
import java.util.Iterator;
import java.util.List;

public class PairMaxIterable implements Iterable<Integer> {

    private Iterator iterator;

    public PairMaxIterable(List list) {
        iterator = new Iterator<Integer>() {
            Iterator listIterator = list.iterator();

            @Override
            public boolean hasNext() {
                return listIterator.hasNext();
            }

            @Override
            public Integer next() {
                MinMaxPair pairMinMax = new MinMaxPair((Pair<Integer>) listIterator.next());
                return (Integer) pairMinMax.getMax();
            }
        };
    }

    public static<E extends Comparable<E>> Iterable<E> pairMaxInterval(int start, int end, List<Pair<E>> pairList) {
        return new PairMaxInterval<E>(start, end, pairList);
    }

    @Override
    public Iterator iterator() {
        return iterator;
    }
}