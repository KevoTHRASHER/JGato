package jgato;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class FrameGato extends JFrame {

	public FrameGato() {

		PanelGato myPanelGato = new PanelGato();

		this.add(myPanelGato);
		this.getContentPane().setBackground(Color.BLACK);
		this.setTitle("JGato");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0,0,600,600);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);

	}
}
