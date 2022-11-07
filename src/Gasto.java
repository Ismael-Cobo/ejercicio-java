public class Gasto extends Dinero{
    
    
    /*
        Inicializamos el gasto
        @param gasto el dinero que gastamos
        @param descripcion la descripcion del gasto
     */
    public Gasto(double gasto, String descripcion) {
        this.dinero = gasto;
        this.descripcion = descripcion;
    }
    
    // Mostramos el gasto en un string
    @Override
    public String toString() {
        return "Ingreso: " + this.descripcion + ", cantidad " + this.dinero + "€";
    }
}
