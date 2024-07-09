package org.example.methods_of_payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void procesPayment() {
        System.out.println("Pago realizado con tarjeta de credito");
    }
}
