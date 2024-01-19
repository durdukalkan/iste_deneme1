//import java.util.Scanner;
import java.util.Scanner;
public class ex1 {
	
	static int sc(int x) {
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello Word");
		int x=0;
		int y=0;
		int result=0;
		System.out.println("ilk sayıyı gir:");
		x=sc(x);
		System.out.println("ikinci sayıyı gir:");
		y=sc(y);
		result=x+y;
		System.out.println(x+ "+" +y+"="+ result);
		

	}

}
