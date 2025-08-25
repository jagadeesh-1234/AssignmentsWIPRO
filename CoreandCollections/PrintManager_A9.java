package CoreandCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class PrintManager_A9 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);


        addJob(printQueue, "Job1");
        addJob(printQueue, "Job2");
        addJob(printQueue, "Job3");
        addJob(printQueue, "Job4"); 

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }
    }

    public static void addJob(ArrayBlockingQueue<String> queue, String jobName) {
        if (queue.offer(jobName)) {
            System.out.println("Added to queue: " + jobName);
        } else {
            System.out.println("Queue full! Skipped: " + jobName);
        }
    }
}
