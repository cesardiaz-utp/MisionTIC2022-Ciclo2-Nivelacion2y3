package co.edu.utp.misiontic2022.c2.cdiaz.biblioteca;

public class Copia {
    private Long id;
    
    private EstadoCopia estado;
    private Libro libro; 
    private Prestamo prestamo;

    public void setEstado(EstadoCopia estado) {
        this.estado = estado;
    }

}
