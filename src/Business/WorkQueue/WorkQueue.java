/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author raunak
 */
public class WorkQueue {
     private ArrayList<WorkRequest> workQueue;

  
    public WorkQueue()
    { this.workQueue = new ArrayList<WorkRequest>();
    }    

    public ArrayList<WorkRequest> getWorkqueue() {
        return workQueue;
    }

    public void setWorkqueue(ArrayList<WorkRequest> workqueue) {
        this.workQueue = workqueue;
    }
    public void addOrder(WorkRequest work)
    {UUID uuid = UUID.randomUUID();
    work.setOrderNo(uuid.toString());
    workQueue.add(work);
    }
}