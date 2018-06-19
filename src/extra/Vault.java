package extra;

import java.nio.charset.MalformedInputException;

import javax.swing.JOptionPane;

public class Vault {

	
	String code = JOptionPane.showInputDialog("What is the secret code?");

	int x = Integer.parseInt(code);
	
	
	
	public boolean  tryCode(int number) {
		if(x==number) {
		return true;
	}
		else {
			return false;
		
		
		}
	}
	public static void main(String[] args) {
		Vault a = new Vault();
		a.tryCode(3);
	
	
	}

	
}
