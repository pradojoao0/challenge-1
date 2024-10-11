package com.hiken.ecommerce.services;

import com.hiken.ecommerce.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

  public double shipment(Order order) {
    return calculateShipping(order.getBasic());
  }

  private double calculateShipping(double value) {
    if(value < 100 ) {
      return 20;
    } else if (value >= 100 && value < 200 ) {
      return 12;
    }
    return 0;
  }
}
