
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Botoes extends JRadioButton{
	
	private static final long serialVersionUID = 1L;
	
	
	public Botoes(String texto) {
		super(texto);
		init();
	}

	private void init() {
		setFont(new Font(null, Font.BOLD, 15));
		
	}

}
