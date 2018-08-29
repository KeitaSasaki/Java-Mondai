package test;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		int height	= scanLineByInteger("高さを入力してください");
		int width	= scanLineByInteger("続いて横幅を入力してください");
		int depth	= scanLineByInteger("次に奥行を入力して下さい");
		int weight	= scanLineByInteger("最後に重さを入力して下さい");

		if(!IsOk(width, height, depth, weight)){
			System.out.println("ー配送できないー");
		}else{
			int sum = ryokin(width, height, depth, weight);
			System.out.println("料金は"+sum+"円です。");
		}
	}

	//入力
	private static String scanLine(String title) {
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}
	private static int scanLineByInteger(String title) {
		return Integer.parseInt(scanLine(title));
	}

	// 配送可能であるか判定する。
	private static boolean IsOk(int width, int height, int depth, int weight) {
		int sum = goukei(width, height, depth);
		boolean result = true;
		if(sum > 180) {
			result = false;
		}
		return result;
	}

	// 合計を返す。
	public static int goukei(int width, int height, int depth) {
		return width + height + depth;
	}

	//料金を求める処理
	public static int ryokin(int width, int height, int depth, int weight) {
		int cost = 0;

		int sum = goukei(width, height, depth);

		if(weight <= 90) {
			if (sum <= 5) {
				cost = 500;
			}else{
				cost = 1000;
			}
		} else if (weight <= 180) {
			if(sum <= 5) {
				cost = 1000;
			} else if (sum <= 10) {
				cost = 2000;
			} else {
				cost = 3000;
			}
		}
		return cost;
	}
}
