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
		String grade = "F";
		if(average>=90){
			grade = "A";
		}else if(average>=80){
			grade = "B";
		}else if(average>=70){
			grade = "C";
		}else if(average>=60){
			grade = "D";
		}else if(average>=50){
			grade = "E";
		}

		System.out.println("이름 : "+ name + ", " + "평균 : " + average + ", " + "학점 : " + grade);
	}
}