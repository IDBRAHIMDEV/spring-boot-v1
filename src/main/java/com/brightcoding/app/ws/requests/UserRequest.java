package com.brightcoding.app.ws.requests;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class UserRequest {

	@NotBlank(message="Ce champ ne doit etre null !")
	private String firstName;
	
	@NotNull(message="Ce champ ne doit etre null !")
	@Size(min=3, message="Ce champ doit avoir au moins 3 Caracteres !")
	private String lastName;
	
	@NotNull(message="Ce champ ne doit etre null !")
	@Email(message="ce champ doit respecter le format email !")
	private String email;
	
	@NotNull(message="Ce champ ne doit etre null !")
	@Size(min=8, message="mot de passe doit avoir au moins 8 caracteres !")
	@Size(max=12, message="mot de passe doit avoir au max 12 caracteres !")
	private String password;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
