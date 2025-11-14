public class ModeloMachineLearning extends Proyecto implements Actualizable{
    private int precision;
    
    public ModeloMachineLearning(String nombre, String equipoResponsable, EstadoActual estado, int precision) {
        super(nombre, equipoResponsable, estado);
        if(validacionPrecision(precision)){
            this.precision = precision;
        }else{
            throw new IllegalArgumentException("Precision fuera del rango");
        }
    }
    
    private boolean validacionPrecision(int p){
        return (p >= 1 && p <= 100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Precision= ").append(precision);
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
