import java.util.Scanner;

public class Main {
    
    // Creamos la variable cuenta para usarla en el archivo main
    static Cuenta cuenta;
    
    // Inicializamos la cuenta creando un usuario
    // Llamamos al menu para seleccionar lo que queremos hacer
    public static void main(String[] args) {
    
        cuenta = new Cuenta(userInit());
        menu();
        
    }
    
    // Creamos el menu con sus opciones
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("""
                Realiza una nueva acción
                
                1 Introduce un nuevo gasto
                2 Introduce un nuevo ingreso
                3 Mostrar gastos
                4 Mostrar ingresos
                5 Mostrar saldo
                6 salir
                """);
        
        String inputText = scanner.nextLine();
    
        switch (inputText) {
            case "1" -> addGasto();
            case "2" -> addIngreso();
            case "3" -> mostrarGasto();
            case "4" -> mostrarIngreso();
            case "5" -> mostrarSaldo();
            case "6" -> {
                System.out.println("""
                    Fin del programa.
                    Gracias por utilizar la aplicación de M03B en el curso 1s2223.
                    """);
                System.exit(0);
            }
            default -> System.exit(0);
            
        }
    
        menu();
        
    }
    
    // Inicializamos el usuario
    public static Usuario userInit() {
        Scanner scanner = new Scanner(System.in);
    
        Usuario usuario = new Usuario();
        System.out.println("Introduce el nombre de usuario:");
    
        String inputText = scanner.nextLine();
        usuario.setNombre(inputText);
    
        System.out.println("Introduce el la edad del usuario:");
    
        inputText = scanner.nextLine();
        usuario.setEdad(Integer.parseInt(inputText));
    
        System.out.println("Introduce el DNI del usuario:");
    
        inputText = scanner.nextLine();
        boolean isDniValid = usuario.setDNI(inputText);
        while (!isDniValid) {
            System.out.println("Introduce el DNI del usuario válido:");
    
            inputText = scanner.nextLine();
            isDniValid = usuario.setDNI(inputText);
        }
        System.out.println("Usuario creado correctamente");
//        System.out.println(usuario.toString());
        return usuario;
        
    }
    
    //Creamos el ingreso y lo añadimos
    public static void addIngreso() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Introduce la descripción");
    
        String inputDescripcion = scanner.nextLine();
    
        System.out.println("Introduce la cantidad");
    
        double inputIngreso = Double.parseDouble(scanner.nextLine());
        
        cuenta.addIngresos(inputDescripcion, inputIngreso);
    
        mostrarSaldo();
        
    }
    //Creamos el gasto y lo añadimos
    public static void addGasto() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Introduce la descripción");
    
        String inputDescripcion = scanner.nextLine();
    
        System.out.println("Introduce la cantidad");
    
        double inputGasto = Double.parseDouble(scanner.nextLine());
    
        cuenta.addGastos(inputDescripcion, inputGasto);
    
        mostrarSaldo();
    
    }
    
    // Mostramos el gasto
    public static void mostrarGasto() {
        cuenta.getGastos()
                .forEach( gasto -> System.out.println(gasto.toString()));
    
    }
    
    
    // Mostramos el ingreso
    public static void mostrarIngreso() {
        cuenta.getIngresos()
                .forEach(ingreso -> System.out.println(ingreso.toString()));
    }
    
    // Mostramos el sueldo total
    public static void mostrarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldo()+ "€");
    }
    
    
}