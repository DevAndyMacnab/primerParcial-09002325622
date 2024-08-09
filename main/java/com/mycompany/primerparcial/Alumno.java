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
 * Clase que representa a un Alumno.
 */
public class Alumno {
    private static int contadorCarnets = 1;
    private int carnet;
    private String nombre;
    private String direccion;

    public Alumno(String nombre, String direccion) {
        this.carnet = contadorCarnets++;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
}
