import java.util.Scanner;;
public class Program {
	//メイン
	public static void main(String args[]) {
		String height = scanLine("高さを入力してください");
		String width = scanLine("続いて横幅を入力してください");
		String depth = scanLine("次に奥行を入力して下さい");
		String weight =scanLine("最後に重さを入力して下さい");

		IsOk(height, width, depth,weight);
		ryokin(height, width, depth, weight,goukei);
	}
	//入力
	private static String scanLine(String title) {
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}
	//IsOk
	public static void IsOk(String height,String width,String depth,String weight) {

		String goukei = height+width+depth;
	}
	//料金を求める処理
	public static void ryokin(String height,String width,String depth,String weight,String goukei) {
		int  i = Integer.parseInt(goukei);
		int  a = Integer.parseInt(weight);
		if(i <= 90) {
			if (a <= 5) {
				System.out.println("500円");
			}else if (a <= 10){
				System.out.println("1000円");
			}else {
				System.out.println("1000円");
			}
		}else if (i <= 180) {
			if(a <= 5) {
				System.out.println("1000円");
			}else if (a<= 10){
				System.out.println("2000円");
			}else {
				System.out.println("3000円");
			}
		}else {
			System.out.println("ー配送できないー");
		}goukei = String.valueOf(i);
	}
}
