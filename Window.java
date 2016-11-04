package jca.org;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame{
	//private
	private JButton b1, b2;
	private JTextField e1;
	private JLabel l1;
	private JPanel panel;
	//Ventana
	public Window () {
		components();
		actions();
	}
	public void components (){
		//Ventana
		this.setTitle("WINDOW!!!");
		//this.setBounds(Eje Horizontal,Eje Vertical,Ancho,Largo);
		this.setBounds(200, 40, 400, 500);
		//EXIT_ON_CLOSE significa que saldra del programa.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//panel
		this.panel=new JPanel();
    	this.panel.setLayout(null);
    	this.add(this.panel);
		//Barra de texto
		this.e1 = new JTextField();
		this.e1.setBounds(10, 10, 120, 25);
		this.e1.setVisible(true);
		this.panel.add(this.e1);
		//boton OK
		this.b1 = new JButton("OK");
		this.b1.setBounds(10, 40, 60, 30);
		this.panel.add(this.b1);
		//etiqueta para mensaje de texto
		this.l1 = new JLabel("MENSAJE DE PRUEBA");
		this.l1.setBounds(10, 70, 300, 30);
		this.panel.add(this.l1);
		//boton MODAL
		this.b2 = new JButton("MODAL");
		this.b2.setBounds(100, 200, 100, 50);
		this.panel.add(this.b2);
		//visibilidad de la ventana
		this.setVisible(true);
	}
	
	public void actions () {
		//boton [ok] que cambia la etiqueta por lo que esta escrito en el cuadro de texto
		this.b1.addActionListener((e) -> {
			this.l1.setText(this.e1.getText());
		});
		//boton [modal] para habrir una nueva Modal.
		this.b2.addActionListener((e) -> {
			new ModalWindow();
		});
	}
	
}
