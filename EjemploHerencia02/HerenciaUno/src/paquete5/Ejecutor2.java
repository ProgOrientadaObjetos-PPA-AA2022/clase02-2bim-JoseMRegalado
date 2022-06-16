
package paquete5;
import java.util.Locale;
import java.util.Scanner;
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese la identificacion del estudiante: ");
        String identificacion = sc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese el numero de creditos del estudiante: ");
        int numCreditos = sc.nextInt();
        System.out.print("Ingrese el costo del credito del estudiante: ");
        double costoCred = sc.nextDouble();
        System.out.println("");
                
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCred);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
