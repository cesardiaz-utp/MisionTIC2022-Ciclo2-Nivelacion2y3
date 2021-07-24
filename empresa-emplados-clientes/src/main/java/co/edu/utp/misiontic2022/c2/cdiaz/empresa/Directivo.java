package co.edu.utp.misiontic2022.c2.cdiaz.empresa;

public class Directivo extends Empleado {
    private String categoria;

    private Empleado[] subordinados;
    private Integer numSubordinados;

    public Directivo(String nombre, Integer edad, Double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;

        subordinados = new Empleado[10];
        numSubordinados = 0;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", categoria = " + categoria;
    }

    public void addSubordinado(Empleado empleado) throws Exception {
        if(numSubordinados == 10){
            throw new Exception("No hay mas vacantes!!")
        }
        subordinados[numSubordinados] = empleado;
        empleado.setJefe(this);
        numSubordinados++;
    }

}
