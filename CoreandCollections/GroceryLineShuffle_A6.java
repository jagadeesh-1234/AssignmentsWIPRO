package CoreandCollections;

import java.util.*;

public class GroceryLineShuffle_A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.println("Enter 5 customer names:");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            if (name.length() % 2 == 0) {
                queue.addFirst(name);
            } else {
                queue.addLast(name);
            }
        }

        System.out.println("Final queue order:");
        for (String name : queue) {
            System.out.println(name);
        }
    }
}

