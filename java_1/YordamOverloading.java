class MuzikDosyasi {
	String m_tur="Muzik Dosyasi";
}
class ResimDosyasi {
	String r_tur="Resim Dosyasi";
}
class TextDosyasi {
	String t_tur="Text Dosyasi";
}
public class YordamOverloading {
	public void dosyaAc(MuzikDosyasi md) {
		System.out.println("Tur="+md.m_tur);
	}
	public void dosyaAc(ResimDosyasi rd) {
		System.out.println("Cesit="+rd.r_tur);
	}
	public void dosyaAc(TextDosyasi td) {
		System.out.println("Tur&Cesit="+td.t_tur);
	}
	public static void main(String[] args) {
		YordamOverloading mod=new YordamOverloading();
		MuzikDosyasi md=new MuzikDosyasi();
		ResimDosyasi rd=new ResimDosyasi();
		TextDosyasi td=new TextDosyasi();
		mod.dosyaAc(md);
		mod.dosyaAc(rd);
		mod.dosyaAc(td);
	}
}