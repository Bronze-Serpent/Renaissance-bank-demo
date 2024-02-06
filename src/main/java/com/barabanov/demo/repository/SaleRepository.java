package com.barabanov.demo.repository;

import com.barabanov.demo.entity.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SaleRepository extends
        QuerydslPredicateExecutor<Sale>,
        PagingAndSortingRepository<Sale, Long>
{
    @Query(value = "SELECT s1.id id, " +
            "           s1.date date, " +
            "           c1.firstname firstname, " +
            "           c1.id customer_id, " +
            "           c1.lastname lastname, " +
            "           (SELECT SUM(cis2.quantity * c2.price) " +
            "            FROM car_in_sale cis2 INNER JOIN car c2 " +
            "                ON cis2.car_id = c2.id " +
            "            WHERE cis2.sale_id = s1.id) order_sum " +
            "    FROM sale s1 INNER JOIN customer c1 " +
            "        ON s1.customer_id = c1.id",
    nativeQuery = true)
    List<Sale> findAllGonerSorting();
}
