package Components;


import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Servicos extends JRadioButton {
	
	private static final long serialVersionUID = 1L;
	
	public Servicos(String texto){
		init();
		
	}
	private void init(){
		this.setFont(new Font(null, Font.BOLD, 15));
	}
}