/**
 *     Создайте атрибуты нити. Установите приоритет нити. Запустите нить с указанными атрибутами,
 *     распечатайте приоритет и атрибуты нити. Убедитесь, что параметры соответствуют установленным.
 */

package _7_concurrent._hw._hw_1;

public class ThreadWithAtributs {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myrunnable = new MyRunnable();
        Thread thread = new Thread(myrunnable);
        thread.start();
        Thread.sleep(100);
        thread.setName("MyThread");
        thread.setPriority(3);
    }
}
