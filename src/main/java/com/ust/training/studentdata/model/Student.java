/***
 * Project Name : StudentData
 */

package com.ust.training.studentdata.model;

import org.springframework.data.annotation.Id;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;

import lombok.Data;

/**
 * Model class contains the details to send to the db
 * 
 * @author Akhila
 *
 */
@Document(collection = "studentDb")
@Data

public class Student {
  @Id
  private String id;
  private String firstName;

  @PartitionKey
  private String lastName;
  private String address;

//  public String getId() {
//    return id;
//  }
//
//  public void setId(String id) {
//    this.id = id;
//  }
//
//  public String getFirstName() {
//    return firstName;
//  }
//
//  public void setFirstName(String firstName) {
//    this.firstName = firstName;
//  }
//
//  public String getLastName() {
//    return lastName;
//  }
//
//  public void setLastName(String lastName) {
//    this.lastName = lastName;
//  }
//
//  public String getAddress() {
//    return address;
//  }
//
//  public void setAddress(String address) {
//    this.address = address;
//  }
//
//  @Override
//  public String toString() {
//    return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
//        + ", address=" + address + "]";
//  }

}
