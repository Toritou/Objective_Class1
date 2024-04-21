import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRIMER_AVANCE {

    //--- Funcion para buscar pacientes dentro de una ArrayList de pacientes simulada ---//

    public static void buscarPaciente() {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Juan", "Pérez", "123456789", "123456789", "Av. Principal 123",
                "juan@gmail.com", "01/01/1990", "Masculino", "Soltero", "Ingeniero", "Fonasa", "O+",
                "Sin alergias", "Sin enfermedades crónicas", "Ninguno", "Observaciones: Ninguna"));
        pacientes.add(new Paciente("María", "González", "987654321", "987654321", "Calle Secundaria 456",
                "maria@gmail.com", "15/05/1985", "Femenino", "Casada", "Profesora", "Isapre", "A-",
                "Alergia a la penicilina", "Hipertensión", "Aspirina", "Observaciones: Controlar presión arterial"));
        pacientes.add(new Paciente("Pedro", "Rodríguez", "567890123", "567890123", "Plaza Central 789",
                "pedro@gmail.com", "10/11/1975", "Masculino", "Divorciado", "Abogado", "Fonasa", "B+",
                "Sin alergias", "Diabetes", "Insulina", "Observaciones: Dieta baja en azúcar"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el RUT del paciente a buscar:");
        String rutBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Paciente paciente : pacientes) {
            if (paciente.getRut().equals(rutBuscar)) {
                System.out.println("\nDatos del paciente encontrado:");
                paciente.mostrarDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Paciente no encontrado.");
        }
    }

    //--- Clase Paciente con atributos y metodo para mostrar informacion ---//
    static class Paciente {
        private final String nombre;
        private final String apellido;
        private final String rut;
        private final String telefono;
        private final String direccion;
        private final String correo;
        private final String fechaNacimiento;
        private final String genero;
        private final String estadoCivil;
        private final String ocupacion;
        private final String seguro;
        private final String tipoSangre;
        private final String alergias;
        private final String enfermedadesCronicas;
        private final String medicamentos;
        private final String observaciones;

        //--- Constructor para inicializar los datos del paciente ---//
        public Paciente(String nombre, String apellido, String rut, String telefono, String direccion, String correo,
                        String fechaNacimiento, String genero, String estadoCivil, String ocupacion, String seguro,
                        String tipoSangre, String alergias, String enfermedadesCronicas, String medicamentos,
                        String observaciones) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.rut = rut;
            this.telefono = telefono;
            this.direccion = direccion;
            this.correo = correo;
            this.fechaNacimiento = fechaNacimiento;
            this.genero = genero;
            this.estadoCivil = estadoCivil;
            this.ocupacion = ocupacion;
            this.seguro = seguro;
            this.tipoSangre = tipoSangre;
            this.alergias = alergias;
            this.enfermedadesCronicas = enfermedadesCronicas;
            this.medicamentos = medicamentos;
            this.observaciones = observaciones;
        }

    }
}