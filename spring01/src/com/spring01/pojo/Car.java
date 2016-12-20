package com.spring01.pojo;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
           private String name;
           private double price;
           
           public Car(){
        	   
           }
           
		public Car(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
           
           
}
