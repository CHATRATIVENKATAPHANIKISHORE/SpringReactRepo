package com.cpk.UserData.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	 User () {
	}
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column  
	private Long uid;  
	
	@Column  
	private String userName; 
	@Column  
	private String email; 
	@Column  
	private String contactnumber; 
	@Column  
	private String gender; 
	@Column  
	private String address; 
	@Column  
	private String pincode;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
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
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, contactnumber, email, gender, pincode, uid, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(contactnumber, other.contactnumber)
				&& Objects.equals(email, other.email) && Objects.equals(gender, other.gender)
				&& Objects.equals(pincode, other.pincode) && Objects.equals(uid, other.uid)
				&& Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", email=" + email + ", contactnumber=" + contactnumber
				+ ", gender=" + gender + ", address=" + address + ", pincode=" + pincode + "]";
	}
	public User(Long uid, String userName, String email, String contactnumber, String gender, String address,
			String pincode) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.email = email;
		this.contactnumber = contactnumber;
		this.gender = gender;
		this.address = address;
		this.pincode = pincode;
	} 
	

}
