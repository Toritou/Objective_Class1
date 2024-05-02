import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);

        menu.mostrar();

        scanner.close();
    }
}

class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        int opcion;

        do {
            mostrarOpciones();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    new PacienteMenu(scanner).mostrar();
                    break;
                case 2:
                    new MedicoMenu(scanner).mostrar();
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

    private void mostrarOpciones() {
        System.out.println("Menú:");
        System.out.println("1. Paciente");
        System.out.println("2. Médico");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int leerOpcion() {
        int opcion = -1;

        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        return opcion;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}

class PacienteMenu {
    private Scanner scanner;

    public PacienteMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        int opcion;

        do {
            mostrarOpciones();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agendarHora();
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

    private void mostrarOpciones() {
        System.out.println("\nMenú de Paciente:");
        System.out.println("1. Agendar hora");
        System.out.println("0. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private int leerOpcion() {
        int opcion = -1;

        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        return opcion;
    }

    private void agendarHora() {
        System.out.println("Agendando hora...");
        // Aquí va la lógica para que el paciente agende su hora
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}

class MedicoMenu {
    private Scanner scanner;

    public MedicoMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        int opcion;

        do {
            mostrarOpciones();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    eliminarHora();
                    break;
                case 2:
                    cambiarHora();
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

    private void mostrarOpciones() {
        System.out.println("\nMenú de Médico:");
        System.out.println("1. Eliminar hora");
        System.out.println("2. Cambiar hora");
        System.out.println("0. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
    }

    private int leerOpcion() {
        int opcion = -1;

        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        return opcion;
    }

    private void eliminarHora() {
        System.out.println("Eliminando hora...");
        // Aquí va la lógica para que el médico elimine una hora
    }

    private void cambiarHora() {
        System.out.println("Cambiando hora...");
        // Aquí va la lógica para que el médico cambie una hora
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
