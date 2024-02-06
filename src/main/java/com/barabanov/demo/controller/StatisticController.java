package com.barabanov.demo.controller;

import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.dto.SaleDto;
import com.barabanov.demo.entity.Sale;
import com.barabanov.demo.service.SaleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController("/api/v1/statistic")
public class StatisticController
{
    private final SaleServiceImpl saleService;

    @GetMapping("/revenue")
    private Long getRevenue(RevenueFilter revenueFilter)
    {
        return 0L;
    }


    @PostMapping("/get-all-sales")
    private List<Sale> getAllSales()
    {
//        Sort sort = Sort.by("date", "customer.lastname", "customer.firstname");
        List<Sale> allSales = saleService.getAllSales();
        return allSales;
    }
}