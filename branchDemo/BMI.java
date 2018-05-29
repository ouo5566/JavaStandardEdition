import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Height ?");
		double h = scan.nextDouble() * 0.01;
		System.out.println("Weight ?");
		int w = scan.nextInt();

		double bmi = w/(h*h);
		String level = "정상";

		if(bmi>=35.0){
			level = "3단계 비만";
		}else if(bmi>=30.0){
			level = "2단계 비만";
		}else if(bmi>=25.0){
			level = "1단계 비만";
		}else if(bmi>=23.0){
			level = "비만 전단계";
		}else if(bmi<18.5){
			level = "저체중";
		}
		System.out.println(level);
	}
}