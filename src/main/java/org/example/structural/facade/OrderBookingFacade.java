package org.example.structural.facade;

public class OrderBookingFacade {

    private final OrderService orderService;
    private final PaymentService paymentService;
    private final InventoryService inventoryService;
    private final NotificationService notificationService;
    private final InvoicingService invoicingService;

//    public OrderBookingFacade(OrderService orderService, PaymentService paymentService, InventoryService inventoryService, NotificationService notificationService, InvoicingService invoicingService) {
//        this.orderService = orderService;
//        this.paymentService = paymentService;
//        this.inventoryService = inventoryService;
//        this.notificationService = notificationService;
//        this.invoicingService = invoicingService;
//    }
    public OrderBookingFacade() {  // For now we are using new here, but irl we will use DI
        this.inventoryService = new InventoryService();
        this.orderService = new OrderService();
        this.invoicingService =  new InvoicingService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void orderItem() {
        inventoryService.checkIsItemInStock();
        orderService.bookOrder();
        paymentService.handlePayment();
        notificationService.sendNotification();
        invoicingService.generateInvoice();
    }
}
