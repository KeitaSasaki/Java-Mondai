
public class Program {

	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 3;

		//A
		a += b;
		System.out.println(a);

		//B
		a -= 1;
		System.out.println(a);

		//C
		a *= (b-1);
		System.out.println(a);

		//D csaytrew
		a = 0;
		b = 0;
		c = 0;
		System.out.println("---D---");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}