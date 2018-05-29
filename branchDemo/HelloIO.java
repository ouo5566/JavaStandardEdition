import java.util.Scanner;

public class HelloIO{
	public static void main(String[] args){
		System.out.print("ÀÌ¸§ ?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next("¿ÀÀ×");
		System.out.print("¾È³ç " + name);
	}
}