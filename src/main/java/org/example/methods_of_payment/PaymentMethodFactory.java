package org.example.methods_of_payment;

public class PaymentMethodFactory {
    public PaymentMethod createPaymentMethod(String paymentType) {
        if ("credit".equals(paymentType)) {
            return new CreditCardPayment();
        } else if ("paypal".equals(paymentType)) {
            return new PayPalPayment();
        }
        return null;
    }
}
