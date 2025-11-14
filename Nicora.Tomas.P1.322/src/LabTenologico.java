
import java.util.ArrayList;

public class LabTenologico {
    private ArrayList<Proyecto> proyectos = new ArrayList<>();
    
    
    public void agregarProyecto(Proyecto p){
        if(!proyectos.isEmpty()){            
            for (Proyecto proyecto : proyectos) {
                boolean mismoNombre = proyecto.tieneNombre(p.getNombre());
                boolean mismoEquipo = proyecto.tieneEquipo(p.getEquipoResponsable());

                if (mismoNombre && mismoEquipo) {
                    throw new ProyectoAlreadyExist("El proyecto ya está en curso con ese equipo responsable");
                }
            }
        }

        proyectos.add(p);
   
    }
    
    public void mostrarProyectos(){
        System.out.println("    PROYECTOS");
        System.out.println("_____________________");
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.toString());
        }
    }
    
    public void actualizarResultados(){
        for(Proyecto p : proyectos){
            p.intentarActualizar();
        }
    }
    
    
    public void actualizarEstado(EstadoActual nuevoEstado){
        for(Proyecto p : proyectos){
            p.IntentarActualizarEstado(nuevoEstado);
        }
    }
    
}
