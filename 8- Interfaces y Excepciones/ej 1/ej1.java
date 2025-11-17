package ej1;

import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Brian Gutierrez");
        System.out.println("=== Sistema de E-commerce ===\n");

        // ---------- PEDIDO 1 ----------
        Pedido pedido1 = new Pedido(cliente);
        pedido1.agregarProducto(new Producto("Mouse inalámbrico", 5000));
        pedido1.agregarProducto(new Producto("Teclado mecánico", 12000));
        pedido1.agregarProducto(new Producto("Auriculares gamer", 8000));

        System.out.println("Pedido 1 creado con productos:");
        Arrays.asList("Mouse inalámbrico", "Teclado mecánico", "Auriculares gamer")
              .forEach(p -> System.out.println(" - " + p));

        System.out.println("\nTotal del pedido 1: $" + pedido1.calcularTotal());

        // Pago con tarjeta de crédito (tiene descuento)
        PagoConDescuento pagoTarjeta = new PagoTarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(pedido1.calcularTotal());
        System.out.println("Total con descuento (Tarjeta): $" + totalConDescuento);
        pagoTarjeta.procesarPago(totalConDescuento);

        // Cambiar estado del pedido
        pedido1.cambiarEstado("En preparación");
        pedido1.cambiarEstado("Enviado");

        System.out.println("\n------------------------------------------\n");

        // ---------- PEDIDO 2 ----------
        Pedido pedido2 = new Pedido(cliente);
        pedido2.agregarProducto(new Producto("Notebook 15''", 350000));
        pedido2.agregarProducto(new Producto("Mousepad RGB", 6000));

        System.out.println("Pedido 2 creado con productos:");
        Arrays.asList("Notebook 15''", "Mousepad RGB")
              .forEach(p -> System.out.println(" - " + p));

        System.out.println("\nTotal del pedido 2: $" + pedido2.calcularTotal());

        // Pago con PayPal (no tiene descuento)
        Pago pagoPayPal = new PagoPayPal();
        pagoPayPal.procesarPago(pedido2.calcularTotal());

        // Cambiar estado del pedido
        pedido2.cambiarEstado("Confirmado");
        pedido2.cambiarEstado("Enviado");

        System.out.println("\n=== Fin de las pruebas ===");
    }
}
