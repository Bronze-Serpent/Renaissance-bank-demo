package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.entity.Sale;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(uses = {
        CustomerMapper.class
})
public interface SalesMapper
{
    @Mapping(target = "carModel", source = "car.name")
    SaleDto toDto(Sale sale);
}
