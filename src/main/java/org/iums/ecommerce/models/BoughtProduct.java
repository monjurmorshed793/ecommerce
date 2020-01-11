package org.iums.ecommerce.models;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BoughtProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private User user;
    private LocalDate boughtOn;

    public BoughtProduct(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBoughtOn() {
        return boughtOn;
    }

    public void setBoughtOn(LocalDate boughtOn) {
        this.boughtOn = boughtOn;
    }

    @Override
    public String toString() {
        return "BoughtProduct{" +
                "id=" + id +
                ", product=" + product.toString() +
                ", user=" + user.toString() +
                ", boughtOn=" + boughtOn +
                '}';
    }
}
