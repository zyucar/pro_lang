 class Kutu1{
	
	public double x;
	public double y;
	public double z;
	public boolean kirilir;
	public int taban_kodu;
	
}
	class Depo1 {
		public static void main (String[] args){
			Kutu1 k1=new Kutu1();
			Kutu1 k2=new Kutu1();
			
		//k1 verileri
			k1.x=3.0; k1.y=2.5; k1.z=4.0;
			k1.kirilir=false;
			k1.taban_kodu=0;
			
		//k2 verileri
			k2.x=5.0; k2.y=3.5; k2.z=4.0;
			k2.kirilir=true;
			k2.taban_kodu=1;
			
			System.out.println("*k1 hacmi:"+(k1.x*k1.y*k1.z));
			System.out.println("*k2 hacmi:"+(k2.x*k2.y*k2.z));
		}
	}
