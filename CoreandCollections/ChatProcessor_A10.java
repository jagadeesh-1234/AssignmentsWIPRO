package CoreandCollections;

import java.util.concurrent.LinkedBlockingQueue;

public class ChatProcessor_A10
{
    public static void main(String[] args) {
        LinkedBlockingQueue<String> chatQueue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() -> {
            int count = 1;
            while (true) {
                try {
                    if (chatQueue.size() < 5) {
                        String msg = "Message " + count++;
                        chatQueue.put(msg);
                        System.out.println("Produced: " + msg);
                    } else {
                        System.out.println("Queue limit reached. Producer is waiting...");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String msg = chatQueue.take();
                    System.out.println("Consumed: " + msg);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
