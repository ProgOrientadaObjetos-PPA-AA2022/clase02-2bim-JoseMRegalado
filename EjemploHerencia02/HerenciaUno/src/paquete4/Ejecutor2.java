/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "José";
        String apellido = "Regalado";
        String identificacion = "1104857071";
        int edad = 19;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(50);
        estPresencial.establecerNumeroCreditos(30);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
