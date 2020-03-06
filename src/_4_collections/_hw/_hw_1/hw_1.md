1. Написать Iterable<Pair<Integer>> принимающий List<Pair<Integer>> который возвращает итератор max чисел из Pair из предыдущего задания (т.е. Iterator<Integer>) от этих Pair<Integer>. Наподобие такого.
for(Integer max : new PairMaxIterable(asList(Pair(1,2), Pair(3,2), Pair(1,5)))){
            System.out.print(max + " ");
}
должен вывести 2 3 5

2.  ***Сделать для PairMaxIterable утилитный параметризованный метод maxPairs с аргуметом List<Pair<E>> или varargs E... Наподобие interval, только параметризованный.