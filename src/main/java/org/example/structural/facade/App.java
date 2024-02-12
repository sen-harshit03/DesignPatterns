package org.example.structural.facade;


/**
 *  Using facade pattern we hide the complexity of calling complex subsystem, introducing a class which handles all these
 *  complexities on our behalf
 */
public class App {
    public static void main(String[] args) {

        OrderBookingFacade orderBookingFacade = new OrderBookingFacade();
        orderBookingFacade.orderItem();
    }

}
