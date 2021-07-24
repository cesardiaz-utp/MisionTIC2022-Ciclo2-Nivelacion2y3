package co.edu.utp.misiontic2022.c2.cdiaz.biblioteca;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Lector
 */
public class Lector {
    private Long numeroSocio;
    private String nombre;
    private Integer telefono;
    private String direccion;

    private Prestamo[] prestamos;
    private Integer numeroPrestamos;

    private Multa multa;

    public Lector(Long numeroSocio, String nombre, Integer telefono, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;

        prestamos = new Prestamo[3];
        numeroPrestamos = 0;
    }

    public void devolver(Prestamo prestamo) {

    }

    public void prestar(Copia libro, Integer dias) {
        Date hoy = new Date();

        prestamos[numeroPrestamos] = new Prestamo(this, libro, hoy, dias);
    }

    public void multar() {
        Date hoy = new Date();

        var cal = new GregorianCalendar();
        cal.setTime(hoy);
        cal.add(Calendar.DAY_OF_YEAR, 3);
        var fechaFinal = cal.getTime();

        multa = new Multa(this, hoy, fechaFinal);
    }

}