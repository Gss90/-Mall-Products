package com.products.ProductsSE;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@Column(name="c_id")
	Integer CategoryId;
	@Column(name="c_name")
	String CategoryName;
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	List<Product> list;
	public Category(Integer categoryId, String categoryName, List<Product> list) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
		this.list = list;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return CategoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return CategoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	/**
	 * @return the list
	 */
	public List<Product> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Product> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Category [CategoryId=" + CategoryId + ", CategoryName=" + CategoryName + ", list=" + list + "]";
	}
	
	

}
