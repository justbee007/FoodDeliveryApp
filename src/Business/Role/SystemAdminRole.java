/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Restaurant.RestaurantDirectory;
import Business.Customer.CustomerDirectory;
import Business.WorkQueue.WorkQueue;
import Business.DeliveryMan.DeliveryManDirectory;
/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restu,CustomerDirectory cus, WorkQueue queue,DeliveryManDirectory deliverdir ) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system,restu, cus, deliverdir);
    }
    
}
