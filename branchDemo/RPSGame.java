import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("rock, scissors, paper !");
		System.out.println(" A : ? ");
		String a = scan.next();
		System.out.println(" B : ? ");
		String b = scan.next();

		String result = "";
		if(
			(a.equals("scissors") && b.equals("paper"))
			|| (a.equals("rock") && b.equals("scissors"))
			|| (a.equals("paper") && b.equals("rock"))
			){
			result = "A ½Â¸® !!";
		}else if(
			(a.equals("scissors") && b.equals("rock"))
			|| (a.equals("rock") && b.equals("paper"))
			|| (a.equals("paper") && b.equals("scissors"))
			){
			result = "B ½Â¸® !!";
		}else{
			result = "ºñ°å½À´Ï´Ù.";
		}
		System.out.println("[ A : " + a + ", B : " + b + " ] > " + result);
		}
}