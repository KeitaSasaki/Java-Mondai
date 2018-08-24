import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("start");

		int m;
		int n;
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<3; i++) {
	        try {
			System.out.println("数値(割る数)を整数で入力してください。");
	        m = scanner.nextInt();
	        System.out.println("入力した数値は " + m + " です。");
	        System.out.println("数値(割られる数)整数で入力してください。");
	        n = scanner.nextInt();
	        System.out.println("入力した数値は " + m + " です。");
	        System.out.println(n+"を"+m+"で割った余りは"+n%m+"です");
		}catch (Exception e) {
			//入力時の型エラー処理
			System.out.println("(^q^)くおえうえーーーるえうおおおｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗｗ");
			break;
		}
	        }
		System.out.println("end");
	}
}
