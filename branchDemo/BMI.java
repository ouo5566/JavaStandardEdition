import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Height ?");
		double h = scan.nextDouble() * 0.01;
		System.out.println("Weight ?");
		int w = scan.nextInt();

		double bmi = w/(h*h);
		String level = "����";

		if(bmi>=35.0){
			level = "3�ܰ� ��";
		}else if(bmi>=30.0){
			level = "2�ܰ� ��";
		}else if(bmi>=25.0){
			level = "1�ܰ� ��";
		}else if(bmi>=23.0){
			level = "�� ���ܰ�";
		}else if(bmi<18.5){
			level = "��ü��";
		}
		System.out.println(level);
	}
}