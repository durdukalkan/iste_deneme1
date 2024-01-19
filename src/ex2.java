import java.util.Scanner;

public class ex2 {
	
	
	public static double sum(double x,double y) {
		double result=0;
		result=x+y;
		return result;
	}
	
	public static int sum(int x,int y,int z) {
		int result=0;
		result=x+y+z;
		return result;
	}
	
	public static int sum(int x,int y) {
		int result=0;
		result=x+y;
		return result;
	}

	
	static int sc(int x) {
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		return x;
	}
	static double sc(double x) {
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int z=0;
		double d=0;
		double e=0;
		
		System.out.println("3 adaet tam sayı dir:");
		x=sc(x);
		y=sc(y);
		z=sc(z);
		System.out.println("\nx = "+x+"\ny = "+y+"\nz = "+z);
		
		System.out.println("2 adaet ondalıklı sayı dir:");
		
		d=sc(d);
		e=sc(e);
		System.out.println("\nd = "+d+"\ne = "+e);
		System.out.println("----------------------------------------");
		System.out.println("x + y = "+sum(x,y));
		System.out.println("x + z = "+sum(x,z));
		System.out.println("y + z = "+sum(y,z));
		System.out.println("x + y + z = "+sum(x,y,z));
		System.out.println("----------------------------------------");
		System.out.println("d + e = "+sum(d,e));
		
		
		

	}

}
