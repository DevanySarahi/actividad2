import java.util.Scanner;

class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    // Método para obtener la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        System.out.print("Ingrese la matrícula del estudiante: ");
        String matricula = scanner.nextLine();

        // Crear un objeto de la clase Estudiante con los datos ingresados
        Estudiante estudiante1 = new Estudiante(nombre, edad, matricula);
        
        // Mostrar información del estudiante
        estudiante1.mostrarInformacion();

        scanner.close();
    }
}
