package week3.day1;

public class DesktopSingle extends ComputerSingle {

	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("32 inch");

	}

	public static void main(String[] args) {
		
		DesktopSingle inheritance = new DesktopSingle();
		inheritance.computerModel();
		inheritance.desktopSize();
	}
}

