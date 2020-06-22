package _02_File_Encrypt_Decrypt;

import javax.swing.JOptionPane;

public class FileEncryptor {
	public static void main(String[] args) {
		
		String ns = JOptionPane.showInputDialog("Write a phrase or sentance to encrypt");
		String stringShift = JOptionPane.showInputDialog("What do you want to shift it by");
		int shift = Integer.parseInt(stringShift);
		String finals ="";
		String[] finalS = new String[ns.length()];
		char[] c = new char[ns.length()];
		
		for (int i = 0; i < ns.length(); i++) {
		//int numeric = Character.getNumericValue(ns.charAt(i));
		
	//  System.out.println(numeric);
	//	numeric += shift;
	//	char newC = (char)numeric;
		//System.out.println(newC);
			char newC = (char) (ns.charAt(i) + shift);
			System.out.println(newC);
				c[i] = newC;
			finalS[i] = Character.toString(newC);
			finals = finalS[i];
		}
		JOptionPane.showMessageDialog(null, finals);
	}
	
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
}
