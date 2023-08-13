public class ManejadorDeArchivos {

    private static ManejadorDeArchivos instancia;

    public static ManejadorDeArchivos getInstancia() {
        if (instancia == null){
            instancia = new ManejadorDeArchivos();
        }
        return instancia;
    }

    private ManejadorDeArchivos() {

    }

}
