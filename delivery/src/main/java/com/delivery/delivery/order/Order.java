package com.delivery.delivery.order;

import com.delivery.delivery.foot.Foot;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;
    private LocalDateTime estimatedDeliveryTime;
    private List<Foot> items;

    public Order(int id, String customerName, String customerEmail, String status, LocalDateTime creationTime, LocalDateTime estimatedDeliveryTime, List<Foot> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }
}


