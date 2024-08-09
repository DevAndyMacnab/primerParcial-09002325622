/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial;

/**
 *
 * @author Andy Macnab
 */
/**
 * Clase que representa un Curso.
 */
public class Curso {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public int getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(int alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }
    private String titulo;
    private int maxAlumnos;
    private int alumnosInscritos;
    private Catedratico catedratico;
    private int creditos;
    
          

    public Curso(int id, String titulo,int creditos, int maxAlumnos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.maxAlumnos = maxAlumnos;
        this.alumnosInscritos = 0;
        this.catedratico = catedratico;
        this.creditos = creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public boolean verificaEspacio() {
        return alumnosInscritos < maxAlumnos;
    }
}
