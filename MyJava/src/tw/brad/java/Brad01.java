package tw.brad.java;

import javax.swing.JOptionPane;

public class Brad01 {
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("輸入....");
		System.out.println(id);
		System.out.println(id.length());
		if (id.length() == 10){
			System.out.println(id.charAt(0));
			
		}else{
			System.out.println("xxxxxx");
		}
		
	}
}
