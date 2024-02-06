package com.barabanov.demo.service;

import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.dto.SaleFilterDto;
import com.barabanov.demo.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Transactional
@Service
public class SaleService
{
    private final SaleRepository saleRepository;

    public List<SaleDto> getAllSales(SaleFilterDto saleFilter)
    {

    }
}
