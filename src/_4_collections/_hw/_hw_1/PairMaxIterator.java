package _4_collections._hw._hw_1;

import _3_generics._hw._hw_1_generics.*;
import java.util.Iterator;
import java.util.List;

public class PairMaxIterator<E extends Comparable<E>> implements Iterator<E> {
    private final int start;
    private final int end;
    private int current;
    private List<Pair<E>> pairList;

    public PairMaxIterator(int start, int end, List<Pair<E>> pairList) {
        this.start = start;
        this.end = end;
        this.pairList = pairList;
        this.current = this.start;
    }

    public PairMaxIterator(List<Pair<E>> pairList) {
        this(0, pairList.size() - 1, pairList);
    }

    @Override
    public boolean hasNext() {
        return this.current <= this.end;
    }

    @Override
    public E next() {
        MinMaxPair<E> pairMinMax = new MinMaxPair<>(this.pairList.get(this.current++));
        return (E) pairMinMax.getMax();
    }
}
