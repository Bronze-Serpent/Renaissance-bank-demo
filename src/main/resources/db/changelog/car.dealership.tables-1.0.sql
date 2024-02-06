--liquibase formatted sql

--changeset barabanov:car
CREATE TABLE car(
    id      BIGSERIAL           PRIMARY KEY,
    name    VARCHAR(60)         UNIQUE,
    price   INTEGER
);


--changeset barabanov:customer
CREATE TABLE customer(
    id          BIGSERIAL       PRIMARY KEY,
    firstname   VARCHAR(60),
    lastname    VARCHAR(60),
    phone_num   VARCHAR(20)
);


--changeset barabanov:sale
CREATE TABLE sale(
    id              BIGSERIAL   PRIMARY KEY,
    date            DATE,
    customer_id     BIGINT      REFERENCES customer(id)
);


--changeset barabanov:cars_in_sale
CREATE TABLE car_in_sale(
     id              BIGSERIAL   PRIMARY KEY,
     sale_id         BIGINT      REFERENCES sale(id),
     car_id          BIGINT      REFERENCES car(id),
     quantity        INTEGER
);


CREATE VIEW sale_with_sum_view AS
    SELECT s1.id id,
           s1.date date,
           c1.firstname firstname,
           c1.lastname lastname,
           (SELECT SUM(cis2.quantity * c2.price)
            FROM car_in_sale cis2 INNER JOIN car c2
                ON cis2.car_id = c2.id
            WHERE cis2.sale_id = s1.id) order_sum
    FROM sale s1 INNER JOIN customer c1
        ON s1.customer_id = c1.id;