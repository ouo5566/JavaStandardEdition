import java.util.Scanner;

public class InOut{
	public static void main(String[] args){
		System.out.print("What's your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("Hello, " + name);
	}
}