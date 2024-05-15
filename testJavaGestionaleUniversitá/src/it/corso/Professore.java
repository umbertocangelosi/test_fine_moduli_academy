package it.corso;

import java.util.ArrayList;

/**
 * @author Umberto Cangelosi
 * Questa classe rappresenta un professore.
 */
public class Professore {
    
    private String nome;
    private String cognome;
    private int idProfessore;
    private static int contatoreID = 100;
    private ArrayList<Corso> listaCattedre;

    /**
     * Costruttore per creare un nuovo professore.
     * 
     * @param nome Il nome del professore.
     * @param cognome Il cognome del professore.
     */
    public Professore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaCattedre = new ArrayList<>();
        contatoreID = ++contatoreID;
        this.idProfessore = contatoreID;
    }

    /**
     * Restituisce il nome del professore.
     * 
     * @return Il nome del professore.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del professore.
     * 
     * @param nome Il nuovo nome del professore.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome del professore.
     * 
     * @return Il cognome del professore.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome del professore.
     * 
     * @param cognome Il nuovo cognome del professore.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Aggiunge un corso alla lista delle cattedre del professore.
     * 
     * @param corso Il corso da aggiungere.
     */
    public void aggiuntaCattedra(Corso corso) {
        this.listaCattedre.add(corso);
        corso.setProfessoreTitolare(this);
    }
    
    /**
     * Rimuove un corso dalla lista delle cattedre del professore.
     * 
     * @param corso Il corso da rimuovere.
     */
    public void rimozioneCattedra(Corso corso) {
        this.listaCattedre.remove(corso);
        corso.rimozioneProfessore();
    }
    
    /**
     * Restituisce una rappresentazione in formato stringa del professore.
     * 
     * @return Una stringa che rappresenta il professore.
     */
    @Override
    public String toString() {
        return this.getNome() + " " + this.getCognome() + " , id: " + this.idProfessore;
    }
}
