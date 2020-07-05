/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "money_total")
    private double moneyTotal;

    @Column(name = "money_discount")
    private double moneyDiscount;

    @Column(name = "payment_method_id")
    private String paymentMethod;

    @Column(name = "active")
    private int active;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    public Order() {
    }

    /**
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
	return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
	this.customer = customer;
    }

    /**
     * @return the moneyTotal
     */
    public double getMoneyTotal() {
	return moneyTotal;
    }

    /**
     * @param moneyTotal the moneyTotal to set
     */
    public void setMoneyTotal(double moneyTotal) {
	this.moneyTotal = moneyTotal;
    }

    /**
     * @return the moneyDiscount
     */
    public double getMoneyDiscount() {
	return moneyDiscount;
    }

    /**
     * @param moneyDiscount the moneyDiscount to set
     */
    public void setMoneyDiscount(double moneyDiscount) {
	this.moneyDiscount = moneyDiscount;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
	return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
    }

    /**
     * @return the active
     */
    public int getActive() {
	return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(int active) {
	this.active = active;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
	return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    /**
     * @return the updatedBy
     */
    public String getUpdatedBy() {
	return updatedBy;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
	return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
    }

    /**
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
	return updatedDate;
    }

    /**
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
	return "Order [id=" + id + ", customer=" + customer + ", moneyTotal=" + moneyTotal + ", moneyDiscount="
		+ moneyDiscount + ", paymentMethod=" + paymentMethod + ", active=" + active + ", createdBy=" + createdBy
		+ ", updatedBy=" + updatedBy + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
    }

}
