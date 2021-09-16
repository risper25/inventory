public class Orders {
    //order_id | customer_id | product_id | quantity | total_price | time
    public int order_id;
    public int product_id;
    public double quantity;
    public int customer_id;
    public double total_price;

    // public double shipping_fee;

    public Orders() {
        this.order_id = 0;
        this.quantity = 0;

    }

    public Orders(int order_id, int product_id, double quantity, int customer_id,double total_price) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.customer_id = customer_id;
        this.total_price=total_price;


    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
}
