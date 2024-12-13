package entities;

public abstract class Entidad {
    protected int id;
    protected String nombre;
    protected String equipo;

    public Entidad(int id, String nombre, String equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo= equipo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo(){
        return equipo;
    }

    public void setEquipo(String equipo){
        this.equipo=equipo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + "Equipo: "+getEquipo();
    }
}
