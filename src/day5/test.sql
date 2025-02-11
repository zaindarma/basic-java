CREATE DATABASE weekTest;

-- Create Table
CREATE TABLE categories (
id SERIAL PRIMARY KEY,
categories_name VARCHAR(120) NOT NULL
)

CREATE TABLE products (
	id SERIAL PRIMARY KEY,
	product_name VARCHAR(120) NOT NULL,
	product_price DOUBLE PRECISION NOT NULL,
	categories_id INT NOT NULL,
	CONSTRAINT fk_product_category FOREIGN KEY (categories_id) REFERENCES categories(id) ON DELETE CASCADE
)

CREATE TABLE customers (
id SERIAL PRIMARY KEY,
customer_name VARCHAR(120) NOT NULL
customer_address VARCHAR(120) NOT NULL
)

CREATE TABLE orders (
id SERIAL PRIMARY KEY,
customer_id INT NOT NULL,
order_date DATE NOT NULL,
CONSTRAINT fk_customer_order FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
)

CREATE TABLE order_items (
product_id INT NOT NULL,
order_id INT NOT NULL,
quantity INT NOT NULL,
CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE
)

CREATE TABLE product_reviews (
id SERIAL PRIMARY KEY,
product_id INT NOT NULL,
customer_id INT NOT NULL,
reviews VARCHAR(255) NOT NULL,
CONSTRAINT fk_product FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE,
CONSTRAINT fk_review_customer FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
)

CREATE TABLE payment_details (
order_id INT NOT NULL,
payment_method VARCHAR (120) NOT NULL,
CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE
)

-- Insert data
INSERT INTO categories (categories_name)
values	('Fashion'),
('Electronics'),
('Skincare');

INSERT INTO products (product_name, product_price, categories_id)
VALUES ('Facewash', 20000 , 3),
('Baju', 50000, 1),
('Kulkas', 2000000, 2);

INSERT INTO customers (customer_name)
VALUES ('Ridho'),
('Mangruf'),
('Fahri');

INSERT INTO orders (customer_id, order_date)
VALUES ('1', '2024-2-11'),
('2', '2024-2-11'),
('3', '2024-2-11');

INSERT INTO order_items (product_id, order_id, quantity)
VALUES (1, 1, 5),
(2, 2, 10),
(3, 3, 15);

INSERT INTO product_reviews (product_id, customer_id, reviews)
VALUES (1, 1, 'Bagus'),
(2, 2, 'Mantep'),
(3, 3, 'Keren');

INSERT INTO payment_details (order_id, payment_method)
VALUES (1, 'QRIS'),
(2, 'Cash'),
(3, 'Ngutang');

-- View all data
SELECT * FROM categories
SELECT * FROM products
SELECT * FROM customers
SELECT * FROM orders
SELECT * FROM order_items
SELECT * FROM product_reviews
SELECT * FROM payment_details

-- Create view
CREATE VIEW product_details AS
SELECT
	c.id,
	c.categories_name,
	p.id AS productid,
	p.product_name,
	p.product_price
FROM products p
INNER JOIN categories c ON c.id = p.categories_id

CREATE VIEW customers_orders AS
SELECT
	c.id,
	c.customer_name,
	o.id AS orderid
FROM orders o
INNER JOIN customers c ON c.id = o.customer_id

CREATE VIEW order_items_details AS
SELECT
	p.id AS productid,
	p.product_name,
	p.product_price,
	oi.quantity,
	o.order_date,
	o.id AS orderid
FROM order_items oi
INNER JOIN products p ON p.id = oi.order_id
INNER JOIN orders o ON o.id = oi.product_id

CREATE VIEW product_reviews_details AS
SELECT
	c.customer_name,
	p.product_name,
	p.product_price,
	pr.reviews
FROM product_reviews pr
INNER JOIN products p ON p.id = pr.customer_id
INNER JOIN customers c ON c.id = pr.product_id

SELECT
	p.product_name,
	c.customer_name,
	pr.rating
FROM product_reviews pr
inner JOIN products p ON  p.id = pr.product_id
inner JOIN customers c ON c.id = pr.user_id
WHERE pr.rating = (SELECT MAX(pr.rating) FROM product_reviews pr);