//EJEMPLO DE FACTORY METHOD

public class Aplicacion {

    private static Tienda tienda;

    public static void main(String[] args) {
        configure(args);
        irdeCompras();
    }

    static void configure(String[] args){
        if((args.length > 0) && args[0].equalsIgnoreCase("TarjetaCredito")) {
            tienda = new PagoCredito();
        } else {
            tienda = new PagoEfectivo();
        }
    }
    static void irdeCompras(){
        tienda.comprarAlgo();
    }
}


