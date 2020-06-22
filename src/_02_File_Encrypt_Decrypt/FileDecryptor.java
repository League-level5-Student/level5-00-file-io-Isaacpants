package _02_File_Encrypt_Decrypt;

import javax.swing.JOptionPane;

public class FileDecryptor {
	public static void main(String[] args) {
		String ns = JOptionPane.showInputDialog("Write a phrase or sentance to decrypt");
		String stringShift = JOptionPane.showInputDialog("What do you want to shift it by");
		int shift = Integer.parseInt(stringShift);
		String finals ="";
		String[] finalS = new String[ns.length()];
		char[] c = new char[ns.length()];
		for (int i = 0; i < ns.length(); i++) {
		int numeric = Character.getNumericValue(ns.charAt(i));
		numeric -= shift;
		char newC = (char)numeric;
				c[i] = newC;
			finalS[i] = Character.toString(newC);
			finals = finalS[i];
		}
		JOptionPane.showMessageDialog(null, finals);
	}
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
}
