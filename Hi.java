import java.util.Scanner;

public class Hi{
	public static void main(String[] args){
		System.out.print("Hi");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("Bye, "+ name);
	}
}