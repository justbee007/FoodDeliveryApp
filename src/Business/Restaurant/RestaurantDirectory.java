/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import Business.EcoSystem;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> resturantDirectory;
    
    public RestaurantDirectory()
    { this.resturantDirectory = new ArrayList<Restaurant>();
    }
    public ArrayList<Restaurant> getResturantDirectory() {
        return resturantDirectory;
    }

    public void setResturantDirectory(ArrayList<Restaurant> resturantDirectory) {
        this.resturantDirectory = resturantDirectory;
    }
    
    public void addRestaurant(Restaurant resturantVal)
    {  UUID uuid = UUID.randomUUID();
        resturantVal.setId(uuid.toString());
        resturantDirectory.add(resturantVal);
    }
    
    public void deleteRestaurant()
    { for(int i=0;i<resturantDirectory.size();i++)
    {
        resturantDirectory.remove(i);
    }
    }
    
    
}
