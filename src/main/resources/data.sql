INSERT INTO car (name)
VALUES
    ('BMW X5'),
    ('BMW X6'),
    ('BMW X7');

INSERT INTO customer(firstname, lastname, phone_num)
VALUES
    ('Иванов', 'Сергей', '+79107891122'),
    ('Коробкин', 'Олег', '+79107891155'),
    ('Олейкин', 'Роман', '+79107891166');

INSERT INTO sale(date, customer_id)
VALUES ('2021-10-01', 1),
       ('2021-10-02', 2),
       ('2021-10-02', 3),
       ('2021-10-02', 2),
       ('2021-10-02', 2),
       ('2021-10-02', 1);

INSERT INTO car_in_sale(sale_id, car_id, quantity, price)
VALUES (1, 1, 1, 2000000),
       (2, 2, 2, 1750000),
       (3, 3, 1, 2000000),
       (4, 3, 1, 2000000),
       (5, 1, 2, 1000000),
       (6, 2, 1, 3000000);