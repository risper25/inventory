public class Customer {
    public int customer_id;
    public String firstname;
    public String secondname;
    public String location;

    public Customer() {
    }

    public Customer(int customer_id, String firstname,String secondname,String location) {
        this.customer_id = customer_id;
        this.firstname=firstname;
        this.secondname=secondname;
        this.location=location;
    }

     //setters
     public void setCustomer_id(int customer_id) {
         this.customer_id = customer_id;
     }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSecomdname(String secomdname) {
        this.secondname = secomdname;
    }

    //getters
    public int getCustomer_id() {
        return customer_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLocation() {
        return location;
    }

    public String getSecomdname() {
        return secondname;
    }
}
