package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	ArrayList<String> arr = new ArrayList<String>();
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();

	public static void main(String[] args) {
		ToDoList tdl = new ToDoList();
		tdl.setup();
	}

	void setup() {
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setVisible(true);
		jf.add(jp);
		jp.add(jb);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);

		jb.setText("add task");
		jb1.setText("View task");
		jb2.setText("remove task");
		jb3.setText("save list");
		jb4.setText("load list");

		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);

		jf.pack();
	}

	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 *
	 * When add task is clicked: Create a JOptionPane to ask the user for a task and
	 * add it to an ArrayList
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: Create a JOptionPane to prompt the
	 * user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Create a JOptionPane to Prompt the user
	 * for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb) {
			String add = JOptionPane.showInputDialog("What is the task");
			arr.add(add);
		} else if (e.getSource() == jb1) {
			if (arr.size() == 0) {
				JOptionPane.showMessageDialog(null, "You have no tasks");
			}
			for (int i = 0; i < arr.size(); i++) {
				JOptionPane.showMessageDialog(null, arr.get(i));
			}
		} else if (e.getSource() == jb2) {
			String stringRemove = JOptionPane.showInputDialog("Which number task would you like to remove");
			int remove = (Integer.parseInt(stringRemove)) - 1;

			arr.remove(remove);
		} else if (e.getSource() == jb3) {
			try {
				FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt");

				for (int i = 0; i < arr.size(); i++) {

					fw.write(arr.get(i));
				}
				fw.close();
			} catch (IOException arg0) {
				arg0.printStackTrace();
			}
		} else if (e.getSource() == jb4) {
			String location = JOptionPane.showInputDialog("What is the location of the file");
			try {
				FileReader fr = new FileReader(location);
				int c = fr.read();
				while (c != -1) {
					System.out.print((char) c);
					c = fr.read();
				}
				fr.close();
			} catch (FileNotFoundException a) {
				a.printStackTrace();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
	}
}
