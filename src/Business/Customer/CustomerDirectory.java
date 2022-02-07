/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import Business.Customer.Customer;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.UUID;
/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public CustomerDirectory()
    { this.customerDirectory = new ArrayList<Customer>();
    
    }
    public void addCustomer(Customer customer) {
//    {  UUID uuid = UUID.randomUUID();
//        resturantVal.setId(uuid.toString());
        customerDirectory.add(customer);
    }
}
