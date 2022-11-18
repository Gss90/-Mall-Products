package com.products.ProductsSE;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	SessionFactory factory;
	
	
	@GetMapping("product/{id}")
	public Category getCategory (@PathVariable int id) {
		Session session=factory.openSession();
	Category category=session.load(Category.class, id);
	
		
		return category;
	}
	@GetMapping("products")
	public List<Category>getCategory () {
		Session session=factory.openSession();
	
	List <Category> categories=session.createCriteria(Category.class).list();
		
		return categories;
	}
	@PostMapping("add/product")
	public String addcategory(@RequestBody Product Product) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(Product);
		transaction.commit();
		
		return "added successfully";
		
	}
	@PutMapping("update/product")
	public String updateProduct(@RequestBody Product p) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(p);;
		transaction.commit();
	
		
		return "updated successfully";
	}
	@DeleteMapping("Delete/{id}")
	public String deleteData(@PathVariable int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Product p=session.load(Product.class, id);
		session.delete(p);
		transaction.commit();
		
		
		return "deleleted";
	}
	

}
