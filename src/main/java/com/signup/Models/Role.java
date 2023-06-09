package com.signup.Models;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Role {

	@Id
	private Long roleId;
	private String roleName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="roles")
	private Set<UserRole> userRoles=new HashSet<>();
	
	//Getter & Setter
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	
	
	//Default Constructor
	public Role() {
		
		
	}
	
	
    //Getter & Setter

	public long getRoleId() {
		return roleId;
	}


	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
	//Paramerized Constructor
	
	public Role(long roleId, String roleName) {
		super();                                          //Exception didnt used by coder in project
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	
	
	
	
}
