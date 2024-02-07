INSERT INTO car (name, price)
VALUES
    ('BMW X5', 2000000),
    ('BMW X6', 3000000),
    ('BMW X7', 2000000);

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

INSERT INTO car_in_sale(sale_id, car_id, quantity)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 1),
       (4, 3, 1),
       (5, 1, 2),
       (6, 2, 1);