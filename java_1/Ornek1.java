import java.util.Scanner;
public class Ornek1{
	public static void main(String args[]){
	int i=1;
	Scanner s1=new Scanner(System.in);
	System.out.println("int tipinde veri giriniz:");
		int deger1=s1.nextInt();
		System.out.println("string tipinde veri giriniz:");
		String deger2=s1.next();
		System.out.println("boolean tipinde veri giriniz:");
		boolean deger3=s1.nextBoolean();
		while(i<2){
		if(deger1<0||deger2==null||deger3==false){
		System.out.println("eksi deger girilemez");
		
		break;
		}
		System.out.println(deger1);
		System.out.println(deger2);
		System.out.println(deger3);
		i++;
		}
	}
}