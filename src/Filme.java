public class Filme {
	
	private String titulo;
	
	private String sinopse;
	
	private String genero;
	
	private String servico;
	
	private boolean assistido;
	
	private int avaliacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	@Override
	public String toString() {
		return "Filme\n "
				+ "Titulo: " + titulo + "\n"
				+ " Sinopse: " + sinopse +
				"\n Genero: " + genero + 
				"\n Serviço de stream escolhido: " + servico + 
				"\n Assistido: " + assistido + 
				"\n Avaliacao: " + avaliacao;
			}
}
