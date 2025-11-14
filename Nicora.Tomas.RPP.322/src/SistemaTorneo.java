
import java.util.ArrayList;

public class SistemaTorneo {
    private ArrayList<Jugador> jugadores;

    public SistemaTorneo() {
        jugadores = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador){
        if(!jugadores.isEmpty()){
            if(!jugadores.contains(jugador)){
                jugadores.add(jugador);
            }{
            throw new JugadorDuplicadoException("Jugador ya ");
        }
        }else{
            jugadores.add(jugador);
        }
    }
    
    public void mostrarJugadores(){
        if(!jugadores.isEmpty()){
            for(Jugador j : jugadores){
                System.out.println(j.toString());
            }
        }else{
            System.out.println("No hay jugadores registrados");
        }
    }
    
    public void sacar(){
        for(Jugador j : jugadores){
            j.intentarRealizarSaque();
        }
    }
    
    public void practicarEnPareja(){
        for(Jugador j : jugadores){
            j.intentarPracticarEnPareja();
        }
    }
    
    
    public ArrayList<Jugador> filtrarPorSuperficie(Superficie s){
        ArrayList<Jugador> listaFiltrada = new ArrayList<>();
        
        for(Jugador j : jugadores){
            if(j.getSuperficiePreferida().equals(s)){
                listaFiltrada.add(j);
            }
        }
        return listaFiltrada;
    }
    
    public void resumen(){
        int cont = 0;
        
        while(cont != 3){
            int contJ = 0;
            for(Jugador j : jugadores){
                if(j instanceof Siglista){
                    contJ++;
                }
                if(j instanceof Siglista){
                    contJ++;
                    
                }
                if(j instanceof Siglista){
                    contJ++;
                    
                }
            }
            
            cont++;
        }
       
    }
}
