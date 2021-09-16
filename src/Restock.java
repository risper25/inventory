import java.sql.Time;

// restock_id | vendor_id | product_id | quantity | total_price | time
public class Restock {
    public int restock_id;
    public int vendor_id;
    public int product_id;
    public double total_price;
    public Time time;
    public double quantity;

    public Restock(){

        this.restock_id=0;
    }
    public Restock(int restock_id,int vendor_id,int product_id,double quantity){
        this.quantity=quantity;
        this.vendor_id=vendor_id;
        this.product_id=product_id;

    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getRestock_id() {
        return restock_id;
    }

    public void setRestock_id(int restock_id) {
        this.restock_id = restock_id;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
