public class PazarListesi {
	String[] liste;
	int sinir;
	int elemanSayisi;
	
	public PazarListesi(int elemanKapasitesi) { //constructer public olmalı ve classla aynı isme sahip olmak zorunda
		liste=new String[elemanKapasitesi];
		elemanSayisi=0;
		sinir=elemanKapasitesi;
	}	
		
	public void listeyeEkle(String eklenecekOlan){
		if(elemanSayisi<sinir) {
			liste[elemanSayisi]=eklenecekOlan;
			elemanSayisi++;
		}
		
		else{
			
			System.out.println("Bos yer kalmadi");
		}
		
	}
	public void yaz(){
		
		for(int i=0;i<elemanSayisi;i++){
			System.out.println(liste[i]);
		}
	}
	
	public static void main(String args[]){
		
		PazarListesi liste=new PazarListesi(5);
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("su");
		liste.listeyeEkle("Seker");
		liste.listeyeEkle("Cay");
		liste.listeyeEkle("Gofret");
		liste.listeyeEkle("Tuz");
		
		liste.bastanSil();
		liste.bastanSil();
		
		System.out.println("bastan siliniyor...");
		liste.yaz();
	}
	public void bastanSil(){
	
		for(int i=0; i<elemanSayisi -1 ;i++){
			liste[i]=liste[i+1];
			
		}
		elemanSayisi--;
	}
}