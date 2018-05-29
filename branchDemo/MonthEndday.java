import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Month ?");
		int month = scan.nextInt();

		int day = 31;
		String end = "말일 : " + month + "월 " + day +"일";
		switch(month){
			case 2 : day = 28; break;
			case 4 : day = 30; break;
			case 6 : day = 30; break;
			case 9 : day = 30; break;
			case 11 : day = 30; break;
			default : end = "ERROR";
		}

		System.out.println(end);
	}
}