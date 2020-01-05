package com.onlineshoppingstore.User.Model;

public class Name {
  private String firstName;
  private String lastName;
  private String middleName;

  public Name() {
  }

  public Name(String firstName, String lastName, String middleName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
  }

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMiddleName() {
    return middleName;
  }
}
