class YeniKahveFincani {
	public YeniKahveFincani(int adet){
		System.out.println(adet+"adet yeni kahve fincani");
	}
}
public class YBO2 {
	public static void main(String[] args){
		for(int i=0; i<5;i++)
			new YeniKahveFincani(i);
	}
}