package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.CarInSaleDto;
import com.barabanov.demo.entity.CarInSale;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper
public interface CarInSaleMapper
{
    @Mapping(target = "model", source = "car.name")
    CarInSaleDto toDto(CarInSale carInSale);
}
