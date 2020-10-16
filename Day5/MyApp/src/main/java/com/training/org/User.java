package com.training.org;

import java.util.List;

import javax.management.relation.Role;

public class User {
	private String email;
	private String password;
	private String phoneNumber;
	private boolean enabled;
	private boolean verified;
	private List<Role> roles;
	private Address address;
	
}
