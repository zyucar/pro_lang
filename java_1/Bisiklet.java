public class Bisiklet{
	Insan binmisInsan;
	public Bisiklet(){
		binmisInsan=null;
	}
	public Bisiklet(Insan gelenInsan){
		binmisInsan=gelenInsan;
	}
	public void bin(Insan gelenInsan){
		if(binmisInsan==null){
		binmisInsan=gelenInsan;
		System.out.println(binmisInsan.isim+" basariyla bindi.");
	}
	else {
		System.out.println("zaten "+binmisInsan.isim+" binmis");
	}
	}
	public void in(){
	if(binmisInsan==null){
		System.out.println("zaten bisiklet bos!");
		}
		else {
		String isim=binmisInsan.isim;
		binmisInsan=null;
		System.out.println(isim+" indi!");
		}
	}

}