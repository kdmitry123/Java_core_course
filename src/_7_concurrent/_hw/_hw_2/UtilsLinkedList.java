package _7_concurrent._hw._hw_2;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * Метод produce бесконечно добавляет в этот список случайные числа, однако максимальное количество,
 * которое он может добавить равно 10.
 * Метод consume бесконечно считывает числа с какой-то случайной задержкой (от 0 до 10 мс).\
 * Сделать так, чтобы метод produce добавлял числа только тогда, когда не превышен лимит, а метод consume
 * забирал их только тогда, когда в списке что-нибудь есть.
 * <p>
 * Методы должны корректно работать в многопоточной среде. Используйте отдельную блокировку чтения-записи.
 * Использовать метод removeFirst у LinkedList для получения элемента. Создать и запустить два
 * различных потока, один из которых вызывает produce, а другой - consume. Продемонстрировать корректность
 * работы хранилища с помощью вывода сообщений в консоль о добавлении, получении и текущем размере хранилища
 * на этапах добавления и получения.
 */
public class UtilsLinkedList {
    private List<Integer> list;
    private final int MAX_LENGTH = 10;
    private final Lock lock = new ReentrantLock(true);
    private final Condition empty = lock.newCondition();
    private final Condition full = lock.newCondition();
    private int randNumber = new Random().nextInt();

    public UtilsLinkedList(List<Integer> list) {
        this.list = list;
    }

    public void produce() {
        lock.lock();
        try {
            while (list.size() >= MAX_LENGTH) {
                System.err.println("Список переполнен " + list.size());
                full.await();
            }
            System.err.println("Добавляем случайное число " + randNumber);
            list.add(randNumber);
            empty.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public Integer consume() {
        lock.lock();
        try {
            while (list.isEmpty()) {
                System.err.println("Список пуст");
                empty.await();
            }
            Integer number = list.remove(0);
            System.err.println("Извлеченное число " + number);
            full.signal();
            return number;
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            lock.unlock();
        }
    }
}
