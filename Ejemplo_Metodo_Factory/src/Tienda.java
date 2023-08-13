public abstract class Tienda {

    public void comprarAlgo(){

        Pago pago1 = hacerPago();
        hacerPago().metodoDePago();

    }
    public abstract Pago hacerPago();

}
