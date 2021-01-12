drop database truy_van_dlnc;
create database truy_van_dlnc;
use truy_van_dlnc;

create table productlines (
product_line varchar(45),
text_description varchar(45),
html_desciption varchar(45),
image varchar(45)
);

create table products (
product_code varchar(45),
product_name varchar(45),
product_line varchar(45),
product_scale varchar(45),
product_vendor varchar(45),
product_desciption varchar(45),
quantity_in_stock float,
buy_price float,
MSRP varchar(45)
);

insert into products
value
('1','nokia','asdf','adsf','ererw','sfdgsd', 84,45,'dsf'),
('2','realme','a','b','c','e',73.4,23,'gg');
select product_code, product_name, buy_price, quantity_in_stock from products
where buy_price > 56.76 and quantity_in_stock > 10;

SELECT product_code,product_name, buy_price, text_description
FROM products
INNER JOIN productlines
ON products.product_line = productlines.product_line
WHERE buy_price > 56.76 AND buy_price < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast';

select id_product, name_product, buy_price, quantityln_stock, product_lines.id_product_line from products
inner join product_lines
on products.id_product_line = product_lines.id_product_line;
