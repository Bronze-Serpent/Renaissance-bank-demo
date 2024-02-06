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
    customer_id     BIGINT      REFERENCES customer(id),
    car_id          BIGINT      REFERENCES car(id),
    quantity        INTEGER
);
