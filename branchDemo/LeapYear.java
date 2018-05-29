import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Year ?");
		int year = scan.nextInt();

		String answer = "LeapYear";
		if((year%4!=0) || 
		  (year%400!=0 && year%100==0)){
			answer = "CommonYear";
		}
		System.out.print(answer);
	}
}