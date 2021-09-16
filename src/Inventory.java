import java.sql.*;

public class Inventory {
    public Inventory(){
        connect();
    }
     Connection conn;
     PreparedStatement pt;
     public void connect(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conn=  DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Inventory", "postgres", "test123");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException throwables) {
             throwables.printStackTrace();
         }
     }
    //add vendor
    public void add_vendor(String username,String firstname , String secondname){
         try {
             Vendor vendor = new Vendor();
             vendor.setUsername(username);
             vendor.setFirst_name(firstname);
             vendor.setSecond_name(secondname);
             //add details to database
             String query="INSERT INTO vendor (username,firstname,secondname ) VALUES(?,?,?)";
             pt=conn.prepareStatement(query);
             pt.setString(1,vendor.getUsername());
             pt.setString(2,vendor.getFirst_name());
             pt.setString(3,vendor.getSecond_name());
             pt.executeUpdate();
             pt.close();

         }
         catch(Exception e){
             e.printStackTrace();
        }


    }
    //View vendors

    //update vendor
    //deletevendor
    //add product
    public void add_product(String product_name,int vendor_id,double on_hand,double product_size ,double price){
        try {
            Product product = new Product();
            product.setProduct_name(product_name);
            product.setProduct_size(product_size);
            product.setPrice(price);
            product.setOn_hand(on_hand);
            product.setVendor_id(vendor_id);
            //add details to database
            String query="INSERT INTO product ( vendor_id ,productname, product_size , on_hand , price)VALUES(?,?,?,?,?)";
            pt=conn.prepareStatement(query);

            pt.setString(2,product.getProduct_name());
            pt.setInt(1, product.getVendor_id());
            pt.setDouble(3,product.getProduct_size());
            pt.setDouble(5,product.getPrice());
            pt.setDouble(4, product.getOn_hand());

            ResultSet rs = pt.executeQuery("SELECT * FROM product WHERE product_id=3");

            //System.out.println(rs.getString());
            while(rs.next()){
                System.out.println(rs.getString("price"));

            }

            pt.executeUpdate();
            pt.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
    //update product
    //delete product
    //restock
    //add customer
    public void add_customer(int customer_id, String firstname, String secondname , String location ){
        try {
            Customer customer = new Customer();
            customer.setCustomer_id(customer_id);
            customer.setFirstname(firstname);
            customer.setSecomdname(secondname);
            customer.setLocation(location);

            //add details to database
            String query="INSERT INTO  customer(customer_id , firstname , secondname , location ) VALUES(?,?,?,?)";
            pt=conn.prepareStatement(query);
            pt.setInt(1,customer.getCustomer_id());
            pt.setString(2,customer.getFirstname());
            pt.setString(3,customer.getSecomdname());
            pt.setString(4,customer.getLocation());
            pt.executeUpdate();
            pt.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
    //order product
    public void order_product( int order_id ,int customer_id ,int product_id ,double quantity){
        try {
            Orders order = new Orders();
            order.setProduct_id(product_id);
            order.setQuantity(quantity);
            order.setCustomer_id(customer_id);
            //get total price

            //add details to database
            String query="INSERT INTO Orders VALUES(?,?,?,?,?)";
            pt=conn.prepareStatement(query);
            pt.setString(1, String.valueOf(order.getOrder_id()));
            pt.setString(1, String.valueOf(order.getProduct_id()));

            pt.executeUpdate();
            pt.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

    //delete products

    public static void main(String [] args)
    {
      Inventory inventory=new Inventory();

      inventory.add_vendor("risper","al","we");
        inventory.add_vendor("alex","aeel","wkkke");
        inventory.add_product("geisha",3,20.5,0.5,200);
        inventory.add_customer(123,"ris","bev","location");

    }
}
