package com.barabanov.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

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
}
