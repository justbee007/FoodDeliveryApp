/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import Business.Customer.CustomerDirectory;
import Business.WorkQueue.WorkQueue;
import Business.DeliveryMan.DeliveryManDirectory;


/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem sys, RestaurantDirectory restdir, CustomerDirectory cust,WorkQueue queue,DeliveryManDirectory deliverdir  ) {
        return new CustomerAreaJPanel(userProcessContainer, account,restdir,queue,sys);
    }
    
    
}
