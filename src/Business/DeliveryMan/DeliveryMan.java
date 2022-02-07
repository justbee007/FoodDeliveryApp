/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import Business.WorkQueue.WorkQueue;
/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String age;
    private String phoneNumber;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //private ArrayList<WorkRequest> Workrequest;
    private WorkQueue queue;

    public WorkQueue getQueue() {
        return queue;
    }

    public void setQueue(WorkQueue queue) {
        this.queue = queue;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
}
