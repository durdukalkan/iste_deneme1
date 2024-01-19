	class Tool{
		private int kaynakID;
		
		public Tool(int id) {
			kaynakID=id;
			
			if(kaynakID==1)
				System.out.println("kaşık alındı");
			else
				System.out.println("çatal alındı");
		}
		public void kullan(int id) {
			if(id==1)
				System.out.println("kaşık kullanılıyor");
			else
				System.out.println("çatal kullanılıyor");
		}
		protected void finalize() {
			System.out.println("yemek aracı olan "+kaynakID+" yok ediliyor.");
			
		}
	}
public class ex5 {
	


	public static void main(String[] args) {
		Tool Spoon=new Tool(1);
		Tool Fork=new Tool(2);
		Spoon.kullan(1);
		Fork.kullan(2);
		Spoon=null;
		Fork=null;
		System.gc();

	}

}
