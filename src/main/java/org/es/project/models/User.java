package org.es.project.models;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique = true)
	private String username;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	
	public User(){
		
	}
	
	public User(String username, String email, String password){
		this.username = username;
		this.email = email;
		this.password = password;
}

	
	public void createPointOfSale(String name, double longitude, double latitude, String comment, String image){
		
	}
	
	public void editPointOfSale(PointOfSale pointOfSale , String name, String comment, String image){
		pointOfSale.setName(name);
		pointOfSale.setComment(comment);
		pointOfSale.setImage(image);
	}
	
	public void editProduct(Product product, String name, double price, String comment, String image){
		product.setName(name);
		product.setPrice(price);
		product.setComment(comment);
		product.setImage(image);
	}
	
	
	//GETTERS AND SETTERS
	
	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public Long getId(){
		return id;
	}
	
	//falta inserir restrição de senha
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof User)){
			return false;
		}
		User aux = (User)obj;
		if(username.equals(aux.getUsername()) && password.equals(aux.getPassword()) && email.equals(aux.getEmail())){
			return true;
		} else {
			return false;
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

}