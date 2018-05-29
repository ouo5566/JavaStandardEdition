import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Month ?");
		int month = scan.nextInt();

		int day = 31;
		String end = "";
		switch(month){
			case 2 : day = 28; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : day = 30; break;
			default : end = "ERROR";
			}

		if(month>0 && month<12){
			end = "Endday : " + month + ". " + day +"."; 
		}
		System.out.println(end);
	}
}