import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�󸶿���?");
		int price = scan.nextInt();
		System.out.println(price + "���Դϴ�.");
		System.out.println("�� �� �帱���?");
		int many = scan.nextInt();
		System.out.println(many + "���ּ���.");
		price = price * many;
		System.out.println("�� �ݾ��� "+ price +"���Դϴ�.");
		System.out.println("��ο�. ����ּ���.");
		System.out.println("�� �ۼ�Ʈ DC�ұ��?");
		int dc = scan.nextInt();

		String sell = "�� �Ⱦƿ�.";
		if(dc < 10){
			price = price - (price * dc / 100);
			sell = price +"���Դϴ�.";			
		}
		System.out.println(sell);
	}
}