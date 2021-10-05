package jgato;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

public class PanelGato extends JPanel {

	public PanelGato() {

		this.setBackground(Color.GREEN);
		this.setLayout(new GridLayout(3,3,7,7));
		this.setPreferredSize(new Dimension(600,600));
		this.setVisible(true);

		JLabel etiqueta1 = new JLabel("X");
		etiqueta1.setBackground(new Color(102,0,153));
		etiqueta1.setForeground(Color.GREEN);
		etiqueta1.setOpaque(true);
		etiqueta1.setVisible(true);

		JLabel etiqueta2 = new JLabel("O");
		etiqueta2.setBackground(new Color(102,0,153));
		etiqueta2.setForeground(Color.GREEN);
		etiqueta2.setOpaque(true);
		etiqueta2.setVisible(true);

		JLabel etiqueta3 = new JLabel("X");
		etiqueta3.setBackground(new Color(102,0,153));
		etiqueta3.setForeground(Color.GREEN);
		etiqueta3.setOpaque(true);
		etiqueta3.setVisible(true);

		JLabel etiqueta4 = new JLabel("O");
		etiqueta4.setBackground(new Color(102,0,153));
		etiqueta4.setForeground(Color.GREEN);
		etiqueta4.setOpaque(true);
		etiqueta4.setVisible(true);

		JLabel etiqueta5 = new JLabel("X");
		etiqueta5.setBackground(new Color(102,0,153));
		etiqueta5.setForeground(Color.GREEN);
		etiqueta5.setOpaque(true);
		etiqueta5.setVisible(true);

		JLabel etiqueta6 = new JLabel("O");
		etiqueta6.setBackground(new Color(102,0,153));
		etiqueta6.setForeground(Color.GREEN);
		etiqueta6.setOpaque(true);
		etiqueta6.setVisible(true);

		JLabel etiqueta7 = new JLabel("X");
		etiqueta7.setBackground(new Color(102,0,153));
		etiqueta7.setForeground(Color.GREEN);
		etiqueta7.setOpaque(true);
		etiqueta7.setVisible(true);

		JLabel etiqueta8 = new JLabel("O");
		etiqueta8.setBackground(new Color(102,0,153));
		etiqueta8.setForeground(Color.GREEN);
		etiqueta8.setOpaque(true);
		etiqueta8.setVisible(true);

		JLabel etiqueta9 = new JLabel("X");
		etiqueta9.setBackground(new Color(102,0,153));
		etiqueta9.setForeground(Color.GREEN);
		etiqueta9.setOpaque(true);
		etiqueta9.setVisible(true);

		this.add(etiqueta1);
		this.add(etiqueta2);
		this.add(etiqueta3);
		this.add(etiqueta4);
		this.add(etiqueta5);
		this.add(etiqueta6);
		this.add(etiqueta7);
		this.add(etiqueta8);
		this.add(etiqueta9);

	}
}
