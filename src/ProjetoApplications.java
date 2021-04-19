import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
public class ProjetoApplications {
	public static void main(String[] args) {
		
		CadastroLabel cadastro = new CadastroLabel();
		
			 JFrame janela = new JFrame("Fiap Movies");
				JTabbedPane tabs = new JTabbedPane();
				tabs.add("Cadastro",new CadastroLabel());
				tabs.add("Lista",new JLabel());

				janela.add(tabs);
				janela.setSize(615, 310);
				janela.setLocationRelativeTo(null);
				janela.setVisible(true);
				janela.setResizable(false);
				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
}
