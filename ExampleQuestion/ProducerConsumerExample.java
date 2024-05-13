package ExampleQuestion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

    public static void main (String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        Thread thread = new Thread(new Producer(queue));
        thread.start();
        for (int i = 0; i <= 5; i++) {
            new Thread(new Consumer(queue), "Consumer " + i).start();
        }
    }

    static class Producer implements Runnable {
        BlockingQueue<String> q;
        final String[] messages = {"Hi!!" , "How are you!!"};

        public Producer(BlockingQueue<String> q) {
            this.q = q;
        }

        @Override
        public void run() {
            int i = 0;
            try {
                while (true) {
                    Thread.sleep(500);

                    q.put(messages[i]);

                    System.out.println("Message published:: " + messages[i]);
                    i = (i + 1) % messages.length;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        BlockingQueue<String> q;
        final String[] messages = {"Hi!!" , "How are you!!"};

        public Consumer(BlockingQueue<String> q) {
            this.q = q;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);

                    String msg = q.take();

                    String name = Thread.currentThread().getName();
                    System.out.println(name + " has consumed msg:: " + msg);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
