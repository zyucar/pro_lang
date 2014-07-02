import java.util.Scanner;
public class ArrayOr {
	public static void main(String arg[]){
		int[] a=new int[10];
		int i=0;
		int sonuc=0;
		
		Scanner sc=new Scanner(System.in);
		while(i<5) {
			System.out.print((i+1)+". sayiyi girin: ");
			a[i]=sc.nextInt();
			i++;
		}
		for(int x=0; x<5;x++){
			sonuc=sonuc + a[x];
		}
		System.out.println("sonuc= "+sonuc);
	}
}