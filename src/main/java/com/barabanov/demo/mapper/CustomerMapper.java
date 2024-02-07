package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.CustomerDto;
import com.barabanov.demo.entity.Customer;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class CustomerMapper
{
    public abstract CustomerDto toDto(Customer customer);
}
