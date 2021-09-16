public class Product {
    public int id;
    public String product_name;
    public int vendor_id;
    public double on_hand;
    public double product_size;
    public double price;

    public Product(){
        this.id=0;
        this.on_hand=0;

    }
    public Product(int id,String product_name,int vendor_id,double product_size,double on_hand,double price){
        this.id=id;
        this.product_name=product_name;
        this.vendor_id=vendor_id;
        this.on_hand=on_hand;
        this.price=price;
        this.product_size=product_size;
    }

    //setters
    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setOn_hand(double on_hand) {
        this.on_hand = on_hand;
    }



    public void setPrice(double price) {
        this.price = price;
    }


    public void setProduct_size(double product_size) {
        this.product_size = product_size;
    }

    //getters
    public String getProduct_name() {
        return product_name;
    }
    public int getVendor_id() {
        return vendor_id;
    }
    public int getId() {
        return id;
    }

    public double getOn_hand() {
        return on_hand;
    }

    public double getPrice() {
        return price;
    }
    public double getProduct_size() {
        return product_size;
    }

}
