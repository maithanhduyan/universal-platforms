/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer_group")
public class CustomerGroup {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

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

    public CustomerGroup() {
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
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
	this.description = description;
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
	return "CustomerGroup [id=" + id + ", name=" + name + ", description=" + description + ", active=" + active
		+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdDate=" + createdDate
		+ ", updatedDate=" + updatedDate + "]";
    }

}
