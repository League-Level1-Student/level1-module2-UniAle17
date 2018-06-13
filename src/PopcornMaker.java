import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {

String userflavor = JOptionPane.showInputDialog("What flavor do you want your popcorn?");		
		
		
Popcorn yum = new Popcorn(userflavor);

String usertime = JOptionPane.showInputDialog("How many minutes do you want your popcorn in the microwave?");

Microwave jiff = new Microwave();
 jiff.putInMicrowave(yum);
 jiff.setTime(usertime);
 jiff.startMicrowave();
 yum.applyHeat();
 yum.eat();

	
	
	
	
	
	}
	}
	
	
	
	
	
