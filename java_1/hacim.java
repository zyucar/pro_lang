package defter_ornek;
import java.until.scanner;

public class kutu{
	public static void main(String args[]){
		int en, boy, yukseklik, hacim;

		scanner oku=new scanner(System.in);

		System.out.println("cismin enini giriniz:");
		en=oku.nextİnt();

		
		System.out.println("cismin boyunu giriniz:");
		boy=oku.nextİnt();

		System.out.println("cismin yuksekliğini giriniz:");
		yukseklik=oku.nextİnt();

		hacim=en*boy*yukseklik;

		if(en<0 || boy<0 ||yukseklik<0) {
		break;
		}
		
		System.out.println("cismin hacmi:"+hacim);
		
	}
}