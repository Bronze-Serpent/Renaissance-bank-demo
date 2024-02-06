package com.barabanov.demo.mapper;

import com.barabanov.demo.dto.ClientDto;
import com.barabanov.demo.entity.Customer;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper
{
    ClientDto toDto(Customer customer);
}
