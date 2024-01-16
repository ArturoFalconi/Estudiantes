package com.mycompany.datos_estudiante;

class Estudiante extends Persona {
    int nivel;
    String carrera;

    // constructor de Estudiante
    public Estudiante(String nombre, int edad, int nivel, String carrera, String email) {
        super(nombre, edad, email);
        this.nivel = nivel;
        this.carrera = carrera;
    }
    // imprimir la informacion del estudiante
    public void imprimirInformacion() {
        System.out.println("Estudiante {Nombre: " + nombre +
                "; Email: " + (email != null ? email : "email no proporcionado") +
                "; Edad: " + (edad != -1 ? edad : "No definida") +
                "; Nivel: " + nivel +
                "; Carrera: \"" + carrera + "\"}");
    }
    
}
