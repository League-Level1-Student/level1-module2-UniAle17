package extra;

import java.nio.charset.MalformedInputException;

import javax.swing.JOptionPane;

public class Vault {

	public Vault(int x) {
		this.x=x;
	}
	String code = JOptionPane.showInputDialog("What is the secret code?");

	int x = Integer.parseInt(code);
	
	
	
	public boolean  tryCode(int number) {
		if(x==number) {
			System.out.println("Thats Correct!");
		return true;
	}
		else {
			System.out.println("That is Incorrect!");
			return false;
		
		
		}
	}
	public static void main(String[] args) {
		Vault a = new Vault(17);
		a.tryCode(3);
	JamesBond apple = new JamesBond();
	apple.findCode(a);
	}

	
}
