package it.corso;

import java.util.HashMap;
import java.util.Map;

/*
 * Ho inteso che la consegna chiedeva di rappresentare la votazione di un singolo esame.
 * In caso contrario avrei lavorato con una HashMap contenente <String,List<Integer>>.
 */

/**
 * The StudentGrades class manages students' grades using a map.
 */
public class StudentGrades {

    private HashMap<String, Integer> grades;

    /**
     * Default constructor (set to public) that initializes the map of students' grades.
     */
    public StudentGrades() {
        grades = new HashMap<>();
    }

    /**
     * Returns the map of students' grades.
     * @return The map of students' grades.
     */
    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    /**
     * Returns the grade of the specified student.
     * @param studentName The name of the student to get the grade for.
     * @return The grade of the specified student, -1 if the student is not present.
     */
    
    // If the map does not contain the key, using the .containsKey method does not block the program 
    // because in that case the method automatically returns null.
    
    public int getGrade(String studentName) { 
        if (this.getGrades().containsKey(studentName)) { 
        	return this.getGrades().get(studentName);
        } else {
            return -1;
        }
    }

    /**
     * Adds a grade for the specified student.
     * @param studentName The name of the student.
     * @param grade The grade of the student.
     */
    public void addGrade(String studentName, int grade) {
        try {
            this.getGrades().put(studentName, grade);
        } catch (NullPointerException e) {
            System.err.println("Error: StudentName can't be null.");
        }
    }

    /**
     * Prints all the grades of the students present in the map.
     */
    public void printGrades() {
        this.getGrades().forEach((key, value) -> System.out.println("Student Name: " + key + ", Grade: " + value));
    }

    /**
     * Main method to test the StudentGrades class.
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        StudentGrades courseGrade = new StudentGrades();

        courseGrade.addGrade("Umberto", 7);
        courseGrade.addGrade("Francesco", 6);
        courseGrade.addGrade("Roberto", 8);

        System.out.println("Grade of Umberto: " + courseGrade.getGrade("Umberto"));
        System.out.println("Grade of Simone: " + courseGrade.getGrade("Simone"));

        System.out.println("----------");

        courseGrade.printGrades();
    }
}
