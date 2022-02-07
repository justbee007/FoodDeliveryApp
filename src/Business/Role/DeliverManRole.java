/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import Business.Customer.CustomerDirectory;
import Business.WorkQueue.WorkQueue;
import Business.DeliveryMan.DeliveryManDirectory;

/**
 *
 * @author harold
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem sys, RestaurantDirectory restdir, CustomerDirectory cust,WorkQueue queue,DeliveryManDirectory deliverdir  ) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account,restdir);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
