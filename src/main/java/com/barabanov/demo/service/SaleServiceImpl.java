package com.barabanov.demo.service;

import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.mapper.SalesMapper;
import com.barabanov.demo.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.StreamSupport;


@RequiredArgsConstructor
@Transactional
@Service
public class SaleServiceImpl implements SaleService
{
    private final SaleRepository saleRepository;
    private final SalesMapper salesMapper;


    @Override
    public Integer getRevenue(RevenueFilter revenueFilter)
    {
        return saleRepository.sumAllRevenue(revenueFilter);
    }


    @Override
    public List<SaleDto> getAllSales(Sort sort)
    {
        return StreamSupport.stream(saleRepository.findAll(sort).spliterator(), false)
                .map(salesMapper::toDto)
                .toList();
    }
}
