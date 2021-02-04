package com.brs.web.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "review_likes")
public class ReviewLike {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "like_status")
  private Integer likeStatus;
  
  @Column(name = "created_at", updatable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at")
  @UpdateTimestamp
  private LocalDateTime updatedAt;
  
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "review_id")
  private Review review;
  
  public ReviewLike() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Integer getLikeStatus() {
    return likeStatus;
  }

  public void setLikeStatus(Integer likeStatus) {
    this.likeStatus = likeStatus;
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

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Review getReview() {
    return review;
  }

  public void setReview(Review review) {
    this.review = review;
  }
}
