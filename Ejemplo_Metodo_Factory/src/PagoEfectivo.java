public class PagoEfectivo extends Tienda{

    @Override
    public Pago hacerPago() {

        return new Efectivo();
    }
}
