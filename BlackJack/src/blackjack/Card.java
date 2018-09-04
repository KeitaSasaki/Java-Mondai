package blackjack;


public class Card {
	public class Card implements Comparable<Card> {
		public static enum Suit {CLUB, DIA, HEART, SPADE, JOKER};
		private static final String[] toStr = {"クラブ", "ダイヤ", "ハート", "スペード", "ジョーカー"};
		private Suit suit;	// スート
		private int num;	// トランプの数字
		private String str;	// 対応する文字列

		public Card(Suit suit, int num){
			this.suit = suit;
			this.num = num;
			this.str = toStr[suit.ordinal()];
			if(suit != Suit.JOKER){
				this.str += "の" + num;
			}
		}
}
