/**
 *    Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов типа Е.
 *    Предоставьте методы доступа для получения первого и второго элементов.
 */

package _3_generics._hw._hw_1_generics;

public class Pair<E>  {
    private E firstElem;
    private E secondElem;

    public Pair(E firstElem, E secondElem) {
        this.firstElem = firstElem;
        this.secondElem = secondElem;
    }


    public E getFirstElem() {
        return firstElem;
    }

    public void setFirstElem(E firstElem) {
        this.firstElem = firstElem;
    }

    public E getSecondElem() {
        return secondElem;
    }

    public void setSecondElem(E secondElem) {
        this.secondElem = secondElem;
    }

}
