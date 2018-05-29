import java.util.Scanner;

public class Input{
	public static void main(String[] args){
		System.out.print("Name ?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.print("Hello, " + name);
	}
}