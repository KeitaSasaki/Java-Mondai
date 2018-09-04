import java.util.Random;

public class PerfectShuffle {

	private final static int MAX = 52;

	  public static void main(String[] args) {
	    int[] iArray = new int[MAX];
	    for (int i=0;i<MAX;i++){
	      iArray[i]=i+1;
	    }
	    PerfectShuffle pShuffle = new PerfectShuffle();
	    print_r(iArray);
	    pShuffle.getShuffle(iArray);
	    print_r(iArray);

	  }
	  public void getShuffle(int[] iArray){
	    Random rndGen = new Random( ); //ランダムジェネレータを生成します。
	    for (int i=iArray.length-1;i>=1;i--){
	      int rndIndex = rndGen.nextInt(i); // ０からi-1までの乱数を発生させます
	      /* 2変数をXORを用いて、スワップします */
	      iArray[i] ^= iArray[rndIndex];
	      iArray[rndIndex] ^= iArray[i];
	      iArray[i] ^= iArray[rndIndex];
	    }
	    return;
	  }
	  public static void print_r(int[] iArray){
	    for (int i=0; i<iArray.length;i++){
	      System.out.print(iArray[i]+" ");
	    }
	    System.out.println("");
	  }
}
