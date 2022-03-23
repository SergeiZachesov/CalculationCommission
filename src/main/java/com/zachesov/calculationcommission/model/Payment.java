package com.zachesov.calculationcommission.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer Id;

    @Column(name = "user_id")
    Integer userId;

    @Column(name = "amount")
    Integer amount;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "commentary")
    String commentary;

    public Payment() {
    }

    public Payment(Integer id, Integer userId, Integer amount, LocalDate date, String commentary) {
        Id = id;
        this.userId = userId;
        this.amount = amount;
        this.date = date;
        this.commentary = commentary;
    }

    @JsonIgnore
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", amount=" + amount +
                ", date=" + date +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
