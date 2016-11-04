package jca.org;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModalWindow extends JFrame {
	private JLabel l1;
	private JPanel panel;
	public ModalWindow(){
		this.setBounds(250, 150, 300, 300);
		//DISPOSE_ON_CLOSE cierra la ventana mas el programa sigue funcionando normalmente
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("HELLO THERE!!");
		//panel
		this.panel=new JPanel();
    	this.panel.setLayout(null);
    	this.add(this.panel);
    	//etiqueta HELLO!!!!!!!.
		this.l1 = new JLabel("HELLO!!!!!!!");
		this.l1.setBounds(120, 70, 300, 30);
		this.panel.add(this.l1);
		this.setVisible(true);
	}
}
