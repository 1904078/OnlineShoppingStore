package com.onlineshoppingstore.User.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "User")
public class User {
  @Id
  private String userID;
  @Indexed(direction = IndexDirection.ASCENDING)
  private String emailId;
  private String password;
  private long primaryPhoneNumber;
  private Name name;
  private Collection<AddressInfo> addressInfo = new ArrayList<>();
  private String primaryAddressId;

  public User() {
    //Default Constructor
  }

  @PersistenceConstructor
  public User(String emailId, String password, long primaryPhoneNumber, Name name, List<AddressInfo> addressInfo, String primaryAddressId) {
    this.emailId = emailId;
    this.password = password;
    this.primaryPhoneNumber = primaryPhoneNumber;
    this.name = name;
    this.addressInfo = addressInfo;
    this.primaryAddressId = primaryAddressId;
  }

  public User(String emailId, String password, long primaryPhoneNumber, Name name, List<AddressInfo> addressInfo) {
    this.emailId = emailId;
    this.password = password;
    this.primaryPhoneNumber = primaryPhoneNumber;
    this.name = name;
    this.addressInfo = addressInfo;
  }

  public User(String emailId, String password, long primaryPhoneNumber, Name name) {
    this.emailId = emailId;
    this.password = password;
    this.primaryPhoneNumber = primaryPhoneNumber;
    this.name = name;
  }

  public String getEmailId() {
    return emailId;
  }

  public String getPassword() {
    return password;
  }

  public long getPrimaryPhoneNumber() {
    return primaryPhoneNumber;
  }

  public Name getName() {
    return name;
  }

  public Collection<AddressInfo> getAddressInfo() {
    return addressInfo;
  }

  public String getUserID() {
    return userID;
  }

  public String getPrimaryAddressId() {
    return primaryAddressId;
  }

}
