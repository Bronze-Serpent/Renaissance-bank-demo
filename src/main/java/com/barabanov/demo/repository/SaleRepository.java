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
    @Query("")
    List<Sale> findAll(Sort sort);
}
