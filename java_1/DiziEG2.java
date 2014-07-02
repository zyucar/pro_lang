public class DiziEG2 {
	double d[];
	String s[];
	public DiziEG2() {
		
		d = new double[5];
		d[0] = 2.3;
		d[1] = 3.6;
		d[3] = 5;
		d[4] =0.8;
		
		s = new String[3];
		s[0]="defter";
		s[1]= new String("kalem");
		s[2]="sarman";
		EkranaBas();
		
	}
	
	public void EkranaBas() {
		for(int i=0;i<d.length;i++){
			System.out.println("d["+i+"]= "+d[i]);
			
		}
		for(int i=0;i<s.length;i++){
			System.out.println("s["+i+"]= "+s[i]);
		}
	}
	public static void main(String arg[]){
		DiziEG2 dizi=new DiziEG2();
	}


}