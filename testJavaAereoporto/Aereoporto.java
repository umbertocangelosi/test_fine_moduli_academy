package it.corso.esercitazioneFinale;
//Umberto Cangelosi
public class Aereoporto {
	private String nome;
	private String cittá;
	private String sigla;
	
	//Costruttori
	public Aereoporto(String nome, String cittá, String sigla) {
		super();
		this.nome = nome;
		this.cittá = cittá;
		this.sigla = sigla;
	}

	public Aereoporto(String cittá, String sigla) {
		this("nome non inserito",cittá,sigla);
		
	}
	
	public Aereoporto(String sigla) { 
		this("nome non inserito","cittá non inserita",sigla);
	}

	//Getters e setters
	
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCittá() {
		return cittá;
	}

	public void setCittá(String cittá) {
		this.cittá = cittá;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
