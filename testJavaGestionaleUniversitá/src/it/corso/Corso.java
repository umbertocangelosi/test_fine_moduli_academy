package it.corso;

import java.util.ArrayList;

/**
 *  @author Umberto Cangelosi
 * Questa classe rappresenta un corso.
 */
public class Corso {

    private String titolo;
    private static int contatoreIdCorso = 0;
    private int idCorso;
    private Professore professoreTitolare;
    private ArrayList<Studente> studentiIscritti;
    private int maxIscritti;

    /**
     * Costruttore per creare un nuovo corso con un professore titolare.
     * 
     * @param titolo Il titolo del corso.
     * @param professoreTitolare Il professore titolare del corso.
     * @param maxIscritti Il numero massimo di studenti iscritti al corso.
     */
    public Corso(String titolo, Professore professoreTitolare, int maxIscritti) {
        this.titolo = titolo;
        this.professoreTitolare = professoreTitolare;
        this.maxIscritti = maxIscritti;
        contatoreIdCorso = contatoreIdCorso + 1;
        this.idCorso = contatoreIdCorso;
        this.studentiIscritti = new ArrayList<>();
    }

    /**
     * Costruttore per creare un nuovo corso senza professore titolare.
     * 
     * @param titolo Il titolo del corso.
     * @param maxIscritti Il numero massimo di studenti iscritti al corso.
     */
    public Corso(String titolo, int maxIscritti) {
        this.titolo = titolo;
        this.maxIscritti = maxIscritti;
        contatoreIdCorso = contatoreIdCorso++;
        this.idCorso = contatoreIdCorso;
        this.studentiIscritti = new ArrayList<>();
    }

    /**
     * Restituisce il titolo del corso.
     * 
     * @return Il titolo del corso.
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il titolo del corso.
     * 
     * @param titolo Il nuovo titolo del corso.
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce il professore titolare del corso.
     * 
     * @return Il professore titolare del corso.
     */
    public Professore getProfessoreTitolare() {
        return professoreTitolare;
    }

   
    /**
     * Restituisce il numero massimo di studenti iscritti al corso.
     * 
     * @return Il numero massimo di studenti iscritti al corso.
     */
    public int getMaxIscritti() {
        return maxIscritti;
    }

    /**
     * Imposta il numero massimo di studenti iscritti al corso.
     * 
     * @param maxIscritti Il nuovo numero massimo di studenti iscritti al corso.
     */
    public void setMaxIscritti(int maxIscritti) {
        this.maxIscritti = maxIscritti;
    }

    /**
     * Restituisce l'ID del corso.
     * 
     * @return L'ID del corso.
     */
    public int getIdCorso() {
        return idCorso;
    }

    /**
     * Restituisce la lista degli studenti iscritti al corso.
     * 
     * @return La lista degli studenti iscritti al corso.
     */
    public ArrayList<Studente> getStudentiIscritti() {
        return studentiIscritti;
    }

    /**
     * Aggiunge uno studente alla lista degli iscritti al corso.
     * 
     * @param studente Lo studente da aggiungere al corso.
     * @return Un messaggio che indica se l'aggiunta dello studente è riuscita o meno.
     */
    public String aggiuntaStudente(Studente studente) {
        if (studentiIscritti.size() < this.maxIscritti) {
            this.studentiIscritti.add(studente);
            return "Aggiunta studente " + studente.getMatricola() + " riuscita.";
        } else {
            return "Aggiunta studente " + studente.getMatricola() + " non riuscita, capienza massima del corso raggiunta";
        }
    }

    /**
     * Rimuove uno studente dalla lista degli iscritti al corso.
     * 
     * @param studente Lo studente da rimuovere dal corso.
     */
    public void rimozioneStudente(Studente studente) {
        this.studentiIscritti.remove(studente);
    }

    /**
     * Aggiunge un professore titolare al corso.
     * 
     * @param professore Il professore da aggiungere come titolare del corso.
     */
    public void setProfessoreTitolare(Professore professore) {
        if (this.professoreTitolare == null) {
            this.professoreTitolare = professore;
        }
    }

    /**
     * Rimuove il professore titolare dal corso.
     */
    public void rimozioneProfessore() {
        this.professoreTitolare = null;
    }

    /**
     * Restituisce una rappresentazione in formato stringa del corso.
     * 
     * @return Una stringa che rappresenta il corso.
     */
    @Override
    public String toString() {
        return this.getTitolo() + " , id del corso: " + this.getIdCorso() + " , professore: " + this.getProfessoreTitolare().toString();
    }

    /**
     * Restituisce una stringa che rappresenta gli studenti iscritti al corso.
     * 
     * @return Una stringa che rappresenta gli studenti iscritti al corso.
     */
    public String studentsToString() {
        String students = "";
        for (Studente studente : this.studentiIscritti) {
            students = students + studente.toString() + "\n";
        }
        return students;
    }
}
