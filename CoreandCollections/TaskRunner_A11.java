package CoreandCollections;

import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    String description;

    Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Desc: " + description;
    }
}

public class TaskRunner_A11 {
    public static void main(String[] args) {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();


        for (int i = 1; i <= 6; i++) {
            stage1.add(new Task(i, "Task number " + i));
        }

  
        while (!stage1.isEmpty()) {
            Task task = stage1.poll();
            System.out.println("Stage 1 processed: " + task);

            if (task.id % 2 == 0) {
                stage2.add(task);
            }
        }

     
        System.out.println("\n--- Stage 2 Tasks ---");
        while (!stage2.isEmpty()) {
            Task task = stage2.poll();
            System.out.println("Stage 2 executed: " + task);
        }
    }
}
