class sayi{
	int i;
	}
	public class NesneAtama{
		public static void main (String args[]){
		sayi s1=new sayi();
		sayi s2=new sayi();
			s1.i=9;
			s2.i=47;
			System.out.println("1:s1.i="+s1.i+"	s2.i="+s2.i);
			s1.i=s2.i;
			System.out.println("2:s1.i="+s1.i+"	s2.i="+s2.i);
			s1=s2;
			System.out.println("3: s1.i="+s1+"	s2.i"+s2);
		}
	}