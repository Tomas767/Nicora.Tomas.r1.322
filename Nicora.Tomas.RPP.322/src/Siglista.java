public class Siglista extends Jugador implements Sacable{
    private int velocidadSaque;

    public Siglista(int velocidadSaque, String nombre, int ranking, Superficie superficiePreferida) {
        super(nombre, ranking, superficiePreferida);
        if(validarSaque(velocidadSaque)){
            this.velocidadSaque = velocidadSaque;
        }
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        super.toString();
        sb.append("Velocidad de saque= ").append(velocidadSaque);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
    private boolean validarSaque(int e){
        return e > 0;
    }
    
    @Override
    public void intentarPracticarEnPareja(){
        System.out.println("Soy " + getNombre() + " y no quiero puedo practicar en parejas porque soy " + getClass() );
    }
    
    @Override
    public void intentarRealizarSaque(){
        realizarSaque();
    }
    
    @Override
    public void realizarSaque() {
        System.out.println("Soy " + getNombre() + " y voy a sacar PUUUM");
    }
    
    
}
