package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings({"serial", "unused"})
public class UI extends JFrame implements ActionListener{

	public UI(){
		super("J-PDF");
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int)size.getWidth(), (int)size.getHeight());
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		/* */
	}

	public static void main(String[] args){
		UI a = new UI();
	}
}