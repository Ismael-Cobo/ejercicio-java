import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private String nombre;
    private int edad;
    private String DNI;
    
    // contructor vacio
    public Usuario() {
    }
    
    /*
     Creamos el constructor con las variables necesarias
     @param nombre nombre del usuario
     @param edad edad del usuario
     @param DNI dni del usuario
     */
    public Usuario(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public boolean setDNI(String DNI) {
    
        Pattern pat = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = pat.matcher(DNI);
        if(!mat.matches()) {
            System.out.println("El dni es incorrecto");
            return false ;
        }
        
        this.DNI = DNI;
        return true;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}

