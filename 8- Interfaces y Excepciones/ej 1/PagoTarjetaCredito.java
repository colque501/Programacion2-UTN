package ej1;

public class PagoTarjetaCredito implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito procesado por $" + monto);
    }
}
