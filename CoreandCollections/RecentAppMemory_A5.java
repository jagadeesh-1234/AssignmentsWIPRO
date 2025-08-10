package CoreandCollections;
import java.util.*;

public class RecentAppMemory_A5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> apps = new LinkedList<>();

        System.out.println("Enter 5 app names:");
        for (int i = 0; i < 5; i++) {
            String app = sc.nextLine();
            if (apps.contains(app)) {
                apps.remove(app);
            }
            apps.addFirst(app);
        }

        System.out.println("Final app memory list:");
        for (String app : apps) {
            System.out.println(app);
        }
    }
}
