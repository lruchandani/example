package com.lalit.productsale.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.AccessType.Type;

@Entity
@Table(name="salesentry")
@AccessType(Type.PROPERTY)
public class Sale {

	
	private Integer salesId;
	private Date dateOfSale;
	private Product productSold;
	private Double salesAmount;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SalesID")
	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer saleId) {
		this.salesId = saleId;
	}

	@ManyToOne
	@JoinColumn(name="ProductID")
	public Product getProductSold() {
		return productSold;
	}

	public void setProductSold(Product productSold) {
		this.productSold = productSold;
	}

	@Column(name="SalesAmount",nullable=false)
	public Double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Double saleAmount) {
		this.salesAmount = saleAmount;
	}
	

	@Column(name="DateOfSale",nullable=false)
	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

}
