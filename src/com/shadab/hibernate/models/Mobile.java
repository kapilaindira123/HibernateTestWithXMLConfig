/**
 * 
 */
package com.shadab.hibernate.models;

/**
 * @author DanisH
 *
 */


public class Mobile {
	private int id;
	private String name; 
	private String model;   
	private int price;  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	 public Mobile(String name, String model, int price) {
	      this.name = name;
	      this.model = model;
	      this.price = price;
	   }
		
	
}
