package co.edu.utp.misiontic2022.c2.cdiaz.empresa;

public class Empleado extends Persona {
    private Double sueldoBruto;

    private Directivo jefe;

    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", sueldo = " + sueldoBruto;
    }

    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
    }

}
