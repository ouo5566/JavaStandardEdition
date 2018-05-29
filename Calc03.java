import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");
		String opcode = scan.next();
		System.out.println("Enter Number 2");
		int num2 = scan.nextInt();

		int num3 = 0;
		String result = "";
		switch(opcode){
			case "+" : num3 = num1 + num2; break;
			case "-" : num3 = num1 - num2; break;
			case "*" : num3 = num1 * num2; break;
			case "/" : num3 = num1 / num2; break;
			case "%" : num3 = num1 % num2; break;
			default : result = "OPCODE ERROR"; break;
		}
		if(!result.equals("OPCODE ERROR")){
			result = num1 + opcode + num2 + "=" + num3;
		}
		System.out.println(result);
	}
}
