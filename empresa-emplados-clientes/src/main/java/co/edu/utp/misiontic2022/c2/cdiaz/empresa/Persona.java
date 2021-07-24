package co.edu.utp.misiontic2022.c2.cdiaz.empresa;

public abstract class Persona {

    // Atributos
    private String nombre;
    private Integer edad;

    // Constructores
    public Persona(String name, Integer age){
        nombre = name;
        edad = age;
    }

    // Métodos
    public String mostrar() {
        return String.format("nombre=%s, edad=%d", nombre, edad);

        //"nombre = "+nombre+" edad =0...";
        //f"nombre = {nombre} edad = {edad}"; NO EXISTE
        //"nombre = {} edad = {}".format(nombre, edad) NO EXISTE
        //"nombre = %s edad = %d" % (nombre, edad);
    }

}
