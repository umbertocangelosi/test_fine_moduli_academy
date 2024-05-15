package it.corso;

import java.util.ArrayList;

/**
 * @author Umberto Cangelosi
 * Questa classe rappresenta uno studente.
 */
public class Studente {
    
    private String nome;
    private String cognome;
    private int matricola;
    private static int contatoreMatricola = 100000;
    private String annoImmatricolazione;
    private ArrayList<Corso> listaCorsi;

    /**
     * Costruttore per creare un nuovo studente.
     * 
     * @param nome Il nome dello studente.
     * @param cognome Il cognome dello studente.
     * @param annoImmatricolazione L'anno di immatricolazione dello studente.
     */
    
    public Studente(String nome, String cognome, String annoImmatricolazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoImmatricolazione = annoImmatricolazione;
        this.listaCorsi = new ArrayList<>();
        contatoreMatricola = ++contatoreMatricola;
        this.matricola = contatoreMatricola;
    }

    /**
     * Restituisce il nome dello studente.
     * 
     * @return Il nome dello studente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome dello studente.
     * 
     * @param nome Il nuovo nome dello studente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome dello studente.
     * 
     * @return Il cognome dello studente.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome dello studente.
     * 
     * @param cognome Il nuovo cognome dello studente.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce la matricola dello studente.
     * 
     * @return La matricola dello studente.
     */
    public int getMatricola() {
        return matricola;
    }

    /**
     * Restituisce l'anno di immatricolazione dello studente.
     * 
     * @return L'anno di immatricolazione dello studente.
     */
    public String getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    /**
     * Imposta l'anno di immatricolazione dello studente.
     * 
     * @param annoImmatricolazione Il nuovo anno di immatricolazione dello studente.
     */
    public void setAnnoImmatricolazione(String annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    /**
     * Aggiunge lo studente a un corso.
     * 
     * @param corso Il corso a cui iscrivere lo studente.
     */
    public void iscrizioneCorso(Corso corso) {
        this.listaCorsi.add(corso);
        corso.aggiuntaStudente(this);
    }

    /**
     * Rimuove lo studente da un corso.
     * 
     * @param corso Il corso da cui disiscrivere lo studente.
     */
    public void disiscrizioneCorso(Corso corso) {
        this.listaCorsi.remove(corso);
    }

    /**
     * Restituisce una rappresentazione in formato stringa dello studente.
     * 
     * @return Una stringa che rappresenta lo studente.
     */
    @Override
    public String toString() {
        return this.getNome() + " " + this.getCognome() + " , matricola: " + this.getMatricola();
    }
}
