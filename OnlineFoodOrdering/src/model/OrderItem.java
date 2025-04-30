package model;

public class OrderItem {
    private String order_id;
    private String dish_id;
    private int quantity;

    public OrderItem(String order_id, String dish_id, int quantity) {
        this.order_id = order_id;
        this.dish_id = dish_id;
        this.quantity = quantity;
    }
}
