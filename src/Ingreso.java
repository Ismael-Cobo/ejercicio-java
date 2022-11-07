public class Ingreso extends Dinero{
    
    /*
        Inicializamos el Ingreso
        @param ingreso el dinero que ingresamos
        @param descripcion la descripcion del ingreso
     */
    public Ingreso(double ingreso, String descripcion) {
        this.dinero = ingreso;
        this.descripcion = descripcion;
    }
    
    // Mostramos el ingreso en un string
    @Override
    public String toString() {
        return "Gasto: " + this.descripcion + ", cantidad " + this.dinero + "€";
    }
}
