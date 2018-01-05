package jbc.mfh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private String id;

	@Column(name = "FIRST_NAME")
	@NotEmpty(message="Please enter first name!")
	private String firstName;

	@Column(name = "LAST_NAME")
	@NotEmpty(message="Please enter last name!")
	private String lastName;

	@Column(name = "USER_NAME")
	@NotEmpty(message="Please enter user name!")
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false, length = 128)
	@NotEmpty(message="Please enter password!")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty(message="Please enter email!")
	@Column(name = "EMAIL", nullable = false, length = 64)
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
