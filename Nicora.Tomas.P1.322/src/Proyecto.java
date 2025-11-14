
import java.util.Objects;

public abstract class Proyecto {
    protected String nombre;
    protected String equipoResponsable;
    protected EstadoActual estado;

    protected Proyecto(String nombre, String equipoResponsable, EstadoActual estado) {
        this.nombre = nombre;
        this.equipoResponsable = equipoResponsable;
        this.estado = estado;
    }
   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre= ").append(nombre);
        sb.append(System.lineSeparator());
        sb.append("EstadoActual= ").append(estado);
        sb.append(System.lineSeparator());
        sb.append("EquipoResponsable= ").append(equipoResponsable);
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipoResponsable() {
        return equipoResponsable;
    }
    
    public boolean tieneNombre(String nombre){
        return this.nombre.equals(nombre);
    }
    public boolean tieneEquipo(String equipoResponsable){
        return this.equipoResponsable.equals(equipoResponsable);
    }
    
    public void IntentarActualizarEstado(EstadoActual nuevoEstado){
        if(nuevoEstado != null){
            actualizarEstado(nuevoEstado);
        }else{
            throw new IllegalArgumentException("Estado nulo");
        }
    }

    private void actualizarEstado(EstadoActual nuevoEstado){
        StringBuilder sb = new StringBuilder();
            sb.append("Proyecto: ").append(nombre);
        if(nuevoEstado != estado){
            sb.append("\nEstado anterior: ").append(estado);
            sb.append("\nNuevo estado: ").append(nuevoEstado);
            estado = nuevoEstado;
            
        }else{
            sb.append("No fue posible actualizarlo");
        }
        
        System.out.println(sb);
    }

    abstract void intentarActualizar();

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proyecto other = (Proyecto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.nombre, other.estado);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.equipoResponsable);
        hash = 19 * hash + Objects.hashCode(this.estado);
        return hash;
    }
    
    

}
