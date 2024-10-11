package com.hiken.ecommerce.entities;

public class Order {

  int code;
  double basic;
  double discount;

  public Order(int code, double basic, double discount) {
    this.code = code;
    this.basic = basic;
    this.discount = discount;
  }

  public int getCode() { return code; }

  public double getDiscount() { return discount; }

  public double getBasic() { return basic; }


}
