package lwendel.cipher;

import java.awt.BorderLayout;

import javax.swing.*;

public class View extends JFrame {
	
	public JButton calc;
	public JTextField text;
	public JRadioButton shift, substitution;
	public Controller c;
	public Model m;
	
	//constructor
	public View(Controller c1, Model m1) {
		this.c = c1;
		this.m = m1;
		
		this.calc = new JButton("calculate");
		this.text = new JTextField();
		this.shift = new JRadioButton("shift");
		this.substitution = new JRadioButton("substitution");
		
		this.setSize(400, 600);
		this.setTitle("Cipher");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.add(this.calc, BorderLayout.EAST);
		this.add(this.text, BorderLayout.CENTER);
		
		
		
		
		
		
		
		this.setVisible(true);
		
	}
	
}
