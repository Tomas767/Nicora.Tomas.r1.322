public class Juvenil extends Jugador implements PracticableEnParejas{
    private boolean tutor;

    public Juvenil(boolean tutor, String nombre, int ranking, Superficie superficiePreferida) {
        super(nombre, ranking, superficiePreferida);
        this.tutor = tutor;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        super.toString();
        sb.append("Tutoria= ").append(tutor);
        sb.append(System.lineSeparator());

        return sb.toString();
    }
    
    @Override
    public void intentarPracticarEnPareja(){
        practicarEnParejas();
    }

    @Override
    public void intentarRealizarSaque(){
        System.out.println("Soy " + getNombre()+ " y no se realizar un saque porque soy" + getClass());
    }

    @Override
    public void practicarEnParejas() {
        System.out.println("Soy " + getNombre()+ " y voy a practicar con una pareja");
    }
}
