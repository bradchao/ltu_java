package tw.brad.java;

import javax.swing.JOptionPane;

public class Brad01 {
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("輸入....");
		System.out.println(id);
		if (id.matches("^[A-Z][12][0-9]{8}$")){
//		if (id.matches("^09[0-9]{2}-[0-9]{6}$")){
			System.out.println("OK");
			
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			char id1 = id.charAt(0);
			int n12 = letters.indexOf(id1) + 10;
			System.out.println(n12);
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			
			
			
		}else{
			System.out.println("XX");
		}
		
	}
}
