package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	} 
	
	public int getPostiDisponibili(){
		
		int postiDisponibili = postiTotali;
		for(int i=0; i<prenotazioni.size();i++){
			
			postiDisponibili = postiDisponibili - this.prenotazioni.get(i).getPostiRichiesti();
			
		}
		
		
		return postiDisponibili;
	}
	
	public void addPrenotazione(Prenotazione p){
		
		if(getPostiDisponibili() < p.getPostiRichiesti()){
			
			throw new IllegalArgumentException("posti insufficenti");
		}
		else{
			
			this.prenotazioni.addElement(p);
		
		}
		
	}

	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione 
				 				+ ", postiTotali=" + postiTotali + ",  prenotazioni=" 
				 				+ prenotazioni.size() + ", postiDisponibili=" 
				 				+ getPostiDisponibili() + "]"; 
				 	} 

	

}
