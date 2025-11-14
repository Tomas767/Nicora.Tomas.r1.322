
public class ProyectoAlreadyExist extends RuntimeException {

    public ProyectoAlreadyExist() {
    }

    public ProyectoAlreadyExist(String msg) {
        super(msg);
    }
}
