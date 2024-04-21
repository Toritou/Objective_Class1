import java.util.List;
import java.util.Scanner;

public class medico {

    public static void verDatosPaciente(String rut, List<paciente> pacientes){
        boolean encontrado = false;
        for (paciente paciente : pacientes){
            if (paciente.getRut().equals(rut)){
                System.out.println("Datos del paciente: ");
                paciente.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Paciente no encontrado");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<paciente> pacientes = null;
        System.out.println("Ingrese el rut a buscar: ");

        String rut = scanner.nextLine();
        verDatosPaciente(rut, pacientes);

}