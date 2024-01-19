import java.util.Scanner;

public class ex3 {

	static String sc(String x) {
		Scanner sc=new Scanner(System.in);
		x=sc.nextLine();
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="";
		String password="";
		
		System.out.println("Kullanıcı Adını Gir:");
		userName=sc(userName);
		System.out.println("Kullanıcı şifre Gir:");
		password=sc(password);
		if(password.equals("1234")){
			if(userName.equals("admin")) {
				System.out.println("Hoş geldin admin!!");
			}else {
				System.out.println("merhaba "+userName);
			}
		}else {
			System.out.println("Şifre hatalı!!");
		}

	}

}
