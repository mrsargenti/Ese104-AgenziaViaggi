package agenziaviaggi;

public class Prenotazione {
	
	private String codice;
	private int postiRichiesti;
	private Cliente c;
	private Filiale f;
    private Pacchetto p;
	
    public Prenotazione(String codice, int postiRichiesti, Cliente c, Filiale f) {
		super();
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.c = c;
		this.f = f;
		
		
	}

	
	public String getCodice() {
		return codice;
	}

	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	public Cliente getCliente() {
		return c;
	}

	public Filiale getFiliale() {
		return f;
	}

	public void setPacchetto(Pacchetto p) {
		this.p = p;
	}


	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", c=" + c + ", f=" + f + "]";
	}

	
	
	

}
