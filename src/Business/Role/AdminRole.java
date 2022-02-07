/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Restaurant.RestaurantDirectory;
import Business.Customer.CustomerDirectory;
import Business.WorkQueue.WorkQueue;
import Business.DeliveryMan.DeliveryManDirectory;
/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,RestaurantDirectory restdir, CustomerDirectory cus, WorkQueue queue, DeliveryManDirectory deliverdir ) {
        return new AdminWorkAreaJPanel(userProcessContainer,business,restdir,account,queue,deliverdir);
    }

    
    
}
