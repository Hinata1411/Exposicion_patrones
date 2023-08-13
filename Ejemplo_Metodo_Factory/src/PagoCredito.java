public class PagoCredito extends Tienda{


    @Override
    public Pago hacerPago() {
        return new TarjetaCredito();
    }
}
