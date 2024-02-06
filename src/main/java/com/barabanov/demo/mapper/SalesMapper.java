package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.entity.Sale;
import org.mapstruct.Mapper;


@Mapper(uses = {
        CarInSaleMapper.class,
        CustomerMapper.class
})
public interface SalesMapper
{
    SaleDto toDto(Sale sale);
}
