package com.barabanov.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarInSaleDto
{
    String model;

    Integer price;

    Integer quantity;
}