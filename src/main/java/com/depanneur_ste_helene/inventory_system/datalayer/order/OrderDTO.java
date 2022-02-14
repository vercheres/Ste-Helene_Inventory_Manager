package com.depanneur_ste_helene.inventory_system.datalayer.order;

public class OrderDTO {

    private String orderId;

    private String orderDate;

    private boolean received;

    private boolean payed;

    private String supplierId;

    public OrderDTO(String orderId, String orderDate, boolean received, boolean payed,
                    String supplierId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.received = received;
        this.payed = payed;
        this.supplierId = supplierId;
    }

    public OrderDTO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
