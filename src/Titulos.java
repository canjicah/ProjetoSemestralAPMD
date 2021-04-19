
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Titulos extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	
	public Titulos(String texto) {
		super(texto);
		init();
	}

	private void init() {
		setFont(new Font(null, Font.BOLD, 15));
		
	}

}
