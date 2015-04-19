package agenziaviaggi;

public class Cliente {
	
	private String nome;
	private String cognome;
	public Cliente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	

}
