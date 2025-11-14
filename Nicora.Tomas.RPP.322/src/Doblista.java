
public class Doblista extends Jugador implements Sacable, PracticableEnParejas{
    private int cordinacion;

    public Doblista(int cordinacion, String nombre, int ranking, Superficie superficiePreferida) {
        super(nombre, ranking, superficiePreferida);
        if(validarCordinacion(cordinacion)){
            this.cordinacion = cordinacion;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        super.toString();
        sb.append("Cordinacion con compañero= ").append(cordinacion);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
    
    
    
    private boolean validarCordinacion(int c){
        return c >= 1 && c <= 10;
    }
    
    @Override  
    public void intentarRealizarSaque(){
        realizarSaque();
    }
    
    @Override
    public void intentarPracticarEnPareja(){
        practicarEnParejas();
    }
    
    
    @Override
    public void realizarSaque() {
        System.out.println("Soy " + getNombre() + " y voy a sacar PUUUM");
    }

    @Override
    public void practicarEnParejas() {
        System.out.println("Soy " + getNombre()+ " y voy a practicar con una pareja");
    }
}
