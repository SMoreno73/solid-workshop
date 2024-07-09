package org.example.orders;

public class Print {
    public void printOrder(Order order){
        System.out.println("Info orden...");
    };
}


/*    Análisis Aplicado
    Método calculateTotal:

        ¿El método cambia por la misma razón que la clase?
        Sí, porque cualquier cambio en la estructura o en la lógica de los ítems de la orden afectará al cálculo del total.

        ¿El método cumple con una responsabilidad diferente a la de la clase?
        No, calcular el total es parte de la responsabilidad de manejar una orden.

        ¿El método necesita acceso directo a los datos de la clase?
        Sí, el cálculo del total necesita acceso a los ítems de la orden.*/
