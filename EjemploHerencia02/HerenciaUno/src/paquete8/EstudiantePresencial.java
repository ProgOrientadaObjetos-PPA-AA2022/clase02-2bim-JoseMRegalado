package paquete8;

public class EstudiantePresencial extends Estudiante {

    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;

    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCred, double costoCred) {
        super(ap, iden, e); // ap = apellido // iden = identificacion // e = edad
        establecerNombresEstudiante(n);
        numeroCreditos = numCred;
        costoCredito = costoCred;
    }

    @Override
    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom.toLowerCase(); // Juan.toUpperCase() >> JUAN 
    }

    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Credito: %.2f\n"
                + "Número de Creditos: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());

        return cadenaFinal;
    }
}
