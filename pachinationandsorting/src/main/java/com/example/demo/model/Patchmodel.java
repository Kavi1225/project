package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="product")
public class Patchmodel {
	@Id
     private int id;
	@Coloum (name="Name")
     private String Name;
	@Coloumn (name="Name")
     private int price;
	@Coloumn (name="Name")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Patchmodel [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}
     
}
