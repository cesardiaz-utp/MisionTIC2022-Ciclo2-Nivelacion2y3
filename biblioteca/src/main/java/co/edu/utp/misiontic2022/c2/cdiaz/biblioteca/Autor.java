package co.edu.utp.misiontic2022.c2.cdiaz.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;

    private List<Libro> libros;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;

        libros = new ArrayList<>();
    }

    public Autor(String nombre, String nacionalidad, Date fechaNacimiento) {
        this(nombre, nacionalidad);
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

}
