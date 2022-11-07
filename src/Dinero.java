

public abstract class Dinero {

    // El dinero que se usará para la transacción
    double dinero;
    
    // La descripción que se usará para la transacción
    String descripcion;
    
    /*
        Método para recupeara el dinero
        @return El dinero
     */
    public double getDinero() {
        return dinero;
    }
    /*
        @param dinero
        para setear el dinero
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    /*
        Método para recupeara la descripción
        @return El dinero
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    
    /*
        @param descripcion
        para setear la descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
