/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Restaurant.RestaurantDirectory;
import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.WorkQueue.WorkQueue;
import Business.DeliveryMan.DeliveryManDirectory;
/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,RestaurantDirectory rest, CustomerDirectory cus, WorkQueue queue, DeliveryManDirectory deliverdir);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}