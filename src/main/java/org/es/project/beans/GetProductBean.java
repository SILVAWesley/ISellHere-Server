package org.es.project.beans;

import org.es.project.models.Location;
import org.es.project.models.User;

public class GetProductBean {
	private User user;
	private String productName;
	private Location location;
	
	public GetProductBean(User user, String productName, Location location){
		this.user = user;
		this.productName = productName;
		this.location = location;
	}
	
	public GetProductBean(){
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}