public class Gasto extends Dinero{
    
    
    /*
        Inicializamos el gasto
        @param gasto el dinero que gastamos
        @param description la descripcion del gasto
     */
    public Gasto(double gasto, String description) {
        this.dinero = gasto;
        this.description = description;
    }
    
    // Mostramos el gasto en un string
    @Override
    public String toString() {
        return "Gasto: " + this.description + ", cantidad " + this.dinero + "€";
    }
}
