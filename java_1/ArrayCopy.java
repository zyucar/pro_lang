import java.util.Arrays;
public class ArrayCopy{
	public static void main(String arg[]) {
		int dizi1[]={1,2,3,5,6};
		int[] dizi2=new int[5];
		System.arraycopy(dizi1,0,dizi2,0,5);
		for(int i=0;i<5;i++){
		System.out.println("dizi2["+i+"]= "+dizi2[i]);
		}
	}
} 