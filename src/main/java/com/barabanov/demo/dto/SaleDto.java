package com.barabanov.demo.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleDto
{
    LocalDate date;
    CustomerDto customer;
    List<CarInSaleDto> carInSale;
    Long orderCoast;
}
