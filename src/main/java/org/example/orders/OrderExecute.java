package org.example.orders;

import java.util.Arrays;

public class OrderExecute {
    public static void main(String[] args){
        Order order = new Order(Arrays.asList("Item1", "Item2", "Item3"));

        Print orderPrint = new Print();
        orderPrint.printOrder(order);

        Save save = new Save();
        save.saveToDatabase(order);
    }
}
