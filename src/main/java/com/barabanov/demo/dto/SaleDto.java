package com.barabanov.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleDto
{
    CustomerDto customer;
    Long amount;
    String carModel;
    Integer quantity;
    LocalDate date;
}
