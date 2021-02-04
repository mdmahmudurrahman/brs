package com.brs.web.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String email;
  private String password;
  private String picture;
  
  @Column(name = "created_at", updatable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at")
  @UpdateTimestamp
  private LocalDateTime updatedAt;
  
  @OneToMany(mappedBy = "user")
  private List<UserBook> userBooks;
  
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Request> requests = new ArrayList<>();
  
  @OneToMany(mappedBy = "user")
  private List<Review> reviews;
  
  @OneToMany(mappedBy = "user")
  private List<ReviewLike> reviewLikes;
  
  @OneToMany(mappedBy = "user")
  private List<Comment> comments;

  public User() {
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public List<UserBook> getUserBooks() {
    return userBooks;
  }

  public void setUserBooks(List<UserBook> userBooks) {
    this.userBooks = userBooks;
  }

  public List<Request> getRequests() {
    return requests;
  }

  public void setRequests(List<Request> requests) {
    this.requests = requests;
  }

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public List<ReviewLike> getReviewLikes() {
    return reviewLikes;
  }

  public void setReviewLikes(List<ReviewLike> reviewLikes) {
    this.reviewLikes = reviewLikes;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}
