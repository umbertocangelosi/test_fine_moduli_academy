package it.corso.esercitazioneFinale;
//Umberto Cangelosi
public class TestVolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aereoporto MPX  = new Aereoporto("Malpensa","Milano","MPX");
		Aereoporto FCO = new Aereoporto("Fiumicino","Roma","FCO");
		Aereoporto PMO = new Aereoporto("Falcone e Borsellino","Palermo","PMO");
		Aereoporto PRG = new Aereoporto("S. Francesco d'Assisi","Perugia","PRG");
		
		System.out.println(MPX.getNome());
		System.out.println(PMO.getCittá());
		
		Passeggero passeggero1 = new Passeggero("Giuseppe Mirabella","Italiana","JKK","16F","standard");
		Passeggero passeggero2 = new Passeggero("Francesco Giordano","Italiana","JKK","13F","vegetariano");
		Passeggero passeggero3 = new Passeggero("Giuseppe Cangelosi","Italiana","JKK","12A","vegetariano");
		Passeggero passeggero4 = new Passeggero("Salvatore Giammanco","Italiana","JPP");
		
		passeggero4.setPostoAssegnato("12B");
		passeggero4.setTipoPasto("vegetariano");
		
		passeggero1.cambioPosto("14F");
		
		VoloNonDiretto JKK = new VoloNonDiretto("JKK",PMO,MPX,"B738",60,2);
		Volo JPP = new Volo("JPP",PMO,FCO,"B738",50);
		 
		
		JKK.aggiungiPasseggero(passeggero1);
		JKK.aggiungiPasseggero(passeggero2);
		JKK.aggiungiPasseggero(passeggero3);
		
		
		JKK.aggiungiScalo(FCO);
		JKK.aggiungiScalo(PRG);
		System.out.println(JKK.toString());
		
	}

}
