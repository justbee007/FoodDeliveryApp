/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public HashMap<String, String> getOrderMenu() {
        return orderMenu;
    }

    public void setOrderMenu(HashMap<String, String> orderMenu) {
        this.orderMenu = orderMenu;
    }
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }

   

//    public void setResolveDate(Date resolveDate) {
//        this.resolveDate = resolveDate;
//    }

    private String orderNo;
    private HashMap<String, String> orderMenu =null;
//    private int intarr[];
    private int totalPrice;
    private String status;
    private String requestDate;
    private String resolveDate;
    private String restuarantName;
    private String customerName;
    private String comments;
//    public WorkRequest(){
//        requestDate = new Date();
//    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }

//    public UserAccount getSender() {
//        return sender;
//    }
//
//    public void setSender(UserAccount sender) {
//        this.sender = sender;
//    }
//
//    public UserAccount getReceiver() {
//        return receiver;
//    }
//
//    public void setReceiver(UserAccount receiver) {
//        this.receiver = receiver;
//    }

    public String getRestuarantName() {
        return restuarantName;
    }

    public void setRestuarantName(String restuarantName) {
        this.restuarantName = restuarantName;
    }

    
}
