import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private String nombre;
    private int edad;
    private String DNI;
    
    // contructor vacio
    public Usuario() {
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
    
    /*
        @param DNI para añadir
        comprobamos que el dni es válido
        si no lo es devolvemos false
        si lo es lo añadimos y devolvemos true
     */
    public boolean setDNI(String DNI) {
    
        Pattern pat = Pattern.compile("[0-9]{8}-?[A-Z]");
        Matcher mat = pat.matcher(DNI);
        if(!mat.matches()) {
            System.out.println("DNI introducido incorrecto");
            return false ;
        }
        
        this.DNI = DNI;
        return true;
    }
    
    /*
        @return devuelve los valores del usuario
     */
    @Override
    public String toString() {
        return "Usuario: \n" +
                "Nombre: " + nombre + "\n"+
                "Edad: " + edad +"\n"+
                "DNI: " + DNI + "\n";
    }
}

