  public class Hayvanlar {
       public static void main(String args[]) {
	   
               String[][][] s=new String[1][2][1];
			   
               s[0][0][0]="ayi";
               s[0][1][0]="ari";
			       for(int i=0;i<s.length;i++) {
                       for(int j=0;j<s[i].length;j++) {
							for(int t=0;t<s[i][j].length;t++){
                               System.out.println("s["+i+"]["+j+"]["+t+"]: "+s[i][j][t]);
							  }
                       }
               }
       }
}