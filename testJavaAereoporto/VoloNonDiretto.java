package it.corso.esercitazioneFinale;
//Umberto Cangelosi
public class VoloNonDiretto extends Volo {
	private Aereoporto[] scali;
	private int contatore = 0;

	//Costruttori
	
	public VoloNonDiretto(String sigla, Aereoporto aereportoPartenza, Aereoporto aereoportoDestinazione,
			String aereomobile, int maxPasseggeri,int nMaxScali) {
		super(sigla, aereportoPartenza, aereoportoDestinazione, aereomobile, maxPasseggeri);
		this.scali = new Aereoporto[nMaxScali];
	}
	
	//Getter and setter
	public Aereoporto[] getScali() {
		return scali;
	}

	public void setScali(int nMaxScali) {
		this.scali = new Aereoporto[nMaxScali];
	}
	
	
	//un metodo che aggiunge uno scalo intermedio	
	public void aggiungiScalo(Aereoporto scalo) {
		if (contatore < scali.length) {
			scali[contatore] = scalo;
			contatore++;
		}
	}	
	
	@Override //scelgo di effettuare override del metodo toString() della classe Volo (dove ho fatto precedentemente l'override della classe object).
	
	public String toString(){
		String resultScali="";
		
        for (int i = 0; i < scali.length; i++) {
        	if(scali[i] instanceof Aereoporto){
        		resultScali += scali[i].getNome();
        		if (i < scali.length - 1) {
        			resultScali += " - ";
        		}
        	}  
        }
        
		String result = "Volo " + this.getSigla() + " " + this.getAereportoPartenza().getCittá() 
		+ " "+ this.getAereportoPartenza().getNome()+ " - " + this.getAereoportoDestinazione().getCittá() 
		+ " "+ this.getAereoportoDestinazione().getNome()+" via "+ resultScali;
		
		return result;
	}
}
