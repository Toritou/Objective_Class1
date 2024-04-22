import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Paciente");
            System.out.println("2. Médico");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    PacienteMenu pacienteMenu = new PacienteMenu();
                    pacienteMenu.mostrarMenu();
                    break;
                case 2:
                    MedicoMenu medicoMenu = new MedicoMenu();
                    medicoMenu.mostrarMenu();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}

class PacienteMenu {
    private Scanner scanner;

    public PacienteMenu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\nMenú de Paciente:");
            System.out.println("1. Agendar hora");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para que el paciente agende su hora
                    System.out.println("Agendando hora...");
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}

class MedicoMenu {
    private Scanner scanner;

    public MedicoMenu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\nMenú de Médico:");
            System.out.println("1. Eliminar hora");
            System.out.println("2. Cambiar hora");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para que el médico elimine una hora
                    System.out.println("Eliminando hora...");
                    break;
                case 2:
                    // Lógica para que el médico cambie una hora
                    System.out.println("Cambiando hora...");
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
