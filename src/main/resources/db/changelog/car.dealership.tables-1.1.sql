--liquibase formatted sql

--changeset barabanov:drop_price_car
ALTER TABLE car DROP COLUMN price;

--changeset barabanov:add_price_car_in_sale
ALTER TABLE car_in_sale ADD COLUMN price INTEGER;