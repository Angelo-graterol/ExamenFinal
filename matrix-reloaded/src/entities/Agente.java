package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private String equipoActual;

    public Agente(int id, String nombre, String habilidadEspecial, String equipoActual) {
        super(id, nombre,equipoActual);
        this.habilidadEspecial = habilidadEspecial;
        this.equipoActual=equipo;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public void asignarEquipo(String equipoActual){
        this.equipoActual= equipo;
    }

  
   

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
