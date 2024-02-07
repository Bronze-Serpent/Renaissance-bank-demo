package com.barabanov.demo.service;

import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.dto.SaleDto;
import org.springframework.data.domain.Sort;

import java.util.List;


public interface SaleService
{
    Integer getRevenue(RevenueFilter revenueFilter);

    List<SaleDto> getAllSales(Sort saleSort);
}
