public class AnalisisEstadistico extends Proyecto implements Actualizable{
    private TipoAnalisis tipo;

    public AnalisisEstadistico(TipoAnalisis tipo, String nombre, String equipoResponsable, EstadoActual estado) {
        super(nombre, equipoResponsable, estado);
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Tipo de analisis= ").append(tipo);
        sb.append(System.lineSeparator());

        return sb.toString();

    }
    
    
    @Override
    public void intentarActualizar() {
        actualizar();
    }
    
    @Override
    public void actualizar(){
        System.out.println("Datos actualizados en proyecto: " + getNombre() + "\nDe tipo: " + getClass());
    }
    
    
}
