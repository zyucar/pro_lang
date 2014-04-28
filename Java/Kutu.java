import java.util.Scanner;
public class KUTU2 {
	
 
	public void hesapla(double a, double b, double c ){
	
	double hacim= a*b*c;
	
	System.out.println("hacim: "+hacim);
	
	}
	
	
	public static void main(String args[]){
	
		Scanner oku=new Scanner(System.in);
		KUTU2 kutu=new KUTU2();
		
		System.out.println("en: ");
		Double en=oku.nextDouble();
		System.out.println("boy: ");
		Double boy=oku.nextDouble();
		System.out.println("yukseklik: ");
		Double yukseklik=oku.nextDouble();
		
		kutu.hesapla(en,boy,yukseklik);
	}
}
