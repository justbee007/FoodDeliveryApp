/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import Business.DeliveryMan.DeliveryMan;
import java.util.UUID;
import Business.DeliveryMan.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryManDirectory()
    { this.deliveryManDirectory = new ArrayList<DeliveryMan>();
    }
    
    public void addDeliveryMan(DeliveryMan deliveryman)
    {  UUID uuid = UUID.randomUUID();
        deliveryman.setId(uuid.toString());
        deliveryManDirectory.add(deliveryman);
    }
}
