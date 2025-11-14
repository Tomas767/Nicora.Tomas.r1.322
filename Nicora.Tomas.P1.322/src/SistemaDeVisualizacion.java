public class SistemaDeVisualizacion extends Proyecto{
    private int graficosGenerados;

    public SistemaDeVisualizacion(int graficosGenerados, String nombre, String equipoResponsable, EstadoActual estado) {
        super(nombre, equipoResponsable, estado);
        if(validacionGraficos(graficosGenerados)){
            this.graficosGenerados = graficosGenerados;        
        }else{
            throw new IllegalArgumentException("Graficos generados fuera de rango");
        }
    }

    private boolean validacionGraficos(int g){
        return g >= 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Graficos generados= ").append(graficosGenerados);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
    
    @Override
    public void intentarActualizar(){
        System.out.println("No se pueden actualizar datos en proyecto de tipo: " + getClass());
    }
}
