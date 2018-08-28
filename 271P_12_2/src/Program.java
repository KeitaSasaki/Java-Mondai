import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		String name = scanLine("名前を入力してください");
		String number= scanLine("続いて性別を[半角]入力してください。\\r\\n女性:0\\r\\n男性:1");
		syori(name, number);
	}

	//入力
	private static String scanLine(String title){
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}
	//処理
	public static void syori(String name,String number)
	{
		switch (number) {
		case "0":
			System.out.println("こんにちは"+name+"さん");
			break;
		case "1":
			System.out.println("こんにちは"+name+"くん");
			break;
		default:
			System.out.println("(^q^)くおえうえーーーるえうおおおｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗ");
			break;
		}
	}
}