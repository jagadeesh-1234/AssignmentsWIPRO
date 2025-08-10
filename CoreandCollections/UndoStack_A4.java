package CoreandCollections;
import java.util.*;
public class UndoStack_A4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> commandStack = new Stack<>();
		
		for (int i=1;i<=3;i++) {
			System.out.println("Enter Command"+ i + " : ");
			String command = sc.nextLine();
			commandStack.push(command);
			
	}
			String pop = commandStack.pop();
			System.out.println("Undo :" + pop);
			commandStack.push(pop);
			System.out.println("Redo :" + pop);
			System.out.println("Final Stack:");
			
			for(String command: commandStack) {
				System.out.println(command);
			}
	
		}
	}
