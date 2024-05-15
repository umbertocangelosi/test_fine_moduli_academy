package it.corso.esercitazioneFinale;
//Umberto Cangelosi
public class Passeggero {
	private String nome;
	private String nazionalitá;
	private String siglaVolo;
	private String postoAssegnato;
	private String tipoPasto;
	
	//Costruttori
	
	public Passeggero(String nome, String nazionalitá, String siglaVolo, String postoAssegnato, String tipoPasto) {
		this.nome = nome;
		this.nazionalitá = nazionalitá;
		this.siglaVolo = siglaVolo;
		this.postoAssegnato = postoAssegnato;
		this.tipoPasto = tipoPasto;
	}

	public Passeggero(String nome, String nazionalitá, String siglaVolo) {
		this(nome,nazionalitá,siglaVolo,"posto non disponibile", "tipo di pasto non disponibile");
	}

	//Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazionalitá() {
		return nazionalitá;
	}

	public void setNazionalitá(String nazionalitá) {
		this.nazionalitá = nazionalitá;
	}

	public String getSiglaVolo() {
		return siglaVolo;
	}

	public void setSiglaVolo(String siglaVolo) {
		this.siglaVolo = siglaVolo;
	}

	public String getPostoAssegnato() {
		return postoAssegnato;
	}

	public void setPostoAssegnato(String postoAssegnato) {
		this.postoAssegnato = postoAssegnato;
	}

	public String getTipoPasto() {
		return tipoPasto;
	}

	public void setTipoPasto(String tipoPasto) {
		this.tipoPasto = tipoPasto;
	}
	
	//metodo per l'assegnazione di un nuovo posto a un passeggero
	
	public void cambioPosto(String nuovoPosto){
		this.postoAssegnato = nuovoPosto;
	}
	
	
}
