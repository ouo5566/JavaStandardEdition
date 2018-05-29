import java.util.Scanner;
public class RPSGame02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("A:(Rock_1,Scissors_2,Paper_3)? Number");
		int a = scan.nextInt();
		System.out.println("B:Rock_1,Scissors_2,Paper_3? Number");
		int b = scan.nextInt();

		String result = "A ½Â¸®";
		if(a-b==0){
			result = "ºñ±è";
		}else if((a*2)/b!=1){
			result = "B ½Â¸®";
		}
		System.out.println(result);
	}
}