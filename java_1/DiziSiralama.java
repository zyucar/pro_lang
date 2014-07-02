import java.util.*;
public class DiziSiralama {
	public static void EkranaBas(double[] d){
		for(int	i=0 ; i< d.length;i++){
			System.out.println("d["+i+"]= "+d[i]);
		}
	}
	public static void main(String arg[]){
		double d[] =new double[4];
		d[0]=1.2;	d[3]=2;
		d[1]=4;	d[2]=6.3;
		System.out.println("karisik sirada");	EkranaBas(d);
		Arrays.sort(d);
		System.out.println("Siralanmis sirada");	EkranaBas(d);
	}
}