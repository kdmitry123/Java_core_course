package _3_generics._hw._hw_1_generics;

public class TestPair {
    public static void main(String[] args) {
        Pair pair = new Pair<>("qwe", "ewq");
        Pair pair2 = new Pair<>(3, 4);
        System.out.println(pair.getFirstElem());
        System.out.println(pair.getSecondElem());
        pair.setFirstElem(1);
        pair.setSecondElem(2);
        System.out.println(pair.getFirstElem());

        System.out.println(new MinMaxPair<Integer>(1, 2).getMax());
        System.out.println(new MinMaxPair<Integer>(1, 2).getMin());
        System.out.println(new MinMaxPair<>(pair2).getMin());
        System.out.println(new MinMaxPair<>(pair2).getMax());
        System.out.println(new MinMaxPair<String>("abc", "bcd").getMax());
        System.out.println(new MinMaxPair<String>("abc", "bcd").getMin());

    }
}
