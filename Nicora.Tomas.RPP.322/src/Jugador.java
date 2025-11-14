
import java.util.Objects;

public abstract class Jugador {
    private String nombre;
    private int ranking;
    private Superficie superficiePreferida;

    public Jugador(String nombre, int ranking, Superficie superficiePreferida) {
        if(validar(nombre, ranking, superficiePreferida)){
            this.nombre = nombre;
            this.ranking = ranking;
            this.superficiePreferida = superficiePreferida;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public Superficie getSuperficiePreferida() {
        return superficiePreferida;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    abstract void intentarRealizarSaque();
    
    abstract void intentarPracticarEnPareja();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre= ").append(nombre);
        sb.append(System.lineSeparator());
        sb.append("Ranking= ").append(ranking);
        sb.append(System.lineSeparator());
        sb.append("Superficie Preferida= ").append(superficiePreferida);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
    
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
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.ranking, other.ranking);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.ranking);
        hash = 19 * hash + Objects.hashCode(this.superficiePreferida);
        return hash;
    }
    
    private boolean validar(String n, int r, Superficie s ){
        return n != null || r > 0 || s != null;
    }
}
