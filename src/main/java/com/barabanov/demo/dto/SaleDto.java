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
    ClientDto client;
    Long orderCoast;
    LocalDate date;
    List<CarInSaleDto> carInSaleList;
}
