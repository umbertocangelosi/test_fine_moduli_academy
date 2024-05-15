package it.corso;

import java.util.ArrayList;

/**
 * @author Umberto Cangelosi
 * Questa classe rappresenta un'università.
 */
public class Universita {

    private ArrayList<Studente> listaStudenti;
    private ArrayList<Professore> listaProfessori;
    private ArrayList<Corso> listaCorsi;

    /**
     * Costruttore per creare una nuova istanza di Universita.
     */
    public Universita() {
        this.listaCorsi = new ArrayList<>();
        this.listaStudenti = new ArrayList<>();
        this.listaProfessori = new ArrayList<>();
    }

    /**
     * Registra un professore presso l'università.
     * 
     * @param professore Il professore da registrare.
     */
    public void registraProfessore(Professore professore) {
        this.listaProfessori.add(professore);
    }

    /**
     * Registra uno studente presso l'università.
     * 
     * @param studente Lo studente da registrare.
     */
    public void registraStudente(Studente studente) {
        this.listaStudenti.add(studente);
    }

    /**
     * Crea un nuovo corso presso l'università.
     * 
     * @param corso Il corso da creare.
     */
    public void creaCorso(Corso corso) {
        this.listaCorsi.add(corso);
    }

    /**
     * Assegna un professore a un corso presso l'università.
     * 
     * @param professore Il professore da assegnare.
     * @param corso Il corso al quale assegnare il professore.
     */
    public void assegnaProfessore(Professore professore, Corso corso) {
        professore.aggiuntaCattedra(corso);
        //corso.aggiuntaProfessore(professore);
    }

    /**
     * Iscrive uno studente a un corso presso l'università.
     * 
     * @param studente Lo studente da iscrivere.
     * @param corso Il corso al quale iscrivere lo studente.
     */
    public void iscriviStudente(Studente studente, Corso corso) {
        studente.iscrizioneCorso(corso);
        //corso.aggiuntaStudente(studente);
    }

    /**
     * Stampare l'elenco dei corsi, dei professori e degli studenti iscritti.
     */
    public void stamp() {
        System.out.println("\nelenco corsi: \n");
        for (Corso corso : this.listaCorsi) {
            System.out.println(corso.toString() + "\n");
        }
        System.out.println("\nelenco professori: \n");
        for (Professore professore : this.listaProfessori) {
            System.out.println(professore.toString() + "\n");
        }
        System.out.println("\nelenco studenti: \n");
        for (Corso corso : this.listaCorsi) {
            System.out.println("per il corso: " + corso.getTitolo() + "\n");
            System.out.println(corso.studentsToString());
        }
    }

    /**
     * Metodo main per testare le funzionalità dell'università.
     * 
     * @param args Argomenti della riga di comando (non utilizzati).
     */
    public static void main(String[] args) {

        Universita unipa = new Universita();

        Professore marcadante = new Professore("Francesco", "Mercadante");
        Professore bini = new Professore("Gilberto", "Bini");

        Corso basiDiDati = new Corso("Basi di Dati", 20);
        Corso analisi = new Corso("Analisi", marcadante, 10);

        Studente studente1 = new Studente("Francesco", "Auroldi", "2020");
        Studente studente2 = new Studente("Topolino", "Topo", "2020");
        Studente studente3 = new Studente("Paperino", "Papero", "2020");
        Studente studente4 = new Studente("Pluto", "Cane", "2024");
        Studente studente5 = new Studente("Pippo", "Cane", "2022");
        Studente studente6 = new Studente("Homer", "Simpson", "2022");
        Studente studente7 = new Studente("Jackie", "Welles", "2020");
        Studente studente8 = new Studente("Judy", "Alvarez", "2021");

        unipa.creaCorso(analisi);
        unipa.creaCorso(basiDiDati);

        unipa.registraProfessore(bini);
        unipa.registraProfessore(marcadante);

        unipa.assegnaProfessore(bini, analisi);
        unipa.assegnaProfessore(marcadante, basiDiDati);

        unipa.registraStudente(studente1);
        unipa.registraStudente(studente2);
        unipa.registraStudente(studente3);
        unipa.registraStudente(studente4);
        unipa.registraStudente(studente5);
        unipa.registraStudente(studente6);
        unipa.registraStudente(studente7);
        unipa.registraStudente(studente8);

        unipa.iscriviStudente(studente1, analisi);
        unipa.iscriviStudente(studente2, analisi);
        unipa.iscriviStudente(studente3, analisi);
        unipa.iscriviStudente(studente4, analisi);

        unipa.iscriviStudente(studente5, basiDiDati);
        unipa.iscriviStudente(studente6, basiDiDati);
        unipa.iscriviStudente(studente7, basiDiDati);

        unipa.stamp();
    }
}
