package CoreandCollections;
import java.util.*;

public class Last3_A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> searchBox = new ArrayDeque<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter search term: ");
            String term = sc.nextLine();

            if (searchBox.size() == 3) {
                searchBox.removeFirst();
            }

            searchBox.addLast(term);
        }

        System.out.println("Last 3 searches:");
        for (String term : searchBox) {
            System.out.println(term);
        }
    }
}
