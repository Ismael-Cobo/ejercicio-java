import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private final List<Gasto> gastos = new ArrayList<>();
    private final List<Ingreso> ingresos = new ArrayList<>();
    
    public Cuenta(Usuario usuario) {
        this.saldo = 0;
        this.usuario = usuario;
    }
    
    public void addIngresos(String descripcion, double cantidad) {
        Ingreso ingresoToAdd = new Ingreso(cantidad, descripcion);
        this.ingresos.add(ingresoToAdd);
        this.saldo += cantidad;
    }
    public void addGastos(String descripcion, double cantidad) {
        
        if(cantidad > saldo) {
            // TODO: Soltar la exception
            System.out.println("El saldo es insuficiente");
//            throw new GastoException("El saldo es insuficiente");
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
