package com.mycompany.datos_estudiante;

public class Datos_Estudiante {

    public static void main(String[] args) {
        // crear instancias de Estudiante
        Estudiante primerestudiante = new Estudiante("Juan", 16, 1, "Software", null);
        Estudiante segundoestudiante = new Estudiante("Martha", 19, 5, "Mecánica", "martha@espe.edu.ec");
        Estudiante tercerestudiante = new Estudiante("Carlos", 17, 3, "Electrónica", null);
        Estudiante cuartoestudiante = new Estudiante("Patricia", 20, 8, "Petroquímica", "patty@espe.edu.ec");
        // imprimir la informacion de los estudiantes
        primerestudiante.imprimirInformacion();
        segundoestudiante.imprimirInformacion();
        tercerestudiante.imprimirInformacion();
        cuartoestudiante.imprimirInformacion();
        
    }
}
