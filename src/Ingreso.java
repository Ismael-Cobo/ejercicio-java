public class Ingreso extends Dinero{
    
    /*
        Inicializamos el Ingreso
        @param ingreso el dinero que ingresamos
        @param description la descripcion del ingreso
     */
    public Ingreso(double ingreso, String description) {
        this.dinero = ingreso;
        this.description = description;
    }
    
    // Mostramos el ingreso en un string
    @Override
    public String toString() {
        return "Ingreso: " + this.description + ", cantidad " + this.dinero + "€";
    }
}
