import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 ?");
		String name = scan.next();

		String error = "GRADE ERROR";
		System.out.println("국어점수 ?");
		int kor = scan.nextInt();
		if(kor<0 || kor>100){
			System.out.println(error);
			return;
		}
		System.out.println("영어점수 ?");
		int eng = scan.nextInt();
		if(eng<0 || eng>100){
			System.out.println(error);
			return;
		}
		System.out.println("수학점수 ?");
		int math = scan.nextInt();
		if(math<0 || math>100){
			System.out.println(error);
			return;
		}

		int average = (kor + eng + math)/3;
		int aver = average / 10
		String grade = "F";
		switch(aver){
			case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			case 5 : grade = "E"; break;
		}
		System.out.println("이름 : "+ name + ", " + "평균 : " + average + ", " + "학점 : " + grade);
	}
}