import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("A:Rock_1,Scissors_2,Paper_3? Number");
		int a = scan.nextInt();
		System.out.println("B:Rock_1,Scissors_2,Paper_3? Number");
		int b = scan.nextInt();

		String result = "A WIN";
		if(a==b){
			result = "DRAW";
		}else if((a-b==-2)||(a-b==1)){
			result = "B WIN";
		}
		System.out.println(result);
	}
}