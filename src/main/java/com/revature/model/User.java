package com.revature.model;

public class User {
 private String loginId;
 private String password;
 private String firstName;
 private String lastName;
 private String email;
 private String phone;
 private String address;
 private int age ;
 private String  physicalDisability;
 private String dateOfBirth;
 private String identityProof;
 public User() {
		super();
	}
public User(String loginId, String password, String email, String phone, String address, int age,
		String physicalDisability, String firstName, String lastName, String identityProof , String dateOfBirth ) {
	super();
	this.loginId = loginId;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.address = address;
	this.age = age;
	this.physicalDisability = physicalDisability;
	this.firstName = firstName;
	this.lastName = lastName;
	this.identityProof = identityProof;
	this.dateOfBirth = dateOfBirth;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getLoginId() {
	return loginId;
}
public void setLoginId(String loginId) {
	this.loginId = loginId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhysicalDisability() {
	return physicalDisability;
}
public void setPhysicalDisability(String physicalDisability) {
	this.physicalDisability = physicalDisability;
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
public String getIdentityProof() {
	return identityProof;
}
public void setIdentityProof(String identityProof) {
	this.identityProof = identityProof;
}
@Override
public String toString() {
	return "User\n [" + "firstName=" + firstName + "\n" + "lastName=" + lastName + "\n" + "email=" + email + "\n" +"phone=" + phone 
			+"\n" + "address=" + getAddress() +"\n"  +"physicalDisability=" + physicalDisability + "\n"   +"identityProof=" + identityProof+ "\n"+ "Date Of Birth = " + dateOfBirth + "\n"  + "age=" + age + "]";
}


}


