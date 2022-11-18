package com.products.ProductsSE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@Column(name="p_id")
	Integer Product_id;
	@Column(name="p_name")
	String Product_Name;
	@Column(name="c_id")
	Integer c_id;
	String Price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the product_id
	 */
	public Integer getProduct_id() {
		return Product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(Integer product_id) {
		Product_id = product_id;
	}
	public Product(Integer product_id, String product_Name, Integer c_id, String price) {
		super();
		Product_id = product_id;
		Product_Name = product_Name;
		this.c_id = c_id;
		Price = price;
	}
	/**
	 * @return the product_Name
	 */
	public String getProduct_Name() {
		return Product_Name;
	}
	/**
	 * @param product_Name the product_Name to set
	 */
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	/**
	 * @return the c_id
	 */
	public Integer getC_id() {
		return c_id;
	}
	/**
	 * @param c_id the c_id to set
	 */
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", Product_Name=" + Product_Name + ", c_id=" + c_id + ", Price="
				+ Price + "]";
	}
	
	

}
