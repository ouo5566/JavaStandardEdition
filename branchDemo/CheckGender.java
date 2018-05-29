import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 ?");
		String name = scan.next();
		System.out.println("주민등록번호 ? ex : 000000-0000000");
		String id = scan.next();

		String gender = "";
		char ch = id.charAt(7);

		switch(ch){
			case '1' : gender = "남" ; break;
			case '2' : gender = "여" ; break;
			case '3' : gender = "남" ; break;
			case '4' : gender = "여" ; break;
			case '5' : gender = "외국인" ; break;
			case '6' : gender = "외국인" ; break;
			default : System.out.println("다시 입력하세요."); return;
		}
		System.out.println(name + " : " + id + " : " + gender);
	}
}