public class Vendor {
    public int id;
    public String username;
    public String first_name;
    public String second_name;

    public Vendor(){
       this.id=0;
    }
    public Vendor(int id,String username,String first_name,String second_name,String email){
        this.id=id;
        this.username=username;
        this.first_name=first_name;
        this.second_name=second_name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.username = username;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   /* public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }
}
