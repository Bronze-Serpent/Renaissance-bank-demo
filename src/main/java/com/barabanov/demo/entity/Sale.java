package com.barabanov.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Formula;

import java.time.LocalDate;
import java.util.List;


@SuperBuilder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Sale extends BaseEntity<Long>
{
    LocalDate date;

    @ManyToOne
    Customer customer;

    @OneToMany(mappedBy = "sale")
    List<CarInSale> carInSale;

    @Formula("(SELECT SUM(cis.quantity * c.price)" +
            "   FROM car_in_sale cis INNER JOIN car c" +
            "       ON cis.car_id = c.id" +
            "   WHERE cis.sale_id = id)")
    private Integer orderCoast;

/*    public Long getOrderCoast()
    {
        long coast = 0L;
        for (CarInSale carInSaleObj : carInSale)
            coast += (long) carInSaleObj.getCar().getPrice() * carInSaleObj.getQuantity();

        return coast;
    }*/
}
