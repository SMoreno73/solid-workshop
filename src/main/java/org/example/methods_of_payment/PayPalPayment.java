package org.example.methods_of_payment;

public class PayPalPayment implements PaymentMethod  {
    @Override
    public void procesPayment() {
        System.out.println("Pago con PayPal Exitoso");
    }
}
