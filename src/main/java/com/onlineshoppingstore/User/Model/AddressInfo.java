package com.onlineshoppingstore.User.Model;

import org.bson.types.ObjectId;

public class AddressInfo {
  private String address;
  private String city;
  private String state;
  private String country;
  private long phoneNumber;
  private int pincode;
  private AddressType addressType;
  private String addressId = ObjectId.get().toString();

  public AddressInfo() {
  }

  public AddressInfo(String address, String city, String state,
                     String country, long phoneNumber, int pincode, AddressType addressType) {
    this.address = address;
    this.city = city;
    this.state = state;
    this.country = country;
    this.phoneNumber = phoneNumber;
    this.pincode = pincode;
    this.addressType = addressType;
  }

  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getCountry() {
    return country;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public int getPincode() {
    return pincode;
  }

  public AddressType getAddressType() {
    return addressType;
  }

  public String getAddressId() {
    return addressId;
  }

}
