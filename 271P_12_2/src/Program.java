import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		greet();
	}
	public static void greet(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください。");
		String Name = scanner.next();
		System.out.println("名前が入力されました。\r\n続いて性別を数字で入力してください\r\n----------\r\n女性:0\r\n男性:1\r\n----------");
		int	nomber = scanner.nextInt();
		switch (nomber) {
		case 0:
			System.out.println("こんにちは"+Name+"さん");
			break;
		case 1:
			System.out.println("こんにちは"+Name+"くん");
			break;
		default:
			System.out.println("(^q^)くおえうえーーーるえうおおおｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗ");
			break;
		}
	}
}
