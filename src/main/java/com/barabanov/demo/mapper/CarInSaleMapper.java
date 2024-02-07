package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.CarInSaleDto;
import com.barabanov.demo.entity.CarInSale;
import org.mapstruct.Mapper;

import java.util.List;

// TODO: 07.02.2024 разобраться с mapCtruct, чтобы тут логику не прописывать
@Mapper(componentModel = "spring")
public abstract class CarInSaleMapper
{
    public List<CarInSaleDto> toDto(List<CarInSale> carInSaleList)
    {
        return carInSaleList.stream()
                .map(carInSale -> new CarInSaleDto(carInSale.getCar().getName(), carInSale.getQuantity()))
                .toList();
    }
}
