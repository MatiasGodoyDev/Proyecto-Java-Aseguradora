package entidades;
import java.util.Scanner;

public class Cobertura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener entrada del usuario
        Scanner scanner = new Scanner(System.in);

        boolean salir = false; // Variable para controlar si se debe salir del programa
        while (!salir) { // Bucle principal

            // Mostrar opciones de cobertura con explicaciones
            System.out.println("Opciones de Cobertura:");
            System.out.println("1. Cobertura Basica");
            System.out.println("2. Cobertura Amplia");
            System.out.println("3. Cobertura Amplia Plus");
            System.out.println("4. Cobertura Premium");
            System.out.println("5. Explicaciones de las coberturas" );
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");

            // Leer la elección del usuario
            int opcion = scanner.nextInt();

            // Determinar la acción según la elección del usuario
            switch (opcion) {
                case 1:
                    mostrarCobertura("Cobertura Basica");
                    break;
                case 2:
                    mostrarCobertura("Cobertura Amplia");
                    break;
                case 3:
                    mostrarCobertura("Cobertura Amplio Plus");
                    break;
                case 4:
                    mostrarCobertura ("Cobertura Premium");
                    break;
                case 5:
                    mostrarExplicaciones();
                    break;
                case 6:
                    salir = true; // Salir del bucle y terminar el programa
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para mostrar la descripción de una cobertura
    private static void mostrarCobertura(String cobertura) {
        System.out.println("Has seleccionado la siguiente Cobertura Deseada: " + cobertura);
    }

    // Método para mostrar las explicaciones de las coberturas
    private static void mostrarExplicaciones() {
        System.out.println("Explicacion de las Coberturas:");
        System.out.println("1. Basica: Aqui se ofrecen las mismas coberturas que el de Responsabilidad Civil, sin embargo, incluye beneficios adicionales: \n" +"Robo total del auto. \n" +"Auxilio vial si se te poncha una llanta, necesitas gasolina o una grua.");
        System.out.println("2.Amplia: Engloba las protecciones de los seguros de responsabilidad civil y cobertura limitada, ademas de daños a tu auto como resultado de un accidente. ");
        System.out.println("3.Amplio Plus: Este paquete incluye todos los beneficios mencionados anteriormente y auxilio vial ilimitado, daños por terceros sin seguro, afectaciones a tus llantas e incluye auto sustituto en caso de que el tuyo quede inutilizado por reparaciones. ");
        System.out.println("4. Premium: Las coberturas de este seguro son obligatorias para todos los autos por ley. Asimismo, ante cualquier siniestro, el seguro de daños a terceros cubre los siguientes aspectos:\n" +"Daños provocados a los autos o pertenencias de terceras personas (casa, auto o negocio).\n" +"Daños fisicos o fallecimiento de otras personas.\n" +"Asistencia legal.\n" +"Reparaciones a los autos de otras personas en caso de que tengas un accidente mientras manejas un carro que no sea el tuyo.\n" +"Servicios medicos para ti y las personas viajando en tu auto en caso de accidente. ");
        System.out.println("Presiona Enter para volver al menú principal...");
        new Scanner(System.in).nextLine(); // Esperar hasta que el usuario presione Enter
    }
}
