package co.edu.utp.misiontic2022.c2.cdiaz.empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nit;
    private String nombre;

    private List<Empleado> empleados;
    private List<Cliente> clientes;

    public Empresa() {
        this("0000000000", "Sin crear");
    }

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
