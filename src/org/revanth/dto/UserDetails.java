package org.revanth.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "User_Details")
public class UserDetails {
	@Id
	@GeneratedValue
	// @Column(name="User_ID")
	private int userID;
	// @Column(name="USER_NAME")
	private String username;
	// @Temporal(TemporalType.DATE)
	// private Date joinedData;
	// @Lob
	// @Embedded
	// @AttributeOverrides({ @AttributeOverride(name = "street", column =
	// @Column(name = "Home_street")),
	// @AttributeOverride(name = "city", column = @Column(name = "Home_city")),
	// @AttributeOverride(name = "state", column = @Column(name =
	// "Home_state")),
	// @AttributeOverride(name = "pincode", column = @Column(name =
	// "Home_pincode")) })
	//
	// private Address HomeAddress;
	// @Embedded
	// private Address OfficeAddress;
	@ElementCollection
	@JoinTable(name = "User_address", joinColumns = @JoinColumn(name = "User_id"))
	@GenericGenerator(name="hilo-gen", strategy= "hilo")
	@CollectionId(columns={@Column(name="Address_id")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	// public Date getJoinedData() {
	// return joinedData;
	// }
	// public void setJoinedData(Date joinedData) {
	// this.joinedData = joinedData;
	// }
	// public String getAddress() {
	// return Address;
	// }
	// public void setAddress(String address) {
	// Address = address;
	// }
	// public Address getAddress() {
	// return Address;
	// }
	//
	// public void setAddress(Address address) {
	// Address = address;
	// }

	// public Address getHomeAddress() {
	// return HomeAddress;
	// }
	//
	// public void setHomeAddress(Address homeAddress) {
	// HomeAddress = homeAddress;
	// }
	//
	// public Address getOfficeAddress() {
	// return OfficeAddress;
	// }
	//
	// public void setOfficeAddress(Address officeAddress) {
	// OfficeAddress = officeAddress;
	// }

}
