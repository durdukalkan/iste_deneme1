
public class ex6 {
	
	class ATM{
		public String hesapSahibi;
		private double bakiye;
		private String usd;
		private String euro;
		
		
		public ATM() {
			this.hesapSahibi="bilinmiyor";
			this.bakiye=0.0;
			this.usd="usd";
			this.euro="euro";
			
			
		}
		public ATM(String hesapSahibi, double bakiye,String usd,String euro) {
			
			this.hesapSahibi = hesapSahibi;
			this.bakiye = bakiye;
			this.usd=usd;
			this.euro=euro;
		}
		public final void bakiyeGoster() {
			System.out.println(hesapSahibi+" adlı müseriye ait bakiye bilgisi "+bakiye);
			
		}
		public void paraYatir(int miktar,String tur) {
			switch (tur) {
			case "usd":
				bakiye=bakiye+(miktar*28);
				System.out.println(hesapSahibi+" adlı müşterinin hesabına "+miktar+" USD yatlmıştır.");
				break;
			case "euro":
				bakiye=bakiye+(miktar*31);
				System.out.println(hesapSahibi+" adlı müşterinin hesabına "+miktar+" EURO yatlmıştır.");
				break;
			default:
				System.out.println("Geçersiz işlem");
				break;
			}
			
			
		}
		public void paraYatir(int miktar) {
			bakiye=miktar;
			System.out.println(hesapSahibi+" adlı müşterinin hesabına "+bakiye+" TL yatırılmıştır.");
		}
		public void paraCek(int miktar) {
			if(miktar>0&&miktar<=bakiye) {
				bakiye-=miktar;
				System.out.println(hesapSahibi+" adlı müşterinin hesabıdan "+miktar+ "TL para çekildi");
				System.out.println("yeni bakiye : "+bakiye);
				
			}else System.out.println("Geçersiz İşlem");
			
		}
		public static void atmInfo() {
			System.out.println("***************************************************************");
			System.out.println("ATM'ye Hoş Geldiniz!");
			System.out.println("Bu ATM ile bakiye görüntüleyebilr. para yatırıp, çekebilirsini.");
			System.out.println("***************************************************************");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM hesap1=new ATM();
		ATM hesap2=new ATM("BATUHAN",1000.0, "","");
		ATM.atmInfo();
		hesap1.bakiyeGoster();
		hesap2.bakiyeGoster();
		hesap1.paraYatir(500);
		hesap2.paraCek(3000);
		hesap2.paraYatir(200, "usd");
		

	}

}
