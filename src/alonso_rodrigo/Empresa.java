package alonso_rodrigo;

import java.util.ArrayList;


public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String razonSocial,int cuit){
        this.razonSocial=razonSocial;
        this.cuit=cuit;
        empleados=new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void mostrarEmpleados(){
        
    }
}
