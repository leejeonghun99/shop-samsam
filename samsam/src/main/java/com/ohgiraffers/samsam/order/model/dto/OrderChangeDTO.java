package com.ohgiraffers.samsam.order.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderChangeDTO {
    private int order_seq;
    private int customer_seq;
    private int product_seq;
    private int total_price;
    private String register_date;
    private int order_status;
}