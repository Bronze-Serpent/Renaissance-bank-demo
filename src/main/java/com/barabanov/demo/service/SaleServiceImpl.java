package com.barabanov.demo.service;

import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.entity.Sale;
import com.barabanov.demo.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Transactional
@Service
public class SaleServiceImpl
{
    private final SaleRepository saleRepository;


    public Long getRevenue(RevenueFilter revenueFilter)
    {
        return null;
    }


    public List<Sale> getAllSales()
    {
        return saleRepository.findAllGonerSorting();
    }
}
