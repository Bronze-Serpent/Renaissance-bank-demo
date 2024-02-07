package com.barabanov.demo.controller;

import com.barabanov.demo.dto.RevenueDto;
import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.service.SaleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController("/api/v1/statistic")
public class StatisticController
{
    private final SaleServiceImpl saleService;

    @GetMapping("/revenue")
    private RevenueDto getRevenue(@RequestParam RevenueFilter revenueFilter)
    {
        return new RevenueDto(saleService.getRevenue(revenueFilter));
    }


    @PostMapping("/get-all-sales")
    private List<SaleDto> getAllSales()
    {
        Sort sort = Sort.by("date", "customer.lastname", "customer.firstname", "orderCoast");
        return saleService.getAllSales(sort);
    }
}