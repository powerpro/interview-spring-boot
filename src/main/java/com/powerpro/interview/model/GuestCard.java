package com.powerpro.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GuestCard {

  @GeneratedValue
  @Column
  @Id
  private int id;

  @Column(unique = true, nullable = false)
  private String name;

  public GuestCard() {
    // Default for JPA
  }

  public GuestCard(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
