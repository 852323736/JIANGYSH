package com.spring08.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="T_BOOK")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@SequenceGenerator(name = "SEQ_BOOK",sequenceName="SEQ_BOOK",allocationSize=1)
	@Id
	@GeneratedValue(generator="SEQ_BOOK", strategy=GenerationType.SEQUENCE)
	@Column
	private Integer id;
	
	@Column(name="BOOK_NAME",length = 100,nullable =false)
	private String name;
		
	@Column    
    private double price;
	    
	    
	   
	    
	    
	    
	    public Book(){
	    	
	    }
	    
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
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
