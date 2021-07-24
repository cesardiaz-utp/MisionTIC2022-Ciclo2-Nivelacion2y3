package co.edu.utp.misiontic2022.c2.cdiaz.biblioteca;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Prestamo {
    private Date inicio;
    private Date fin; // Fecha devolucion

    private Copia copia;
    private Lector lector;

    public Prestamo(Lector lector, Copia libro, Date fecha, Integer dias) {
        this.lector = lector;
        this.copia = libro;
        this.inicio = fecha;

        copia.setEstado(EstadoCopia.PRESTAMO);

        var cal = new GregorianCalendar();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, dias);
        this.fin = cal.getTime();
    }
}
