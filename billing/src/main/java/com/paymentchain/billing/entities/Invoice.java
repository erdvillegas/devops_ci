/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author sotobotero
 */
@Entity
@Data
public class Invoice {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private long customerId;
   private String number;
   private String detail;
   private double amount;

   public void setId(long customerId) {
      this.id = customerId;
   }

   public long getId() {
      return this.id;
   }

   public void setCustomerId(long customer) {
      this.customerId = customer;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public void setDetail(String detail) {
      this.detail = detail;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

public long getCustomerId() {
    return customerId;
}

public String getNumber() {
    return this.number;
}

public String getgetDetail() {
    return this.detail;
}

public double getAmount() {
    return this.amount;
}
}
