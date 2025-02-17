package com.example.demo.Category;


import com.example.demo.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Categoryy")
public class Category {


@Id
@GeneratedValue (strategy = GenerationType.AUTO)
 private Long id;
 @Column(unique = true)
 private  String name;
 @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
 private List<Product> products;

 public Category(Long id, String name) {
  this.id = id;
  this.name = name;
 }


 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
}
