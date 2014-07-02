import java.util.Scanner;

public class SayiOyunu {

	public static void main(String args[]){
	
	int tahmin=23,sayi=0;
	
	Scanner sc=new Scanner(System.in);
	
	boolean girdi=true;
	
	
	
	do {
	
	System.out.print("let's go you must to enter a number :D = ");
		
		sayi=sc.nextInt();
	
		if(sayi<tahmin){
	
		System.out.println("kucuk sayi girdin :P  ");
		}
		else if(sayi>tahmin){
		
		System.out.println("oha buyuk sayi girdin be :)))  ");
		
		}
		
		else if(sayi==tahmin){
		
		System.out.println("Eveeeeet dogru cevap!!! ");
		girdi=false;
		}
		} while(girdi);
		
	}	
}
	

	