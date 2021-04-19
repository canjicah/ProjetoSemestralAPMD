import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CadastroLabel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField titulo;
    private JTextField sinopse;
    private JComboBox<String> genero;
    private ButtonGroup ondeAssistir;
    private JCheckBox assistido;
    private StarRater starRater;
	public CadastroLabel() {
		init();
	}
		private void init() {
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(30);
			setLayout(borderLayout);
	        add(Imagem(),BorderLayout.WEST);
	        add(digitaveis(), BorderLayout.CENTER);
	        add(botaoServico(), BorderLayout.EAST);
	        add(botoes(), BorderLayout.SOUTH);
		}
		private JPanel digitaveis() {
			JPanel digitaveis = new JPanel();
			digitaveis.setLayout(null);
			JLabel tituloTexto = new Titulos("Titulo");
			tituloTexto.setBounds(0,0,500,40);
			titulo = new JTextField();
			titulo.setBounds(0,35,200,30);
			digitaveis.add(tituloTexto);
			digitaveis.add(titulo);
			
			JLabel sinopseTexto = new Titulos("Sinopse");
			sinopseTexto.setBounds(0,55,200,40);
			sinopse = new JTextField();
			sinopse.setBounds(0,90,200,30);
			sinopse.setBorder(new LineBorder(Color.WHITE, 0));
			digitaveis.add(sinopseTexto);
			digitaveis.add(sinopse);
			
			JLabel generoTexto = new JLabel("Genero");
			generoTexto.setBounds(0,118,150,30);
			generoTexto.setFont(new Font(null, Font.BOLD, 15));
			genero = new JComboBox<>(new String[] {"Ação",
					"Anime",
					"Brasileiros",
					"Clássicos",
					"Comédia",
					"Comédia stand-up",
					"Comedia Dramatica",
					"Comedia Romantica",
					"Documentários",
					"Drama",
					"Esportes",
					"Estrangeiros",
					"Fantasia",
					"Fé e espiritualidade",
					"Ficção cientifica",
					"Hollywood",
					"Independentes",
					"LGBTQ",
					"Música e musicais",
					"Policial",
					"Premiados",
					"Terror",
					"Suspense",
					"Romance"});
			genero.setBounds(0,145,200,30);
			digitaveis.add(generoTexto);
			digitaveis.add(genero);
			
			return digitaveis;
		}
		
		private JPanel botaoServico() {
			JPanel botaoServico = new JPanel(new GridLayout(7, 1));
			botaoServico.setPreferredSize(new Dimension(170,100));
			ondeAssistir = new ButtonGroup();
			
			JLabel  ondeAssistirTexto = new JLabel("Onde assistir");
			ondeAssistirTexto.setFont(new Font(null, Font.BOLD, 15));
			botaoServico.add(ondeAssistirTexto);
			
			JRadioButton netflix = new JRadioButton("Netflix");
			netflix.setFont(new Font(null, Font.BOLD, 15));
			netflix.setActionCommand("Netflix");
			ondeAssistir.add(netflix);
			botaoServico.add(netflix);
			
			JRadioButton primeVideo = new JRadioButton("Prime Video");
			primeVideo.setFont(new Font(null, Font.BOLD, 15));
			primeVideo.setActionCommand("Prime Video");
			ondeAssistir.add(primeVideo);
			botaoServico.add(primeVideo);
			
			JRadioButton pirateBay = new JRadioButton("Pirate Bay");
			pirateBay.setFont(new Font(null, Font.BOLD, 15));
			pirateBay.setActionCommand("Pirate Bay");
			ondeAssistir.add(pirateBay);
			botaoServico.add(pirateBay);
			
			assistido = new JCheckBox("Assistido");
			assistido.setFont(new Font(null, Font.BOLD, 15));
			botaoServico.add(assistido);
			
			JLabel avaliacao = new JLabel("Avaliação");
			avaliacao.setFont(new Font(null, Font.BOLD, 15));
			botaoServico.add(avaliacao);
			starRater = new StarRater(5);
			botaoServico.add(starRater);
			return botaoServico;
		}
		
		private JPanel botoes() {
			JPanel botoes = new JPanel();
			JButton botaoSalvar = new JButton("Salvar");
			botaoSalvar.setPreferredSize(new Dimension(100,25));
			botaoSalvar.addActionListener(acaosalvar -> {
				Filme filme = new Filme();
				if(verificaDados()) {
				filme.setTitulo(titulo.getText());
				filme.setSinopse(sinopse.getText());
				filme.setServico(ondeAssistir.getSelection().getActionCommand());
				filme.setGenero((String)genero.getSelectedItem());
				filme.setAssistido(assistido.isSelected());
				filme.setAvaliacao(starRater.getSelection());
				JOptionPane.showMessageDialog(null, "Você selecionou o titulo " + titulo.getText() + "\n Você selecionou a sinopse " + sinopse.getText() + "\n Você selecionou " + ondeAssistir.getSelection().getActionCommand() + " como serviço de stream"   );
				System.out.println(filme);
				}
			});
			
			
			JButton botaoCancelar = new JButton("Cancelar");
			botaoCancelar.setPreferredSize(new Dimension(100,25));
			botaoCancelar.addActionListener(acaocancelar ->{
				titulo.setText("");
				sinopse.setText("");
				ondeAssistir.clearSelection();
		        assistido.setSelected(false);
		        starRater.setSelection(0);
			});
			botoes.add(botaoSalvar);		
			botoes.add(botaoCancelar);
			
			
			return botoes;
		}
		private JPanel Imagem() {
			JPanel panel = new JPanel();
			ImageIcon img = new ImageIcon(new ImageIcon("C:/Users/Canjicah/eclipse-workspace/teste/src/teste/iron_man.jpg").getImage().getScaledInstance(150, 180, Image.SCALE_AREA_AVERAGING));
			JLabel imagem = new JLabel(img);
			panel.add(imagem);
			return panel;
		}
		public boolean verificaDados() {
				
				if(titulo.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Digite o titulo desejado");
						System.out.println("ERROR - Digite o titulo desejado");
						return false;
				}
				if(sinopse.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite a sinopse desejada");	
					System.out.println("ERROR - Digite a sinopse desejada");
					return false;
				}
				if(ondeAssistir.getSelection() == null) {
					JOptionPane.showMessageDialog(null, "Selecione uma opção de serviço para assistir");
					System.out.println("ERROR - Selecione uma opção de serviço para assistir");
					return false;
				}
				if(genero.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Selecione uma opção de genero");
					System.out.println("ERROR - Selecione uma opção de genero");
					return false;
				}
				
				return true;
				
		}
		
}
