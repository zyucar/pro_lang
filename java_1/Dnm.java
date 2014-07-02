class Dnm{
public static byte yazdir(int d,int z){
 byte sinif;
 sinif=(byte)(d&z);
 System.out.println(sinif);
 return sinif;
 }
 public static void main(String args[]){
 System.out.print("byte a donusum=");
 yazdir(8,2);
 }
}