import java.util.Scanner;

public class KattisTheLastProblem {
	public static void main(String[] args) {
		 var scanner = new Scanner(System.in);
		 while (scanner.hasNext()) {
		 	String s = scanner.nextLine();
		 	System.out.println("Thank you, %s, and farewell!".formatted(s));	
		 }
		 
	}
}