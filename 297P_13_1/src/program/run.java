package program;
import ex13_01.Card;

public class run {
	private static int number2;
	private static int marknumber;
	private static String mark2;
	//メイン処理
	public static void main(String[] args) {
		randomNumber();
		NumberOutputs();
		if (number2 != 14) {
			randomMark();
			MarkOutputs();
		}
	}
	//ランダム処理(数字)
	public static void randomNumber() {
		Card card = new Card();
		card.number = (int)(Math.random()*14+1);
		number2 = card.number;
	}
	//出力処理(数字)
	public static void NumberOutputs() {
		run run = new run();
		//数字出力
		if (number2 == 14) {
			System.out.println("このトランプはジョーカーです");
		}else {
			System.out.println("このトランプの数字は"+number2+"です");
		}
	}
	//出力処理(マーク)
	private static void MarkOutputs() {
		Card card = new Card();
		System.out.println("そしてマークは"+mark2+"です");
	}
	//ランダム処理(マーク)
	public static void randomMark() {
		Card card = new Card();
		marknumber = (int)(Math.random()*4+1);
		switch (marknumber) {
		case 1:
			mark2 = "スペード";
			break;
		case 2:
			mark2 = "クローバー";
			break;
		case 3:
			mark2 = "ダイヤ";
			break;
		case 4:
			mark2 = "ハート";
			break;
		}
	}
}
