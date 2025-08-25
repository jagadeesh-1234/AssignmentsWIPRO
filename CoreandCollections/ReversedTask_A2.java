package CoreandCollections;

import java.util.*;

public class ReversedTask_A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter 4 tasks:");
        for (int i = 0; i < 4; i++) {
            String task = sc.nextLine();
            if (task.endsWith("1")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        System.out.println("Reversed Task List:");
        for (int i = tasks.size() - 1; i >= 0; i--) {
            System.out.println(tasks.get(i));
        }
    }
}
