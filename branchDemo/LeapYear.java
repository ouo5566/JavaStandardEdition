import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Year ?");
		int year = scan.nextInt();

		String answer = "CommonYear";
		if(year%400==0){
			answer = "LeapYear";
		}else if(year%100==0){
			answer = "CommonYear";
		}else if(year%4==0){
			answer = "LeapYear";
		}	
		System.out.print(answer);
	}
}