package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String numeral=JOptionPane.showInputDialog("ENTER A NUMBER");
	boolean c=true;
	int Number=Integer.parseInt(numeral);
	for (int i = 2; i < Number; i++) {
		if (Number%i==0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime");
			c=false;
			break;
		}
	}
	if(c==true) {
	JOptionPane.showMessageDialog(null,"Your number is prime.");
	}
}
}
