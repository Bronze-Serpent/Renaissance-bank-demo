package com.barabanov.demo.repository;

import com.barabanov.demo.dto.RevenueFilter;
import com.barabanov.demo.querydsl.QPredicates;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

import static com.barabanov.demo.entity.QCarInSale.carInSale;
import static com.barabanov.demo.entity.QSale.sale;


@RequiredArgsConstructor
public class SaleFilterRepositoryImpl implements SaleFilterRepository
{
    private final EntityManager entityManager;


    @Override
    public Integer sumAllRevenue(RevenueFilter revenueFilter)
    {
        Predicate predicate = QPredicates.builder()
                .add(revenueFilter.getStartDate(), (startDate) -> sale.date.before(startDate).not())
                .add(revenueFilter.getEndDate(), (endDate) -> sale.date.after(endDate).not())
                .build();

        return new JPAQuery<Long>(entityManager)
                .select(carInSale.quantity.multiply(carInSale.price).sum())
                .from(sale)
                .join(sale.carInSale, carInSale)
                .where(predicate)
                .fetchOne();
    }
}
