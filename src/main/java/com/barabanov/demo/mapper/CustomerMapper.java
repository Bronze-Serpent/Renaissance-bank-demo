package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.CustomerDto;
import com.barabanov.demo.entity.Customer;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper
{
    CustomerDto toDto(Customer customer);
}
