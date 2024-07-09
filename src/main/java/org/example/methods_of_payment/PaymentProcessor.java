package org.example.methods_of_payment;

/*Sí, en Java, es completamente válido y común usar una interfaz como parámetro de un método. Esto permite que el método acepte cualquier objeto que implemente esa interfaz, facilitando el uso de polimorfismo y promoviendo una mayor flexibilidad y extensibilidad en tu código.*/
public class PaymentProcessor  {

    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.procesPayment();
    }
}
