package net.javaguides.springboot.tutorial.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Product name is mandatory")
    @Column(name = "name")
    private String name;
    
    @NotBlank(message = "Product Id is mandatory")
    @Column(name = "productid")
    private String productid;
    
    @NotBlank(message = "Product Type is mandatory")
    @Column(name = "producttype")
    private String producttype;

    @Column(name = "quantity")
    private long quantity;
   
  
    
    public Student() {}

    public Student(String name, String productid,String producttype) {
        this.name = name;
        this.productid = productid;
   this.producttype=producttype;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setProductid(String productid) {
        this.productid = productid;
    }
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getName() {
        return name;
    }

    public String getProductid() {
        return productid;
    }
    public String getProducttype() {
        return producttype;
    }

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}   
	 