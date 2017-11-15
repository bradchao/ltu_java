package tw.brad.java;

import javax.swing.JOptionPane;

public class Brad01 {
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("輸入....");
		System.out.println(id);
		if (id.matches("^[A-Z][12][0-9]{8}$")){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
		
	}
}
