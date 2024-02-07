package com.barabanov.demo.repository;

import com.barabanov.demo.dto.RevenueFilter;

public interface SaleFilterRepository
{
    Integer sumAllRevenue(RevenueFilter revenueFilter);
}
