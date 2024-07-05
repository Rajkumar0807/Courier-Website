package com;
import jakarta.persistence.*;
@Entity
@Table(name="emp2")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="category",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="general")

public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  int id;
  String name;
public Emp() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public Emp(String name) {
	super();
	this.name = name;
}

}
  