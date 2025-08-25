package CoreandCollections;

import java.util.*;

public class ChatHistory_A8 {
    public static void main(String[] args) {
        ArrayDeque<String> chatBox = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter message (type 'exit' to quit): ");
            String msg = sc.nextLine();

            if (msg.equalsIgnoreCase("exit")) break;

            if (chatBox.size() == 4) {
                chatBox.removeFirst(); 
            }

            chatBox.addLast(msg); 

            System.out.println("Current Chat History:");
            for (String m : chatBox) {
                System.out.println(m);
            }
        }
    }
}
