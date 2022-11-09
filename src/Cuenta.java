import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private final List<Gasto> gastos = new ArrayList<>();
    private final List<Ingreso> ingresos = new ArrayList<>();
    
    /*
     @param usuario el usuario de la cuenta
     inicializamos el saldo en 0
     añadimos el usuario
     */
    public Cuenta(Usuario usuario) {
        this.saldo = 0;
        this.usuario = usuario;
    }
    
    /*
       @param descripcion descripción del ingreso ha añadir
       @param cantidad dinero ha añadir al ingreso
       inicializamos la clase ingreso
       añadimos el ingreso a la lista de ingresos
       y sumamos la cantidad al saldo total
     */
    public void addIngresos(String descripcion, double cantidad) {
        Ingreso ingresoToAdd = new Ingreso(cantidad, descripcion);
        this.ingresos.add(ingresoToAdd);
        this.saldo += cantidad;
    }
    
    /*
       @param descripcion descripción del gasto ha añadir
       @param cantidad dinero ha añadir al gasto
       comprobamos que la cantidad no sea superior al saldo
       si es mayor devolvemos false
       @return false
       
       inicializamos la clase gasto
       añadimos el gasto a la lista de gastos
       y restamos la cantidad al saldo total
       
     */
    public void addGastos(String descripcion, double cantidad) {
        
        if(cantidad > saldo) {
            // TODO: Soltar la exception
            System.out.println("El saldo es insuficiente");
//            throw new GastoException("El saldo es insuficiente");
            return;
        }
        
        Gasto gastoToAdd = new Gasto(cantidad, descripcion);
        this.gastos.add(gastoToAdd);
        
        this.saldo -= cantidad;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public List<Gasto> getGastos() {
        return gastos;
    }
    
    public List<Ingreso> getIngresos() {
        return ingresos;
    }
    
    
    @Override
    public String toString() {
        return "El usuario " + usuario.getNombre() + " tiene " + this.saldo + "€";
    }
    
    
}
