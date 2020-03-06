package _7_concurrent._hw._hw_2;

import java.util.LinkedList;

public class TetsClass {
    public static void main(String[] args) throws InterruptedException {

        UtilsLinkedList utilsLinkedList = new UtilsLinkedList(new LinkedList<>());

        Thread consumeThread = new Thread(() -> {
            while (true) {
                utilsLinkedList.consume();
                try {
                    Thread.sleep(Math.round(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        consumeThread.setDaemon(true);
        consumeThread.start();

        Thread produceThred = new Thread(() -> {
            while (true) {
                utilsLinkedList.produce();
            }
        });
        produceThred.setDaemon(true);
        produceThred.start();

        Thread.sleep(10_000);
    }
}

