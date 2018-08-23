
public class Program {
	public static void main(String[] args) {
		double a = 12.5,b = 1.5;
		int c = 0;
		c = (int)(a+ b++);
		System.out.println("a="+a+"b="+b+"c="+c);
		//結果:a=12.5b=2.5c=14
	}
}
