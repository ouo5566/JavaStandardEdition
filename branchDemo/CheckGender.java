import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸� ?");
		String name = scan.next();
		System.out.println("�ֹε�Ϲ�ȣ ? ex : 000000-0000000");
		String id = scan.next();

		String gender = "";
		char ch = id.charAt(7);

		switch(ch){
			case '1' : gender = "��" ; break;
			case '2' : gender = "��" ; break;
			case '3' : gender = "��" ; break;
			case '4' : gender = "��" ; break;
			case '5' : gender = "�ܱ���" ; break;
			case '6' : gender = "�ܱ���" ; break;
			default : System.out.println("�ٽ� �Է��ϼ���."); return;
		}
		System.out.println(name + " : " + id + " : " + gender);
	}
}