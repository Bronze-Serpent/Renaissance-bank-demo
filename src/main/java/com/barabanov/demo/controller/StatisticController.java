package com.barabanov.demo.controller;

import com.barabanov.demo.dto.RevenueDto;
import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.service.SaleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RequiredArgsConstructor
@RestController("/api/v1/statistic")
public class StatisticController
{
    private final SaleServiceImpl saleService;

    // TODO: 07.02.2024 тут почему нельзя @RequestParam RevenueFilter
    @GetMapping("/revenue")
    public RevenueDto getRevenue(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate)
    {
        return new RevenueDto(saleService.getRevenue(new RevenueFilter(startDate, endDate)));
    }


    @PostMapping("/get-all-sales")
    public List<SaleDto> getAllSales()
    {
        Sort sort = Sort.by("date", "customer.lastname", "customer.firstname", "orderCoast");
        return saleService.getAllSales(sort);
    }
}