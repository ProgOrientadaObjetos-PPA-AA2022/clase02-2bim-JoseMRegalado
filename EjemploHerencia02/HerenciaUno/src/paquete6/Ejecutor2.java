
package paquete6;
import java.util.*;

public class Ejecutor2 {
    public static void main(String[] args) {
        String cadena="";
        String pregunta="";
        
        do{
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

            
            System.out.println("Desea ingresar más estudiantes. Digite la letra"
                    + " S para continuar o digite la letra N para salir");
            sc.nextLine(); 
            pregunta = sc.nextLine();
            cadena = String.format("%s%s\n", cadena, estPresencial);
            
            
        }while(pregunta.equals("S"));
        System.out.println(cadena);
    }
    
    
}
