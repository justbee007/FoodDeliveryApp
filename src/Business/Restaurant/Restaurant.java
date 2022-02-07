/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import java.util.HashMap;
/**
 *
 * @author harold
 */
public class Restaurant {
    private String id;
    private String resturantName;
    private String resturantAddress;
    private String resturantEmail;
    private String userId;
    private HashMap<String,String> menu;

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public String getResturantAddress() {
        return resturantAddress;
    }

    public void setResturantAddress(String resturantAddress) {
        this.resturantAddress = resturantAddress;
    }

    public String getResturantEmail() {
        return resturantEmail;
    }

    public void setResturantEmail(String resturantEmail) {
        this.resturantEmail = resturantEmail;
    }
    
}
