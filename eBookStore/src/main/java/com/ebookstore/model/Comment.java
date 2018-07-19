package com.ebookstore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Comment implements Serializable
{
    @Id
    @GeneratedValue
    private int commentId;

    @Column(nullable = false, length = 20)
    private String commentTitle;

    private String username;

    @Column(nullable = false, length = 500)
    private String comment;

    @Column(nullable = false)
    private Date time = new Date();

    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCommentTitle() {
        return commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}