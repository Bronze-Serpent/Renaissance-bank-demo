package com.barabanov.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


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

    @ManyToOne
    Car car;

    Integer quantity;

    Long amount;
}
