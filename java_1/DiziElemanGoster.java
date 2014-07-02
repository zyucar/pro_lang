public class DiziElemanGoster {
	public static void main(String args[]){
		
		double[] d= {2.1,3.4,4.5,1.1,5};
		String[] s= {"defter","kalem","sarman"};
		
		for(int i=0;i<d.length;i++){
			System.out.println((i+1)+".d["+i+"]: "+d[i]);
		}
		System.out.println("simdi string turundeki dizimizi yazdiralim");
		System.out.println(":D:D:D");
		for(int j=0;j<s.length;j++){
			System.out.println((j+1)+".s["+j+"]: "+s[j]);
		}
	}
}