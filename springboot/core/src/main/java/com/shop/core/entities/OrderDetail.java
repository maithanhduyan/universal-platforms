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
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private int quatity;

    @Column(name = "amount")
    private double amount;

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

    public OrderDetail() {
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
     * @return the order
     */
    public Order getOrder() {
	return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
	this.order = order;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
	return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
	this.product = product;
    }

    /**
     * @return the quatity
     */
    public int getQuatity() {
	return quatity;
    }

    /**
     * @param quatity the quatity to set
     */
    public void setQuatity(int quatity) {
	this.quatity = quatity;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
	return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
	this.amount = amount;
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
	return "OrderDetail [id=" + id + ", order=" + order + ", product=" + product + ", quatity=" + quatity
		+ ", amount=" + amount + ", active=" + active + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
		+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
    }

}
