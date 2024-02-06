INSERT INTO car (name, price)
VALUES ('BMW X5', 2000000),
('BMW X6', 3000000),
('BMW X7', 2000000);

INSERT INTO customer(firstname, lastname, phone_num)
VALUES ('durka', 'skaraia', '03'),
('ghost', 'busters', '555-2368');

INSERT INTO sale(date, customer_id)
VALUES ('2002-02-12', 1),
       ('2002-02-12', 2);

INSERT INTO car_in_sale(sale_id, car_id, quantity)
VALUES (1, 1, 2),
       (2, 3, 1);


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