package it.corso.esercitazioneFinale;
//Umberto Cangelosi
public class Volo {
	private String sigla;
	private Aereoporto aereoportoPartenza;
	private Aereoporto aereoportoDestinazione;
	private String aereomobile;
	private Passeggero[] elencoPasseggeri;
	private int contatore = 0;
	
	//Costruttori
	
	public Volo(String sigla, Aereoporto aereportoPartenza, Aereoporto aereoportoDestinazione, String aereomobile,int maxPasseggeri) {

		this.sigla = sigla;
		this.aereoportoPartenza = aereportoPartenza;
		this.aereoportoDestinazione = aereoportoDestinazione;
		this.aereomobile = aereomobile;
		this.elencoPasseggeri = new Passeggero[maxPasseggeri];
	}

	public Volo(String sigla, Aereoporto aereportoPartenza, Aereoporto aereoportoDestinazione) {
		this.sigla = sigla;
		this.aereoportoPartenza = aereportoPartenza;
		this.aereoportoDestinazione = aereoportoDestinazione;
	}
	
	// Getters and Setters

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getAereomobile() {
		return aereomobile;
	}

	public void setAereomobile(String aereomobile) {
		this.aereomobile = aereomobile;
	}

	public Aereoporto getAereoportoDestinazione() {
		return aereoportoDestinazione;
	}

	public void setAereoportoDestinazione(Aereoporto aereoportoDestinazione) {
		this.aereoportoDestinazione = aereoportoDestinazione;
	}

	public Aereoporto getAereportoPartenza() {
		return aereoportoPartenza;
	}

	public void setAereportoPartenza(Aereoporto aereportoPartenza) {
		this.aereoportoPartenza = aereportoPartenza;
	}

	public Passeggero[] getElencoPasseggeri() {
		return elencoPasseggeri;
	}

	
	
	//metodo per aggiungere un passeggero al volo
	public void aggiungiPasseggero(Passeggero passeggero) {
		if (contatore < elencoPasseggeri.length) {
			elencoPasseggeri[contatore] = passeggero;
			contatore++;
		}
	}	
		
	//un metodo che restituisce una stringa che descrive un volo tramite sigla del volo, città e 
	//nome dell’aereoporto di partenza e città e nome dell’aereoporto di destinazione, 
	//ad esempio "Volo AZ108 Roma Fiumicino - Londra Heathrow";
	
	@Override //scelgo di effettuare override del metodo toString() di Object
	public String toString() {
		String result = "Volo " + this.sigla + " " + this.aereoportoPartenza.getCittá() 
		+ " "+ this.aereoportoPartenza.getNome()+ " - " + this.aereoportoDestinazione.getCittá() 
		+ " "+ this.aereoportoDestinazione.getNome();
		
		return result;
	}
	
	//metodo che restituisce l’elenco dei nomi dei passeggeri di un volo
	public String[] elencoPasseggeriVolo() {
		int contatoreP = 0;
		String[] elencoNomiPasseggeri = new String[elencoPasseggeri.length];
		for (Passeggero i: elencoPasseggeri) {
			if(i instanceof Passeggero) {
				elencoNomiPasseggeri[contatoreP]=i.getNome();
				contatoreP++;
			}
			}
		return elencoNomiPasseggeri;
	}
	
	//metodo che restituisce l’elenco dei posti dei passeggeri che hanno richiesto un pasto vegetariano
	public String[] elencoPostiVeg() {
		int contatoreP = 0;
		String[] elencoNomiPasseggeri = new String[elencoPasseggeri.length];
		for (Passeggero i: elencoPasseggeri) {
			if(i instanceof Passeggero) {
				if(i.getTipoPasto()=="vegetariano") {
					elencoNomiPasseggeri[contatore]=i.getPostoAssegnato();
					contatoreP++;
				}
			}
		}
		return elencoNomiPasseggeri;
	
}
}
	



	

