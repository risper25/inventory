import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class myjdbc {

    public static void main(String [] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Inventory", "postgres", "test123");

            Statement statement = connection.createStatement();

            System.out.println("yes");
            ResultSet resultset = statement.executeQuery("select * from vendor");

            while (resultset.next()) {
                System.out.println(resultset.getString("vendor_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }}
