import javax.swing.*;

public class AnaSinif{
	public static void main(String arg[]) {
		boolean deger1= true;
		boolean deger2= false;
		boolean sonuc1= deger1 && deger2;
		
		JOptionPane.showMessageDialog(null,"deger1:"+deger1+"deger2:"+deger2+"deger1 && deger2->"+sonuc1);

		boolean sonuc2 = deger1 || deger2 ;
		JOptionPane.showMessageDialog(null, "deger1:"+deger1+"\ndeger2:"+deger2+"\ndeger1 || deger2 ->"+sonuc2);

		deger2=true;
		sonuc1=deger1 && deger2;
		JOptionPane.showMessageDialog(null,"deger1:"+deger1+"\ndeger2:"+deger2+"\n\ndeger1 && deger2 ->"+sonuc1);
	}
}