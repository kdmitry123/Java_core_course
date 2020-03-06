/**
 *    *** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
 *        состоящим из элементов типа Entry<K, V>. Предоставьте методы для получения значения,
 *        связанного с ключом, установки значения по заданному ключу и удаления ключа.
 */

package _3_generics._hw._hw_1_generics;

public class Entry<K, V> {

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " {" +
                " key=" + key +
                ", value=" + value +
                "} ";
    }
}
