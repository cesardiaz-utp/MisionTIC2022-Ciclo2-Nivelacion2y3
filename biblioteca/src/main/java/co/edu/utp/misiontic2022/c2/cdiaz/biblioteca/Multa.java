package co.edu.utp.misiontic2022.c2.cdiaz.biblioteca;

import java.util.Date;

public class Multa {
    private Date fechaInicio;
    private Date fechaFinal;

    private Lector lector;

    public Multa(Lector lector, Date fechaInicio, Date fechaFinal) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.lector = lector;
    }
    
    
}
