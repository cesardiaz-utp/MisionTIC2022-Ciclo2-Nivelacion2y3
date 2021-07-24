package co.edu.utp.misiontic2022.c2.cdiaz.empresa;

public class Cliente extends Persona {
    private String telefonoContacto;

    public Cliente(String name, Integer age, String telefonoContacto) {
        super(name, age);
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", telefono contacto=" + telefonoContacto;
    }

}
