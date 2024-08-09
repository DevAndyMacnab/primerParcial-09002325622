/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerparcial;

/**
 *
 * @author Andy Macnab
 */
public class PrimerParcial {

    public static void main(String[] args) {
        // Crear Catedráticos
        Catedratico catedratico1 = new Catedratico("Juan Pérez", "Petapa", "342342", "Licenciada");
        Catedratico catedratico2 = new Catedratico("Luz Maria", "Ciudad de Guatemala", "67867123", "Ingeniero");
        Catedratico catedratico3 = new Catedratico("Manuel Ramirez", "Amatitlan", "12345678", "Ingeniero");

        // Instanciar cursos
        Curso curso1 = new Curso(1, "Programación", 30,3,catedratico1);
        Curso curso2 = new Curso(2, "Contabilidad 2", 20,5,catedratico2);
        Curso curso3 = new Curso(3, "Logica de Sistemas", 40,6,catedratico3);

        // Instanciar alumnos
        Alumno alumno1 = new Alumno("Ana García", "Zona 21");
        Alumno alumno2 = new Alumno("Andy Macnab", "Zona 18 de Mixco");
        Alumno alumno3 = new Alumno("Alex Jimenez", "Villa Nueva");

        // Crear asignaciones
        Asignacion asignacion1 = new Asignacion(alumno1, curso1);
        Asignacion asignacion2 = new Asignacion(alumno1, curso2);
        Asignacion asignacion3 = new Asignacion(alumno1, curso3);
        
        Asignacion asignacion6 = new Asignacion(alumno2, curso1);
        Asignacion asignacion5 = new Asignacion(alumno2, curso2);
        Asignacion asignacion4 = new Asignacion(alumno2, curso3);
        
        Asignacion asignacion7 = new Asignacion(alumno3, curso1);
        Asignacion asignacion8 = new Asignacion(alumno3, curso2);
        Asignacion asignacion9 = new Asignacion(alumno3, curso3);
    }
}
