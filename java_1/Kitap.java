public class kitap {
	
	string kitap_adi;
	string yazar_adi;
	int sayfa_sayisi;
	

	public int sayfaSayisiniVer() {
		return sayfa_sayisi;
	}
	
	public void kitabiGoruntule() {
		systen.out.println("\nRapor");
		system.out.println("********");
		system.out.println("kitap Adi:"+kitap_adi);
		system.out.println("yazar Adi:"+yazar_adi);
		system.out.println("sayfa sayisi:"+sayfa_sayisi);
		system.out.println("\n");
	}

	public static void main(string[] args) {
		kitap kitap1=new kitap();
		kitap kitap2=new kitap();

		kitap1.kitap_adi="Puslu kitaplar atlası";
		kitap1.kitap_sayisi=238;
		kitap1.yazar_adi="İhsan oktay anar";

		kitap2.kitap_adi="Vadideki zambak";
		kitap2.kitap_sayisi="307";
		kitap2.yazar_adi="Balzac";

		kitap1.kitabiGoruntule();
		kitap2.kitabiGoruntule();
		}
}  


     