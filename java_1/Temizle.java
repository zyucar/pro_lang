class elma {
	int i =0;
	elma(int y) {
		this.i=y;
		System.out.println("elma nesnesi olusturuluyor="+i);
	}
	public void finalize(){
		System.out.println("elma nesnesi yok ediliyor="+i);
	}
}
public class Temizle {
	public static void main(String args[]){
		for(int y=0; y<10;y++){
			elma e=new elma(y);
		}
		System.gc();
		for(int y=0;y<21;y++){
		elma e=new elma(y);
		}
	}
}