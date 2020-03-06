/**
 *    *** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
 *        состоящим из элементов типа Entry<K, V>. Предоставьте методы для получения значения,
 *        связанного с ключом, установки значения по заданному ключу и удаления ключа.
 */

package _3_generics._hw._hw_1_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Table<K, V> {

    private final List<Entry<K, V>> entryList;

    public Table() {
        entryList = new ArrayList<>();
    }

    public Table(List<Entry<K, V>> entries) {
        this.entryList = entries;
    }

    @SuppressWarnings("unchecked")
    public List<V> getValue(K key) {
        List<V> values = new ArrayList<>();
        for (Entry<K,V> entry : entryList) {
            if (entry.getKey().equals(key)) {
                values.add((V) entry.getValue());
            }
        }
        return values;
    }

    @SuppressWarnings("unchecked")
    public boolean addValue(K key, V value) {
        for (Entry<K,V> entry : entryList) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return true;
            }
        }
        return false;
    }

    public boolean remove(K key) {
        ListIterator<Entry<K, V>> entryIterator = entryList.listIterator();
        while (entryIterator.hasNext()) {
            if (entryIterator.next().getKey().equals(key)) {
                entryList.remove(entryIterator.next());
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public void add(Entry entry) {
        entryList.add(entry);
    }

    public List<Entry<K, V>> getEntryList() {
        return entryList;
    }

}
